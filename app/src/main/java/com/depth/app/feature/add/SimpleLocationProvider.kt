package com.depth.app.feature.add

import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import android.location.LocationManager

class SimpleLocationProvider(private val context: Context) {

    @SuppressLint("MissingPermission")
    fun getLocation(): Pair<Double, Double> {
        val lm = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val loc: Location? =
            lm.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                ?: lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)

        return if (loc != null) loc.latitude to loc.longitude else 0.0 to 0.0
    }
}
