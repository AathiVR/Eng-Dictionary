package com.example.eng_dictionary.domain.model

import com.example.eng_dictionary.domain.model.Definition


data class Meaning(
    val definition: Definition,
    val partOfSpeech: String
)