package com.example.eng_dictionary.Presentation.HomeScreen

import com.example.eng_dictionary.domain.model.WordItem

data class MainState(
    val isLoading:Boolean =false,
    val searchWord:String="",
    val wordItem: WordItem?=null
)
