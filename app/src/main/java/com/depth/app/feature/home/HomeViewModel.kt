package com.depth.app.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.depth.app.domain.model.DepthLayerState
import com.depth.app.domain.model.DepthPointWithAccess
import com.depth.app.domain.model.FishingSpot
import com.depth.app.domain.model.Story
import com.depth.app.domain.repository.DepthRepository
import com.depth.app.domain.repository.FishingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val fishingRepository: FishingRepository,
    private val depthRepository: DepthRepository
) : ViewModel() {

    private val _stories = MutableStateFlow<List<Story>>(emptyList())
    val stories: StateFlow<List<Story>> = _stories.asStateFlow()

    private val _spots = MutableStateFlow<List<FishingSpot>>(emptyList())
    val spots: StateFlow<List<FishingSpot>> = _spots.asStateFlow()

    private val _depthLayerState = MutableStateFlow(
        DepthLayerState(
            hasDepthData = true,
            isUnlocked = false
        )
    )
    val depthLayerState: StateFlow<DepthLayerState> = _depthLayerState.asStateFlow()

    private val _depthPoints = MutableStateFlow<List<DepthPointWithAccess>>(emptyList())
    val depthPoints: StateFlow<List<DepthPointWithAccess>> = _depthPoints.asStateFlow()

    private val currentUserId = 1L
    private val currentLakeId: Long? = null

    init {
        observeStories()
        observeSpots()
        observeDepths()
    }

    private fun observeStories() {
        viewModelScope.launch {
            fishingRepository.getStories().collectLatest { list ->
                _stories.value = list
            }
        }
    }

    private fun observeSpots() {
        viewModelScope.launch {
            fishingRepository.getFishingSpots().collectLatest { list ->
                _spots.value = list
            }
        }
    }

    private fun observeDepths() {
        viewModelScope.launch {
            depthRepository.getDepthsForLakeWithAccess(currentLakeId, currentUserId)
                .collectLatest { list ->
                    _depthPoints.value = list
                }
        }
    }

    fun unlockDepths() {
        _depthLayerState.value = _depthLayerState.value.copy(isUnlocked = true)
    }
}
