package com.example.practica_consumo.data.repository

import com.example.practica_consumo.data.mapper.toDomain
import com.example.practica_consumo.data.remote.api.CharacterApiService
import com.example.practica_consumo.domain.model.Character
import com.example.practica_consumo.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: CharacterApiService
) : CharacterRepository {

    override suspend fun getCharactersByName(name: String): List<Character> {
        return try {
            val response = api.getCharactersByName(name)
            response.results.map { it.toDomain() }
        } catch (e: Exception) {
            emptyList()
        }
    }
}
