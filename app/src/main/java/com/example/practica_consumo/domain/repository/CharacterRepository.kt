package com.example.practica_consumo.domain.repository

import com.example.practica_consumo.domain.model.Character

interface CharacterRepository {
    suspend fun getCharactersByName(name: String): List<Character>
}
