package dev.bahodir.unsplashapiretrofit.retrofit

import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.http.GET

interface Nature {

    @GET(value = "search/photos?query=nature&client_id=wwRohhLYetOncoEqe7euGhxnL4KaPC15oMNImMQ4o2k")
    fun getNature(): Call<UnSplashAPIUser>
}