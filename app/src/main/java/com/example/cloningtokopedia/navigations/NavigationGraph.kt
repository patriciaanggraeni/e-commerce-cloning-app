package com.example.cloningtokopedia.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cloningtokopedia.model.BottomNavItems

@Composable
fun NavigationGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomNavItems.Home.getTitle(),
    ) {
        composable(BottomNavItems.Home.getRoutes()) {

        }
    }
}