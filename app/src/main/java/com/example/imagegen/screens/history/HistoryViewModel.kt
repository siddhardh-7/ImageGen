package com.example.imagegen.screens.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imagegen.network.local.CacheRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HistoryViewModel @Inject constructor(val cacheRepository : CacheRepository): ViewModel() {

    private val _imageList = MutableStateFlow<List<String>>(listOf())
    val imageList = _imageList.asStateFlow()

    init {
        getImageList()
    }

    private fun getImageList(){
        viewModelScope.launch {
            _imageList.value = cacheRepository.getCacheList()
        }
    }

    fun clearList(){
        viewModelScope.launch {
            cacheRepository.clearCache()
            _imageList.value = listOf()
        }
    }
}