package com.example.imagegen.network.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.imagegen.network.models.CacheEntity

@Database(entities = [CacheEntity::class], version = 1, exportSchema = false)
abstract class CacheDatabase : RoomDatabase() {
    abstract fun cacheDao(): CacheDao
}
