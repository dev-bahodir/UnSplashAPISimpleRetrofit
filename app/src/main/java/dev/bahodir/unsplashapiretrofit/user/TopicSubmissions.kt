package dev.bahodir.unsplashapiretrofit.user

import com.fasterxml.jackson.annotation.JsonProperty

data class TopicSubmissions(
    @JsonProperty("current-events")
    var current_events: CurrentEvents,
    var nature: Nature,
    @JsonProperty("textures-patterns")
    var textures_patterns: TexturesPatterns,
    var wallpapers: Wallpapers
)