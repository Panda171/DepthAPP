package com.depth.app.feature.add

import android.Manifest
import android.app.Activity
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.depth.app.domain.model.FishingSpot
import kotlinx.coroutines.launch

@Composable
fun AddCatchScreen(
    navController: NavHostController,
    viewModel: AddViewModel = hiltViewModel()
) {
    val ctx = LocalContext.current
    val scope = rememberCoroutineScope()
    val scroll = rememberScrollState()

    var fishType by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var length by remember { mutableStateOf("") }
    var bait by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }

    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val pickImage = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri -> imageUri = uri }

    var lat by remember { mutableStateOf(0.0) }
    var lon by remember { mutableStateOf(0.0) }

    var showRationale by remember { mutableStateOf(false) }

    val locationPermission = Manifest.permission.ACCESS_FINE_LOCATION

    val requestLocation = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) {
            val loc = SimpleLocationProvider(ctx).getLocation()
            lat = loc.first
            lon = loc.second
        }
    }

    if (showRationale) {
        AlertDialog(
            onDismissRequest = { showRationale = false },
            title = { Text("Разрешение на геолокацию") },
            text = { Text("Приложению нужно разрешение, чтобы определить место поимки рыбы.") },
            confirmButton = {
                TextButton(onClick = {
                    showRationale = false
                    requestLocation.launch(locationPermission)
                }) { Text("Разрешить") }
            },
            dismissButton = {
                TextButton(onClick = { showRationale = false }) { Text("Отмена") }
            }
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(scroll),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Добавить точку поимки", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(16.dp))

        if (imageUri != null) {
            Image(
                painter = rememberAsyncImagePainter(imageUri),
                contentDescription = null,
                modifier = Modifier.size(180.dp)
            )
        }
        Button(
            onClick = { pickImage.launch("image/*") },
            modifier = Modifier.fillMaxWidth()
        ) { Text("Добавить фото") }

        Spacer(Modifier.height(16.dp))

        OutlinedTextField(
            value = fishType,
            onValueChange = { fishType = it },
            label = { Text("Вид рыбы") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = weight,
            onValueChange = { weight = it },
            label = { Text("Вес (кг)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = length,
            onValueChange = { length = it },
            label = { Text("Длина (см)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = bait,
            onValueChange = { bait = it },
            label = { Text("Приманка") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Описание") },
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
        )

        Spacer(Modifier.height(16.dp))
        Text("Координаты: $lat, $lon")

        Button(
            onClick = {
                val activity = ctx as Activity
                if (ActivityCompat.shouldShowRequestPermissionRationale(activity, locationPermission)) {
                    showRationale = true
                } else {
                    requestLocation.launch(locationPermission)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) { Text("Получить координаты") }

        Spacer(Modifier.height(24.dp))

        Button(
            onClick = {
                scope.launch {
                    val now = System.currentTimeMillis()
                    val spot = FishingSpot(
                        id = 0L,
                        name = fishType.ifEmpty { "Поимка" },
                        latitude = lat,
                        longitude = lon,
                        description = description,
                        createdAt = now
                    )
                    viewModel.saveCatchSpot(spot)
                    navController.popBackStack()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) { Text("Сохранить поимку") }
    }
}
