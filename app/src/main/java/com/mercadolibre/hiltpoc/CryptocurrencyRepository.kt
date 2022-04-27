package com.mercadolibre.hiltpoc

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}
