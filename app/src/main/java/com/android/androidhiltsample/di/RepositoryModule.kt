package com.android.androidhiltsample.di

import com.android.androidhiltsample.repository.MainRepository
import com.android.androidhiltsample.retrofit.BlogRetrofit
import com.android.androidhiltsample.retrofit.NetworkMapper
import com.android.androidhiltsample.room.BlogDao
import com.android.androidhiltsample.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        blogRetrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao, blogRetrofit, cacheMapper, networkMapper)
    }
}