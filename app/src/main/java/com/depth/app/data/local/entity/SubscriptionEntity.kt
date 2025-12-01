package com.depth.app.data.local.entity

import androidx.room.Entity

@Entity(
    tableName = "subscriptions",
    primaryKeys = ["followerId", "targetId"]
)
data class SubscriptionEntity(
    val followerId: Long,
    val targetId: Long
)
