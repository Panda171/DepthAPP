package com.depth.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "depth_points")
data class DepthPointEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val lakeId: Long?,
    val latitude: Double,
    val longitude: Double,
    val depth: Float,
    val authorId: Long,
    val createdAt: Long
)
