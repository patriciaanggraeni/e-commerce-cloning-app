package com.example.cloningtokopedia.composable

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomTextView
import com.example.cloningtokopedia.model.BottomNavItems
import com.example.cloningtokopedia.ui.theme.accentColor
import com.example.cloningtokopedia.ui.theme.secondaryColor

@Composable
fun CustomBottomNavigation(navController: NavController) {
    val navItems = listOf(
        BottomNavItems.Home,
        BottomNavItems.Feed,
        BottomNavItems.OfficialStore,
        BottomNavItems.Transaction,
        BottomNavItems.Wishlist
    )

    BottomNavigation(
        backgroundColor = secondaryColor
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination?.route

        navItems.forEach { item ->
            BottomNavigationItem(
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
                        painter = painterResource(id = item.getIcon()),
                        tint = Color.Unspecified,
                        contentDescription = item.getTitle()
                    )
                },
                label = {
                    CustomTextView(
                        text = item.getTitle(),
                        fontSize = 10,
                        color = accentColor
                    )
                },

            )
        }
    }

}