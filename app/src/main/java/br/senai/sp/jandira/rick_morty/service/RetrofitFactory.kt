package br.senai.sp.jandira.rick_morty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    //fica mais limpo para ler o código
    private val BASE_URL =" https://rickandmortyapi.com/api/ "
    //chama o retrofit
    private val RETROFIT_FACTORY = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        //adiciona o gson para converter
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getCharacterService(): CharacterService{
        return RETROFIT_FACTORY
            .create(CharacterService::class.java)
    }
}