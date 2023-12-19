package com.example.w2c.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.w2c.R

@Composable
fun ProfileScreen(){
    var isCardClicked by remember { mutableStateOf(false) }
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
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
            Text(text = "Чаувбаев Бекзат", fontWeight = FontWeight.W500, fontSize = 17.sp)
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Text(text = "20 лет",  fontSize = 12.sp, fontWeight = FontWeight.Light)
        }
        Spacer(modifier = Modifier.height(15.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column {
                Row() {
                    Image(painterResource(id = R.drawable._icon__logo_facebook_), contentDescription = "" ,
                        Modifier
                            .height(25.dp)
                            .width(25.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(painterResource(id = R.drawable._icon__logo_instagram_), contentDescription = "",
                        Modifier
                            .height(25.dp)
                            .width(25.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Image(painterResource(id = R.drawable._icon__logo_twitter_), contentDescription = "" ,
                        Modifier
                            .height(25.dp)
                            .width(25.dp))
                }
            }

        }

        Row {
            Spacer(modifier = Modifier.height(40.dp))
        }
        // _____________________________________________________________________________
        // О себе
        Row {
            ScrollInfo(name = "O себе", info = "About you")
        }

        // Плохие привычки
        Row {
            ScrollInfo(name = "O себе", info = "About you")
        }

        // Интересы
        Row {
            ScrollInfo(name = "O себе", info = "About you")
        }
        Row {
            ScrollInfo(name = "O себе", info = "About you")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ScrollInfo(name: String, info: String){
    var isCardClicked by remember { mutableStateOf(false) }
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
        .animateContentSize()
        .clickable {
            isCardClicked = !isCardClicked
        },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 5.dp) ) {
        Box{
            Row(modifier = Modifier.padding(15.dp)) {
                Text(text = "$name")
            }
        }
        Row(modifier = Modifier.padding(10.dp)) {


            AnimatedVisibility(
                visible = isCardClicked,
                enter = fadeIn(animationSpec = tween(300))
            ) {

                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "$info",
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    letterSpacing = 0.5.sp,
                    color = Color.Black,
                )
            }
        }
    }
}