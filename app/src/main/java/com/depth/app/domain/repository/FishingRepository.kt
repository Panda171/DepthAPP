package com.depth.app.domain.repository

import com.depth.app.domain.model.FishingSpot
import com.depth.app.domain.model.Story
import kotlinx.coroutines.flow.Flow

interface FishingRepository {
    fun getFishingSpots(): Flow<List<FishingSpot>>
    suspend fun addFishingSpot(spot: FishingSpot)
    fun getStories(): Flow<List<Story>>
}
