package com.depth.app.data.repository

import com.depth.app.data.local.dao.FishingSpotDao
import com.depth.app.data.local.entity.FishingSpotEntity
import com.depth.app.domain.model.FishingSpot
import com.depth.app.domain.model.Story
import com.depth.app.domain.model.User
import com.depth.app.domain.repository.FishingRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class FishingRepositoryImpl @Inject constructor(
    private val fishingSpotDao: FishingSpotDao
) : FishingRepository {

    override fun getFishingSpots(): Flow<List<FishingSpot>> {
        return fishingSpotDao.getAllSpots().map { entities ->
            entities.map { it.toDomain() }
        }
    }

    override suspend fun addFishingSpot(spot: FishingSpot) {
        fishingSpotDao.insertSpot(spot.toEntity())
    }

    override fun getStories(): Flow<List<Story>> {
        val fakeUser = User(
            id = 1L,
            name = "Иван Рыбак",
            avatarUrl = null
        )

        return flow {
            emit(
                listOf(
                    Story(
                        id = 1L,
                        user = fakeUser,
                        imageUrl = null,
                        createdAt = System.currentTimeMillis(),
                        spot = null
                    )
                )
            )
        }
    }

    private fun FishingSpotEntity.toDomain(): FishingSpot = FishingSpot(
        id = id,
        name = name,
        latitude = latitude,
        longitude = longitude,
        description = description,
        createdAt = createdAt
    )

    private fun FishingSpot.toEntity(): FishingSpotEntity = FishingSpotEntity(
        id = if (id == 0L) 0L else id,
        name = name,
        latitude = latitude,
        longitude = longitude,
        description = description,
        createdAt = createdAt
    )
}
