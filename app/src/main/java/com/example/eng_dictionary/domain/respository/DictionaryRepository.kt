package com.example.eng_dictionary.domain.respository

import com.example.eng_dictionary.domain.model.WordItem
import com.example.eng_dictionary.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}