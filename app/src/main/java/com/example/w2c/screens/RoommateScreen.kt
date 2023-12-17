package com.example.w2c.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RoommateScreen(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "Roommate Screen",
            fontSize = 22.sp)

    }
}