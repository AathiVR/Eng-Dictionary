package com.example.eng_dictionary.data.dto

data class WordItemDto(
    val meanings: List<MeaningDto>?=null,
    val phonetic: String? =null,
    val word: String? =null
)