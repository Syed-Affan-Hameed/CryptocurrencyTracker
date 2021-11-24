package com.plcoding.cryptocurrencyappyt.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.plcoding.cryptocurrencyappyt.domain.model.Coin

data class  CoinDto(
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_active")
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

//function to map CoinDto to Coin

fun CoinDto.toCoin(): Coin {
        val c=Coin(id=id,isActive=isActive,name=name,rank=rank, symbol=symbol)
    return c

}