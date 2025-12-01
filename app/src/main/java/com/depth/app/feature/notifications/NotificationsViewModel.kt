package com.depth.app.feature.notifications

import androidx.lifecycle.ViewModel
import com.depth.app.domain.model.AppNotification
import com.depth.app.domain.model.NotificationType
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel для работы с уведомлениями.
 *
 * Сейчас здесь демо-уведомления, в будущем можно подключить сервер/Room.
 */
@HiltViewModel
class NotificationsViewModel @Inject constructor() : ViewModel() {

    // Список уведомлений
    private val _notifications = MutableStateFlow<List<AppNotification>>(emptyList())
    val notifications: StateFlow<List<AppNotification>> = _notifications.asStateFlow()

    // Количество непрочитанных (для badge на иконке)
    private val _unreadNotifications = MutableStateFlow(0)
    val unreadNotifications: StateFlow<Int> = _unreadNotifications.asStateFlow()

    init {
        // Демо-уведомление о том, что обновлены глубины на конкретном участке
        val demo = AppNotification(
            id = 1L,
            type = NotificationType.DEPTH_UPDATED,
            title = "Обновлены глубины",
            message = "Пользователь Иван добавил новые глубины на водоёме.",
            lat = 55.751244,
            lon = 37.618423,
            timestamp = System.currentTimeMillis()
        )
        _notifications.value = listOf(demo)
        _unreadNotifications.value = _notifications.value.size
    }

    fun markAllRead() {
        _unreadNotifications.value = 0
    }
}
