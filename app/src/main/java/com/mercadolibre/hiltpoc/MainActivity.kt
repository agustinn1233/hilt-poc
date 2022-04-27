package com.mercadolibre.hiltpoc

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeCryptoCurrency()
    }

    private fun observeCryptoCurrency() {
        viewModel.cryptoCurrency.observe(this) {
            viewModel.cryptoCurrency.observe(this) {
                val cryptocurrencyList = findViewById<RecyclerView>(R.id.cryptocurrency_list)
                cryptocurrencyList.layoutManager = LinearLayoutManager(this)
                cryptocurrencyList.adapter = CryptocurrencyAdapter(it)
            }
        }
    }
}

