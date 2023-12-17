package com.example.w2c.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w2c.R

@Composable
fun ProfileScreen(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp), horizontalArrangement = Arrangement.End
        ) {
            Image(
                painterResource(id = R.drawable.settings),
                contentDescription = "settings button"
            )
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Card(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp),
                shape = RoundedCornerShape(15.dp),

                ) {
                Image(painterResource(id = R.drawable.beka) , contentDescription = "raionski bandit",
                    modifier = Modifier
                        .fillMaxSize() // Заполняем всю доступную область
                        .clip(RoundedCornerShape(15.dp)), // Закругляем углы изображения
                    contentScale = ContentScale.Crop,
                )

            }
        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Text(text = "Chauvbayev Bekzat", fontWeight = FontWeight.Bold, fontSize = 17.sp)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Text(text = "20 лет", fontWeight = FontWeight.Bold, fontSize = 12.sp)
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column {
                Row() {
                    Image(painterResource(id = R.drawable.icons_whatsapp), contentDescription = "")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(painterResource(id = R.drawable.icons_telegram), contentDescription = "")
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(painterResource(id = R.drawable.icons_instagram), contentDescription = "")
                }
            }

        }

        Row {
            Spacer(modifier = Modifier.height(40.dp))
        }
        // _____________________________________________________________________________
        // О себе
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ) {
                Box{
                    Row(modifier = Modifier.padding(15.dp)) {
                        Text(text = "О себе")
                    }
                }
            }
        }

        // Плохие привычки
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ) {
                Box{
                    Row(modifier = Modifier.padding(15.dp)) {
                        Text(text = "Плохие привычки")
                    }
                }
            }
        }

        // Интересы
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ) {
                Box{
                    Row(modifier = Modifier.padding(15.dp)) {
                        Text(text = "Интересы")
                    }
                }
            }
        }
        Row {
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ) {
                Box{
                    Row(modifier = Modifier.padding(15.dp)) {
                        Text(text = "Интересы")
                    }
                }
            }
        }
    }
}