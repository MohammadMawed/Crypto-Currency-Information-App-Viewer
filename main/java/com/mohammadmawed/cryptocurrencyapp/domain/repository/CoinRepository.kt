package com.mohammadmawed.cryptocurrencyapp.domain.repository

import com.mohammadmawed.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.mohammadmawed.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}