package com.depth.app.feature.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.depth.app.domain.model.DepthPoint
import com.depth.app.domain.model.FishingSpot
import com.depth.app.domain.repository.DepthRepository
import com.depth.app.domain.repository.FishingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class AddViewModel @Inject constructor(
    private val fishingRepository: FishingRepository,
    private val depthRepository: DepthRepository
) : ViewModel() {

    fun saveCatchSpot(spot: FishingSpot) {
        viewModelScope.launch {
            fishingRepository.addFishingSpot(spot)
        }
    }

    fun saveDepthPoint(point: DepthPoint) {
        viewModelScope.launch {
            depthRepository.addDepthPoint(point)
        }
    }
}
