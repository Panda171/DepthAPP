package com.depth.app.domain.model

data class DepthPoint(
    val id: Long,
    val lakeId: Long?,
    val latitude: Double,
    val longitude: Double,
    val depth: Float,
    val authorId: Long,
    val createdAt: Long
)
