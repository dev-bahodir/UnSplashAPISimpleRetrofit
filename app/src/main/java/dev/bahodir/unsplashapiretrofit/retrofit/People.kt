package dev.bahodir.unsplashapiretrofit.retrofit

import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.http.GET

interface People {

    @GET(value = "search/photos?query=people&client_id=wwRohhLYetOncoEqe7euGhxnL4KaPC15oMNImMQ4o2k")
    fun getPeople(): Call<UnSplashAPIUser>
}