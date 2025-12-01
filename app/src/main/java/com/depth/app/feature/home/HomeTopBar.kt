package com.depth.app.feature.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar() {
    TopAppBar(
        title = { Text("Depth") },
        actions = {
            IconButton(onClick = { /* TODO: открыть уведомления */ }) {
                Icon(Icons.Default.Notifications, contentDescription = "Уведомления")
            }
            IconButton(onClick = { /* TODO: открыть настройки */ }) {
                Icon(Icons.Default.Settings, contentDescription = "Настройки")
            }
        }
    )
}
