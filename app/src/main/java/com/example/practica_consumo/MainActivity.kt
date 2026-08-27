package com.example.practica_consumo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.practica_consumo.ui.screens.CharacterScreen
import com.example.practica_consumo.ui.theme.Practica_ConsumoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practica_ConsumoTheme {
                CharacterScreen()
            }
        }
    }
}
