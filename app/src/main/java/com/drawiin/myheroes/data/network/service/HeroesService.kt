package com.drawiin.myheroes.data.network.service

import com.drawiin.myheroes.data.network.model.response.GetHeroesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface HeroesService {

    @GET("characters")
    suspend fun getCharacters(
        @Query("apikey") apiKey: String,
        @Query("hash") hash: String,
        @Query("ts") timeStamp: Int,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): GetHeroesResponse
}