package com.example.imagegen.network.local

import com.example.imagegen.network.models.CacheEntity
import javax.inject.Inject

class CacheRepository @Inject constructor(private val cacheDao: CacheDao) {

    suspend fun putCache(imageUrl: String) {
        val cacheEntity = CacheEntity(imageUrl, System.currentTimeMillis())
        cacheDao.addToCache(cacheEntity)
    }

    suspend fun getCache(imageUrl: String): String? {
        return cacheDao.getFromCache(imageUrl)?.imageUrl
    }

    suspend fun getCacheList() : List<String> {
        return cacheDao.getItems().map { it.imageUrl }
    }

    suspend fun clearCache() {
        cacheDao.clearCache()
    }
}