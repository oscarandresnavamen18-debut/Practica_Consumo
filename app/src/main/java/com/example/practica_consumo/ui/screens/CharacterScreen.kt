package com.example.practica_consumo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.practica_consumo.ui.sections.CharacterListSection
import com.example.practica_consumo.ui.viewmodel.CharacterViewModel

@Composable
fun CharacterScreen(
    viewModel: CharacterViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getCharactersByName("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Personajes Rick and Morty"
        )

        Button(
            onClick = {
                viewModel.getCharactersByName("Rick Sanchez")
            }
        ) {
            Text(
                text = "Buscar Rick Sanchez"
            )
        }

        CharacterListSection(
            isLoading = uiState.isLoading,
            characters = uiState.characters,
            errorMessage = uiState.errorMessage
        )
    }
}
