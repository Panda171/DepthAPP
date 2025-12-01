package com.depth.app.domain.model

/**
 * Модель уведомления внутри приложения.
 * type позволяет определить, что делать при нажатии:
 *  - DEPTH_UPDATED  — кто-то обновил карту глубин (есть координаты)
 *  - FRIEND_JOINED  — новый друг
 *  - NEW_STORY      — новая сторис
 *  - OTHER          — прочее
 */
data class AppNotification(
    val id: Long,
    val type: NotificationType,
    val title: String,
    val message: String,
    val lat: Double? = null,
    val lon: Double? = null,
    val depthId: Long? = null,
    val timestamp: Long
)

enum class NotificationType {
    DEPTH_UPDATED,
    FRIEND_JOINED,
    NEW_STORY,
    OTHER
}
