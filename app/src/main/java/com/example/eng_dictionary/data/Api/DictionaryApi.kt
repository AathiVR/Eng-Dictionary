package com.example.eng_dictionary.data.Api

import com.example.eng_dictionary.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("{word}")
    suspend fun getWordResult(
        @Path("word") word:String
    ):WordResultDto?

    companion object{
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/"
    }

}