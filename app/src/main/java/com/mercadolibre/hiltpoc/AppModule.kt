package com.mercadolibre.hiltpoc

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * App module
 *
 * @constructor Create empty App module
 */
@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    /**
     * Provide cryptocurrency repository
     *
     * @return
     */
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository(): CryptocurrencyRepository = CryptocurrencyRepositoryImpl()
}
