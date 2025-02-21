package com.example.imagegen.network.api

import com.example.imagegen.network.models.GenerateDogData
import retrofit2.http.GET

interface ApiService {
    @GET("api/breeds/image/random")
    suspend fun getRandomDog(): GenerateDogData
}