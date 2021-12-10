package dev.bahodir.unsplashapiretrofit.retrofit

import dev.bahodir.unsplashapiretrofit.user.UnSplashAPIUser
import retrofit2.Call
import retrofit2.http.GET

interface Wallpapers {

    @GET(value = "search/photos?query=wallpapers&client_id=wwRohhLYetOncoEqe7euGhxnL4KaPC15oMNImMQ4o2k")
    fun getWallpapers(): Call<UnSplashAPIUser>
}