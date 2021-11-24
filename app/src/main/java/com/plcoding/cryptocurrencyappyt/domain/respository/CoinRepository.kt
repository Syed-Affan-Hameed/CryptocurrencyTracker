package com.plcoding.cryptocurrencyappyt.domain.respository

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailsDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId :String):CoinDetailsDto

}