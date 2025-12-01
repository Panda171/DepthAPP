
package com.depth.app.feature.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.depth.app.feature.home.components.DepthMap

@Composable
fun HomeScreen(){
 Scaffold { pad ->
   DepthMap()
 }
}
