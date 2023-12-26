package com.example.cloningtokopedia

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.cloningtokopedia.composable.BottomNav
import com.example.cloningtokopedia.composable.CustomAppBar
import com.example.cloningtokopedia.composable.CustomBottomNavigation
import com.example.cloningtokopedia.navigations.NavigationGraph
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CloningTokopediaTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { CustomAppBar() },
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomNav(navController = navController) }
                ) {
                    NavigationGraph(navHostController = navController)
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun Preview() {
    val navController = rememberNavController()
    CloningTokopediaTheme {
        Scaffold(
            topBar = { CustomAppBar() },
            modifier = Modifier.fillMaxSize(),
            bottomBar = { BottomNav(navController = navController) }
        ) {
            NavigationGraph(navHostController = navController)
        }
    }
}