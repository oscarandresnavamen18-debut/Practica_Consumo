package com.example.practica_consumo.data.remote.api

import com.example.practica_consumo.data.remote.dto.CharacterResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterApiService {

    @GET("character")
    suspend fun getCharactersByName(
        @Query("name") name: String
    ): CharacterResponseDto
}