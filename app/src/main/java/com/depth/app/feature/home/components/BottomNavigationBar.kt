
package com.depth.app.feature.home.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Add
import com.depth.app.navigation.Screen

@Composable
fun BottomNavigationBar(selectedRoute:String, onItemSelected:(String)->Unit){
    NavigationBar {
        NavigationBarItem(
            selected = selectedRoute == Screen.Home.route,
            onClick = { onItemSelected(Screen.Home.route) },
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Главная") }
        )
        NavigationBarItem(
            selected = selectedRoute == Screen.Add.route,
            onClick = { onItemSelected(Screen.Add.route) },
            icon = { Icon(Icons.Default.Add, contentDescription = null) },
            label = { Text("Добавить") }
        )
        NavigationBarItem(
            selected = selectedRoute == Screen.Profile.route,
            onClick = { onItemSelected(Screen.Profile.route) },
            icon = { Icon(Icons.Default.Person, contentDescription = null) },
            label = { Text("Профиль") }
        )
    }
}
