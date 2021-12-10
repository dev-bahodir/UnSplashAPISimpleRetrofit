package dev.bahodir.unsplashapiretrofit.user

data class Source(
    var ancestry: Ancestry,
    var cover_photo: CoverPhoto,
    var description: String,
    var meta_description: String,
    var meta_title: String,
    var subtitle: String,
    var title: String
)