package com.depth.app.data.repository

import com.depth.app.data.local.dao.DepthDao
import com.depth.app.data.local.dao.SubscriptionDao
import com.depth.app.data.local.entity.DepthPointEntity
import com.depth.app.data.local.entity.SubscriptionEntity
import com.depth.app.domain.model.DepthPoint
import com.depth.app.domain.model.DepthPointWithAccess
import com.depth.app.domain.repository.DepthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

class DepthRepositoryImpl @Inject constructor(
    private val depthDao: DepthDao,
    private val subscriptionDao: SubscriptionDao
) : DepthRepository {

    override fun getDepthsForLakeWithAccess(
        lakeId: Long?,
        currentUserId: Long
    ): Flow<List<DepthPointWithAccess>> {
        val depthsFlow = depthDao.getDepthsForLake(lakeId)
        val subsFlow = subscriptionDao.getSubscriptions(currentUserId)

        return combine(depthsFlow, subsFlow) { depthEntities, subsEntities ->
            val subscribedAuthors: Set<Long> = subsEntities.map { it.targetId }.toSet()
            depthEntities.map { entity ->
                val domain = entity.toDomain()
                DepthPointWithAccess(
                    point = domain,
                    isLocked = domain.authorId !in subscribedAuthors
                )
            }
        }
    }

    override suspend fun addDepthPoint(point: DepthPoint) {
        depthDao.insertDepth(point.toEntity())
    }

    private fun DepthPointEntity.toDomain() = DepthPoint(
        id = id,
        lakeId = lakeId,
        latitude = latitude,
        longitude = longitude,
        depth = depth,
        authorId = authorId,
        createdAt = createdAt
    )

    private fun DepthPoint.toEntity() = DepthPointEntity(
        id = if (id == 0L) 0L else id,
        lakeId = lakeId,
        latitude = latitude,
        longitude = longitude,
        depth = depth,
        authorId = authorId,
        createdAt = createdAt
    )
}
