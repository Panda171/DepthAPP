package com.depth.app.domain.model

data class Story(
    val id: Long,
    val user: User,
    val imageUrl: String?,
    val createdAt: Long,
    val spot: FishingSpot?
)
