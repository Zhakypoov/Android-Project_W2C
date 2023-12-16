package com.example.w2c.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

import com.example.w2c.R
import com.example.w2c.model.eventslist

import com.example.w2c.screens.ChatScreen

import com.example.w2c.screens.HomeScreen
import com.example.w2c.screens.ProfileScreen
import com.example.w2c.screens.RoommateScreen
import com.example.w2c.screens.EventScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(){
   val navController: NavHostController = rememberNavController()

    Scaffold(

        bottomBar = {


            BottomNavigation(
                backgroundColor = colorResource(id = R.color.primaryColor),
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                listOfNavItems.forEach { navItems ->
                    BottomNavigationItem(
                        selected = currentDestination?.hierarchy?.any { it.route == navItems.route } == true,
                        onClick = {
                            navController.navigate(navItems.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        },
                        icon = {
                            Image(
                                painter = painterResource(id = navItems.icon),
                                contentDescription = null,
                                modifier = Modifier.size(30.dp)
                            )
                        },
                        selectedContentColor = Color.Black,
                        unselectedContentColor = Color.Gray
                    )
                }
            }

        }
    ) {
        paddingValues ->
        NavHost(navController = navController, startDestination = Screens.HomeScreen.name,
            modifier = Modifier.padding(paddingValues)){
             composable(route = Screens.HomeScreen.name){
                 HomeScreen()
             }
            composable(route = Screens.RoommateScreen.name){
                RoommateScreen()
            }
            composable(route = Screens.ChatScreen.name){
                ChatScreen()
            }
            composable(route = Screens.EventScreen.name){
                EventScreen(events = eventslist)
            }
            composable(route = Screens.ProfileScreen.name){
                ProfileScreen()
            }

        }
    }
}