
package com.depth.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.depth.app.feature.home.HomeScreen

@Composable
fun DepthNavGraph(nav:NavHostController){
 NavHost(nav, startDestination=Screen.Home.route){
  composable(Screen.Home.route){ HomeScreen() }
 }
}
