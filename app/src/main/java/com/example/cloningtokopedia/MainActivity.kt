package com.example.cloningtokopedia

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.cloningtokopedia.composable.CustomBottomNavigation
import com.example.cloningtokopedia.composable.CustomTopAppBar
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CloningTokopediaTheme {
                Scaffold(
                    topBar = { CustomTopAppBar() },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    bottomBar = { CustomBottomNavigation(navController = rememberNavController()) }
                ) {}
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun Preview() {
     CloningTokopediaTheme {
         Scaffold(
             topBar = { CustomTopAppBar() },
             modifier = Modifier
                 .fillMaxSize()
                 .padding(10.dp),
             bottomBar = { CustomBottomNavigation(navController = rememberNavController()) }
         ) {
         }
     }
}