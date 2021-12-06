package com.furkankurt.retrofitcoroutinesbtclist.service

import com.furkankurt.retrofitcoroutinesbtclist.model.CryptoModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
interface CryptoAPI {
    @GET("prices?key=292247011d37d421fed405ba83972d16")
    suspend fun getData(): Response<List<CryptoModel>>
}