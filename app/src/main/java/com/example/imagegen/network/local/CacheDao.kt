package com.example.imagegen.network.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.imagegen.network.models.CacheEntity

@Dao
interface CacheDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(cacheEntity: CacheEntity)

    @Query("SELECT * FROM cache_table")
    suspend fun getItems() : List<CacheEntity>

    @Query("DELETE FROM cache_table WHERE imageUrl = (SELECT imageUrl FROM cache_table ORDER BY lastAccessed ASC LIMIT 1)")
    suspend fun removeLeastRecentlyUsed()

    @Query("SELECT COUNT(*) FROM cache_table")
    suspend fun getCacheSize(): Int

    @Query("DELETE FROM cache_table")
    suspend fun clearCache()

    @Transaction
    suspend fun addToCache(cacheEntity: CacheEntity) {
        val size = getCacheSize()
        if (size >= 20) {
            removeLeastRecentlyUsed()
        }
        insertOrUpdate(cacheEntity)
    }
}
