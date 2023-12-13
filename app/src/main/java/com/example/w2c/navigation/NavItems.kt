package com.example.w2c.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.w2c.R

data class NavItems(
    val label: String,
    val icon: Int,
    val route: String
)

val listOfNavItems = listOf(
    NavItems(
        label = "Home",
        icon = R.drawable.home_btn,
        route = Screens.HomeScreen.name
    ),
    NavItems(
        label = "Roommate",
        icon = R.drawable.people_btn,
        route = Screens.RoommateScreen.name
    ),
    NavItems(
        label = "Chat",
        icon = R.drawable.chat_btn,
        route = Screens.

        ChatScreen.name
    ),
    NavItems(
        label = "Event",
        icon = R.drawable.event_btn,
        route = Screens.EventScreen.name
    ),
    NavItems(
        label = "Profile",
        icon = R.drawable.profile_btn,
        route = Screens.ProfileScreen.name
    )
)