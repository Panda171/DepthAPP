package com.depth.app.feature.profile

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ProfileUser(
    val fullName: String = "Иван Петров",
    val nickname: String = "@ivan_depth",
    val avatarUrl: String? = null,
    val catches: Int = 12,
    val depths: Int = 4,
    val friends: Int = 29
)

@HiltViewModel
class ProfileViewModel @Inject constructor() : ViewModel() {
    private val _user = MutableStateFlow(ProfileUser())
    val user: StateFlow<ProfileUser> = _user.asStateFlow()
}
