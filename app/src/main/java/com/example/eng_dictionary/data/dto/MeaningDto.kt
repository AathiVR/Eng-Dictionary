package com.example.eng_dictionary.data.dto

data class MeaningDto(
    val definitions: List<DefinitionDto>? =null,
    val partOfSpeech: String? =null,
)