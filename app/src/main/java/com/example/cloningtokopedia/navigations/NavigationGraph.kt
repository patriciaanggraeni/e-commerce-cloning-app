package com.example.cloningtokopedia.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cloningtokopedia.model.BottomNavItems
import com.example.cloningtokopedia.screens.FeedScreen
import com.example.cloningtokopedia.screens.HomeScreen
import com.example.cloningtokopedia.screens.OfficialStoreScreen
import com.example.cloningtokopedia.screens.TransactionScreen
import com.example.cloningtokopedia.screens.WishlistScreen

@Composable
fun NavigationGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = BottomNavItems.Home.getRoutes(),
    ) {
        composable(route = BottomNavItems.Home.getRoutes()) {
            HomeScreen()
        }
        composable(route = BottomNavItems.Feed.getRoutes()) {
            FeedScreen()
        }
        composable(route = BottomNavItems.OfficialStore.getRoutes()) {
            OfficialStoreScreen()
        }
        composable(route = BottomNavItems.Wishlist.getRoutes()) {
            WishlistScreen()
        }
        composable(route = BottomNavItems.Transaction.getRoutes()) {
            TransactionScreen()
        }
    }
}