package com.example.inventory.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.inventory.R

data class NavItems(
    val label: String,
    val icon: Int,
    val route: String,

    )

val listOfNavItems = listOf(
    NavItems(
        label = "Home",
        icon = R.drawable.home_01__1_ ,
        route = Screens.HomeScreen.name
        ),

    NavItems(
        label = "Chat",
        icon = R.drawable.message_more,
        route = Screens.ChatScreen.name
    ),
    NavItems(
        label = "Event",
        icon = R.drawable.calendar_week,
        route = Screens.EventScreen.name
    ),
    NavItems(
        label = "Profile",
        icon = R.drawable.circle_user_svgrepo_com_1,
        route = Screens.ProfileScreen.name
    )
)