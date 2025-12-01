
package com.depth.app.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.depth.app.navigation.DepthNavGraph
import com.depth.app.ui.theme.DepthTheme

@Composable
fun DepthApp(){
 val nav=rememberNavController()
 DepthTheme{ DepthNavGraph(nav) }
}
