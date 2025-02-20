package com.example.imagegen.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(
    toDetailsScreen : () -> Unit,
    toHistoryScreen : () -> Unit,
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                toDetailsScreen()
            }
        ) {
            Text("Detail")
        }
        Button(
            onClick = {
                toHistoryScreen()
            }
        ) {
            Text("History")
        }
    }
}