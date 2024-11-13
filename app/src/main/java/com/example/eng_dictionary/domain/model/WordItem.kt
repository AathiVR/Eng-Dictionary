package com.example.eng_dictionary.domain.model

import com.example.eng_dictionary.domain.model.Meaning


data class WordItem(
    val word: String,
    val meanings: List<Meaning>,
    val phonetic: String
)