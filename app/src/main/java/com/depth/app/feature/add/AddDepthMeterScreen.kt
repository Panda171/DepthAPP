package com.depth.app.feature.add

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun AddDepthMeterScreen() {

    var depth by remember { mutableStateOf("") }
    var lat by remember { mutableStateOf("") }
    var lng by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text("Добавление глубины с глубиномера")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = depth,
            onValueChange = { depth = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Глубина (м)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = lat,
            onValueChange = { lat = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Широта") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = lng,
            onValueChange = { lng = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Долгота") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                // TODO: обработка
            }
        ) {
            Text("Добавить глубину")
        }
    }
}
