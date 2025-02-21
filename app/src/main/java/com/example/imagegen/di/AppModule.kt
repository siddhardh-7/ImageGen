package com.example.imagegen.di

import android.content.Context
import androidx.room.Room
import com.example.imagegen.network.local.CacheDao
import com.example.imagegen.network.local.CacheDatabase
import com.example.imagegen.network.local.CacheRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlin.jvm.java

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): CacheDatabase {
        return Room.databaseBuilder(
            appContext,
            CacheDatabase::class.java,
            "cache_database"
        ).build()
    }
    @Provides
    @Singleton
    fun provideDao(cacheDatabase: CacheDatabase) : CacheDao{
        return cacheDatabase.cacheDao()
    }
    @Provides
    @Singleton
    fun provideCacheRepository(cacheDao: CacheDao): CacheRepository {
        return CacheRepository(cacheDao)
    }
}