package dev.bahodir.unsplashapiretrofit.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APIClient {
    private const val BASE_URL = "https://api.unsplash.com/"

    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}