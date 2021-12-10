package dev.bahodir.unsplashapiretrofit.user

data class Sponsorship(
    var impression_urls: List<Any>,
    var sponsor: Sponsor,
    var tagline: String,
    var tagline_url: String
)