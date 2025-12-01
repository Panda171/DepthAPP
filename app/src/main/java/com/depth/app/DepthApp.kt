
package com.depth.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.depth.app.navigation.DepthNavGraph
import com.depth.app.ui.theme.DepthTheme

@Composable
fun DepthApp() {
    val navController = rememberNavController()
    DepthTheme {
        DepthNavGraph(navController = navController)
    }
}
