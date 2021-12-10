package dev.bahodir.unsplashapiretrofit.user

data class CoverPhoto(
    var alt_description: String,
    var blur_hash: String,
    var categories: List<Any>,
    var color: String,
    var created_at: String,
    var current_user_collections: List<Any>,
    var description: Any,
    var height: Int,
    var id: String,
    var liked_by_user: Boolean,
    var likes: Int,
    var links: LinksXX,
    var promoted_at: Any,
    var sponsorship: Any,
    var topic_submissions: TopicSubmissions,
    var updated_at: String,
    var urls: Urls,
    var user: User,
    var width: Int
)