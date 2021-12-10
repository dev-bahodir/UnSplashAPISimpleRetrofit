package dev.bahodir.unsplashapiretrofit.user

data class Result(
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
    var links: Links,
    var promoted_at: Any,
    var sponsorship: Sponsorship,
    var tags: List<Tag>,
    var topic_submissions: TopicSubmissionsX,
    var updated_at: String,
    var urls: UrlsX,
    var user: UserX,
    var width: Int
)