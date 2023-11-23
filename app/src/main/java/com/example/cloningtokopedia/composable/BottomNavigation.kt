package com.example.cloningtokopedia.composable

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomTextView
import com.example.cloningtokopedia.model.BottomNavItems
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor
import com.example.cloningtokopedia.ui.theme.primaryColor
import com.example.cloningtokopedia.ui.theme.secondaryColor

// membuat fungsi kustom untuk menampilkan BottomNavigation
@Composable
fun CustomBottomNavigation(navController: NavController) {

    // memuat list navigasi
    val navItems = listOf(
        BottomNavItems.Home,
        BottomNavItems.Feed,
        BottomNavItems.OfficialStore,
        BottomNavItems.Wishlist,
        BottomNavItems.Transaction
    )

    BottomNavigation(
        backgroundColor = secondaryColor
    ) {
        // navBackStackEntry digunakan untuk mendapatkan BackStackEntry
        // BackStackEntry digunakan untuk menyimpan stack entry sebelumnya
        // jika user kembali ke halaman sebelumnya, maka entri saat ini akan dihancurkan
        // dan entri sebelumnya direkontruksi kembali
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        // untuk menampung entri saat ini, maka dibutuhkan variabel untuk menampung entri tersbut
        // currentDestination berisi route saat ini
        val currentDestination = navBackStackEntry?.destination?.route

        navItems.forEach { item ->
            BottomNavigationItem(
                modifier = Modifier
                    .height(100.dp)
                    .padding(0.dp),
                selected = currentDestination == item.getRoutes(),
                alwaysShowLabel = true,
                onClick = {
                    navController.navigate(item.getRoutes()) {
                        navController.graph.startDestinationRoute?.let { routes ->
                            popUpTo(routes) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        modifier = Modifier.size(20.dp),
                        // khusus painter, saya kasih kondisi
                        // berguna untuk mengganti ikon saat halaman saat ini dipilih
                        painter = painterResource(
                            id = if (currentDestination == item.getRoutes()) {
                                item.getSelectedIcon()
                            } else {
                                item.getUnselectedIcon()
                            }
                        ),
                        tint = Color.Unspecified,
                        contentDescription = item.getTitle()
                    )
                },
                label = {
                    CustomTextView(
                        text = item.getTitle(),
                        fontSize = 9,
                        color = accentColor
                    )
                },
            )
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun CustomBottomNavigation() {
    CloningTokopediaTheme {
        Scaffold(
            bottomBar = { CustomBottomNavigation(navController = rememberNavController()) }
        ) {}
    }
}