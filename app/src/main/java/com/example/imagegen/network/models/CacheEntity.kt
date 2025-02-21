package com.example.imagegen.network.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "cache_table")
data class CacheEntity(
    @PrimaryKey(autoGenerate = false) val imageUrl: String,
    val lastAccessed: Long
)