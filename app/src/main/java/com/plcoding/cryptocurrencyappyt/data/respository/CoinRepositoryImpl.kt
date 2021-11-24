package com.plcoding.cryptocurrencyappyt.data.respository

import com.plcoding.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailsDto
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinPaprikaApi{
    override suspend fun getCoins(): List<CoinDto> {
       return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailsDto {
         return api.getCoinById(coinId)
    }
}