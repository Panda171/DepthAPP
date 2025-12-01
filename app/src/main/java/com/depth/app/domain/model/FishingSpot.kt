package com.depth.app.domain.model

data class FishingSpot(
    val id: Long,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val description: String?,
    val createdAt: Long
)
