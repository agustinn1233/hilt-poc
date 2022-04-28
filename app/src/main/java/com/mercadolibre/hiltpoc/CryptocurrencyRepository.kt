package com.mercadolibre.hiltpoc

/**
 * Cryptocurrency repository
 *
 * @constructor Create empty Cryptocurrency repository
 */
interface CryptocurrencyRepository {
    /**
     * Get crypto currency
     *
     * @return
     */
    fun getCryptoCurrency(): List<Cryptocurrency>
}
