package dev.bahodir.unsplashapiretrofit.user

data class UnSplashAPIUser(
    var results: List<Result>,
    var total: Int,
    var total_pages: Int
)