package com.example.w2c.navigation

import android.media.metrics.Event
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.w2c.R
import com.example.w2c.screens.ChatScreen
import com.example.w2c.screens.EventScreen
import com.example.w2c.screens.HomeScreen
import com.example.w2c.screens.ProfileScreen
import com.example.w2c.screens.RoommateScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation(){
   val navController: NavHostController = rememberNavController()

    Scaffold(
        bottomBar = {
             NavigationBar {
                 val navBackStackEntry by navController.currentBackStackEntryAsState()
                 val currentDestination = navBackStackEntry?.destination

                 listOfNavItems.forEach { navItems ->
                     NavigationBarItem(selected = currentDestination?.hierarchy?.any { it.route == navItems.route} == true,
                         onClick = {
                                   navController.navigate(navItems.route){
                                       popUpTo(navController.graph.findStartDestination().id){
                                           saveState = true
                                       }
                                       launchSingleTop = true
                                       restoreState = true
                                   }
                         },
                         icon = {
                             Image(
                                 painter = painterResource(id = navItems.icon),
                                 contentDescription = null, // Provide a content description if needed
                                 modifier = Modifier.size(24.dp) // Adjust the size as needed
                             )
                         })
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
                EventScreen()
            }
            composable(route = Screens.ProfileScreen.name){
                ProfileScreen()
            }

        }
    }
}