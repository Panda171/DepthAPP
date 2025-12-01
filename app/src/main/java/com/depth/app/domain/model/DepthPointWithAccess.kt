package com.depth.app.domain.model

data class DepthPointWithAccess(
    val point: DepthPoint,
    val isLocked: Boolean
)
