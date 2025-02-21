package com.example.imagegen.screens.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imagegen.network.api.ApiService
import com.example.imagegen.network.local.CacheRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(private val apiService: ApiService, val cacheRepository : CacheRepository): ViewModel() {

    private val _image = MutableStateFlow("")
    val image = _image.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    fun generateImage(){
        viewModelScope.launch {
            try{
                _isLoading.value = true
                val response = apiService.getRandomDog()
                _image.value = response.message
                cacheRepository.putCache(response.message)
            }catch (e : Exception){

            }
        }
        _isLoading.value = false
    }
}