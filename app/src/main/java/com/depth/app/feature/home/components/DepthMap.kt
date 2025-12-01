
package com.depth.app.feature.home.components

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import org.maplibre.android.maps.MapView
import org.maplibre.android.MapLibre
import org.maplibre.android.constants.WellKnownTileServer

@Composable
fun DepthMap(modifier: Modifier = Modifier) {
    val ctx = LocalContext.current

    MapLibre.getInstance(
        ctx,
        "dummy-key",
        WellKnownTileServer.MapLibre
    )

    AndroidView(
        modifier = modifier,
        factory = {
            MapView(ctx).apply {
                onCreate(Bundle())
                getMapAsync { map ->
                    map.setStyle("https://demotiles.maplibre.org/style.json")
                }
            }
        }
    )
}
