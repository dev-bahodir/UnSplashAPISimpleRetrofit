package dev.bahodir.unsplashapiretrofit.user

data class User(
    var accepted_tos: Boolean,
    var bio: String,
    var first_name: String,
    var for_hire: Boolean,
    var id: String,
    var instagram_username: String,
    var last_name: Any,
    var links: LinksXXX,
    var location: String,
    var name: String,
    var portfolio_url: String,
    var profile_image: ProfileImageX,
    var social: SocialX,
    var total_collections: Int,
    var total_likes: Int,
    var total_photos: Int,
    var twitter_username: String,
    var updated_at: String,
    var username: String
)