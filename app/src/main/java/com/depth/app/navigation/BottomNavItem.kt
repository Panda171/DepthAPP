package com.depth.app.navigation

import com.depth.app.R

sealed class BottomNavItem(
    val route: String,
    val label: String,
    val iconRes: Int
) {
    object Home : BottomNavItem("home", "Главная", R.drawable.ic_home)
    object Add : BottomNavItem("add_menu", "Добавить", R.drawable.ic_add)
    object Friends : BottomNavItem("friends", "Друзья", R.drawable.ic_friends)

    companion object {
        val items = listOf(Home, Add, Friends)
    }
}
