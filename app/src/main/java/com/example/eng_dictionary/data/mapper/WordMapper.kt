package com.example.eng_dictionary.data.mapper

import com.example.eng_dictionary.data.dto.DefinitionDto
import com.example.eng_dictionary.data.dto.MeaningDto
import com.example.eng_dictionary.data.dto.WordItemDto
import com.example.eng_dictionary.domain.model.Definition
import com.example.eng_dictionary.domain.model.Meaning
import com.example.eng_dictionary.domain.model.WordItem

fun WordItemDto.toWordItem()= WordItem(
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    }?: emptyList(),
    phonetic= phonetic ?: ""

)

fun MeaningDto.toMeaning()= Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech?:""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
)= Definition(


    definition = definitionDto?.definition ?:"",
    example = definitionDto?.example?:""

)