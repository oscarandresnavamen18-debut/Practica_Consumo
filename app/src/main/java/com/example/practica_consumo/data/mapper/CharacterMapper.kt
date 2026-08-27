package com.example.practica_consumo.data.mapper

import com.example.practica_consumo.data.remote.dto.CharacterDto
import com.example.practica_consumo.domain.model.Character

fun CharacterDto.toDomain(): Character {
    return Character(
        id = id,
        name = name,
        status = status,
        species = species,
        gender = gender,
        originName = origin.name,
        locationName = location.name,
        image = image
    )
}
