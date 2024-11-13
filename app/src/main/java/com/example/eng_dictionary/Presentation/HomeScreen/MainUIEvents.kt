package com.example.eng_dictionary.Presentation.HomeScreen

sealed class MainUIEvents {
    data class OnSearchWordChange(
        val newWord: String
    ) : MainUIEvents()

    object OnSearchCLick : MainUIEvents()

}