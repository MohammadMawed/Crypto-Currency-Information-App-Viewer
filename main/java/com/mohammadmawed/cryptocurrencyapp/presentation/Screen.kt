package com.mohammadmawed.cryptocurrencyapp.presentation

import androidx.compose.runtime.Composable

sealed class Screen(val route: String){
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
