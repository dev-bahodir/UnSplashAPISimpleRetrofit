package dev.bahodir.unsplashapiretrofit.retrofit

import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.http.GET

interface Fashion {

    @GET(value = "search/photos?query=fashion&client_id=wwRohhLYetOncoEqe7euGhxnL4KaPC15oMNImMQ4o2k")
    fun getFashion(): Call<UnSplashAPIUser>
}