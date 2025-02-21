package com.example.imagegen.screens.main

import android.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.imagegen.ui.theme.blue
import com.example.imagegen.ui.theme.white

@Composable
fun MainScreen(
    toDetailsScreen : () -> Unit,
    toHistoryScreen : () -> Unit,
){
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            "Welcome to Pub Pixels",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            "Fetch, Save & Relive the cutest dog moments",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = blue,
                contentColor = white
            ),
            onClick = {
                toDetailsScreen()
            }
        ) {
            Text("\uD83D\uDC15 Generate Dogs")
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = blue,
                contentColor = white
            ),
            onClick = {
                toHistoryScreen()
            }
        ) {
            Text("\uD83D\uDCF8 My Recent Dogs")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}