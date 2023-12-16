package com.example.w2c.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


import androidx.compose.ui.unit.dp
import com.example.w2c.model.Events



import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.Spring.DampingRatioLowBouncy
import androidx.compose.animation.core.Spring.StiffnessVeryLow
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.sizeIn

import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.TopAppBar

import androidx.compose.material3.CardDefaults

import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.w2c.R
import coil.compose.rememberImagePainter
import com.example.w2c.model.eventslist


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun EventScreen(
    events: List<Events>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
) {
    val visibleState = remember {
        MutableTransitionState(false).apply {
            // Start the animation immediately.
            targetState = true
        }
    }
    Column {


        TopAppBar(
            title = {
                Text(
                    text = "Мероприятия",
                    color = Color.White // Цвет текста
                )
            },
            backgroundColor = colorResource(id = R.color.primaryColor) // Цвет фона AppBar
        )


    AnimatedVisibility(
        visibleState = visibleState,
        enter = fadeIn(
            animationSpec = spring(dampingRatio = DampingRatioLowBouncy)
        ),
        exit = fadeOut(),
        modifier = modifier
    ) {



        LazyColumn(contentPadding = contentPadding) {
            itemsIndexed(eventslist) { index, events ->
                EventsListItem(
                    events = events,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        // Animate each list item to slide in vertically
                        .animateEnterExit(
                            enter = slideInVertically(
                                animationSpec = spring(
                                    stiffness = StiffnessVeryLow,
                                    dampingRatio = DampingRatioLowBouncy
                                ),
                                initialOffsetY = { it * (index + 1) } // staggered entrance
                            )
                        )
                )
            }
        }
        }
    }
}


@Composable
fun EventsListItem(
    events: Events,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = modifier,
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = rememberImagePainter(data = events.img),
                contentDescription = null, // Описание изображения
                contentScale = ContentScale.Crop, // Масштабирование изображения
                modifier = Modifier
                    .height(221.dp) // Высота изображения
                    .fillMaxWidth() // Заполнение ширины
            )
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = events.title,
                    style = MaterialTheme.typography.titleLarge
                )
                Text(
                    text = events.location + ", " + events.time,
                    style = MaterialTheme.typography.titleSmall
                )
                // Добавьте другие текстовые поля для отображения остальных данных о событии
            }
        }
    }
}


