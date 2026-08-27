package com.example.practica_consumo.domain.usecase

import com.example.practica_consumo.domain.model.Character
import com.example.practica_consumo.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: CharacterRepository
) {

    suspend operator fun invoke(name: String): List<Character> {
        return repository.getCharactersByName(name)
    }
}
