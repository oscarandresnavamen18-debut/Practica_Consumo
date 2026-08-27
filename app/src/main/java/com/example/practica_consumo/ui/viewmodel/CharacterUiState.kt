package com.example.practica_consumo.ui.viewmodel

import com.example.practica_consumo.domain.model.Character

data class CharacterUiState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val errorMessage: String? = null
)
