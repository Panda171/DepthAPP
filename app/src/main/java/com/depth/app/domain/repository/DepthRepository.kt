package com.depth.app.domain.repository

import com.depth.app.domain.model.DepthPoint
import com.depth.app.domain.model.DepthPointWithAccess
import kotlinx.coroutines.flow.Flow

interface DepthRepository {
    fun getDepthsForLakeWithAccess(
        lakeId: Long?,
        currentUserId: Long
    ): Flow<List<DepthPointWithAccess>>

    suspend fun addDepthPoint(point: DepthPoint)
}
