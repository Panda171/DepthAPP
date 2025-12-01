
package com.depth.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val scheme = lightColorScheme(
 primary=DepthPrimary,
 onPrimary=DepthOnPrimary,
 background=DepthBackground,
 onBackground=DepthOnBackground
)

@Composable
fun DepthTheme(c:@Composable ()->Unit){
 MaterialTheme(colorScheme=scheme, content=c)
}
