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

// membuat fungsi composable NavigationGraph
// fungsi menerima parameter navHostController, gunanya untuk mengontrol navigasi antar layar
@Composable
fun NavigationGraph(navHostController: NavHostController) {

    // composable NavHost digunakan untuk menentukan komponen mana yang akan ditampilkan pada layar
    // sesuai dengan route yang ditentukan
    // di sini, saat pertama kali membuka aplikasi, destinasi diarahkan ke halaman Home
    NavHost(
        navController = navHostController,
        startDestination = BottomNavItems.Home.getRoutes(),
    ) {

        // fungsi composable di bawah berguna untuk menentukan komponen mana yang akan ditampilkan
        // misal, jika user menekan menu feed, maka akan diarahkan ke halaman feed
        // biar bisa berganti halaman, fungsi composable menerima parameter route
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