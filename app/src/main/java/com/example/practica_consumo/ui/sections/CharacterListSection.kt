package com.example.practica_consumo.ui.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.practica_consumo.domain.model.Character
import com.example.practica_consumo.ui.components.CharacterCard
import com.example.practica_consumo.ui.components.ErrorView
import com.example.practica_consumo.ui.components.LoadingView

@Composable
fun CharacterListSection(
    isLoading: Boolean,
    characters: List<Character>,
    errorMessage: String?
) {
    when {
        isLoading -> {
            LoadingView()
        }

        errorMessage != null -> {
            ErrorView(message = errorMessage)
        }

        else -> {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(characters) { character ->
                    CharacterCard(character = character)
                }
            }
        }
    }
}
