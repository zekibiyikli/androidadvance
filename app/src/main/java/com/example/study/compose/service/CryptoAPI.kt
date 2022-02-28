package com.example.study.compose.service

import com.example.study.compose.model.Crypto
import com.example.study.compose.model.CryptoList
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {
    @GET("prices")
    suspend fun getCryptoList(@Query("key") key:String):List<CryptoList>

    @GET("currencies")
    suspend fun getCrypto(@Query("key") key:String,@Query("ids") ids:String,@Query("attributes") attributes:String):List<Crypto>
}