package dev.bahodir.unsplashapiretrofit.retrofit

import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.http.GET

interface Animals {

    @GET(value = "search/photos?query=animals&client_id=wwRohhLYetOncoEqe7euGhxnL4KaPC15oMNImMQ4o2k")
    fun getAnimals(): Call<UnSplashAPIUser>
}