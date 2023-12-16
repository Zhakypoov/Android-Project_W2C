package com.example.w2c.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w2c.R

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDE7F6)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth().fillMaxHeight().wrapContentHeight(),
            contentAlignment = Alignment.TopCenter,


        ) {
           Image(painter = painterResource(id = R.drawable.clouds), contentDescription =null, Modifier.fillMaxSize())
        }

        // Welcome text and door image
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.w2c),
                contentDescription = null)
            // You would have an Image composable here for the door
            // Image(painterResource(id = R.drawable.door), contentDescription = null)
            Text(
                "Welcome to the city",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }

        // Buttons for authorization and registration
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(onClick = { /* TODO: Handle click */ }) {
                Text("Авторизация")
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /* TODO: Handle click */ }) {
                Text("Регистрация")
            }
        }

        // City silhouette at the bottom
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            // You would have an Image composable here for the city silhouette
            // Image(painterResource(id = R.drawable.city_silhouette), contentDescription = null)
        }
    }
}

@Preview
@Composable
fun appPreview(){
    WelcomeScreen()
}