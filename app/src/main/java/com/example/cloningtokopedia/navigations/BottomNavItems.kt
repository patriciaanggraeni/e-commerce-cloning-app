package com.example.cloningtokopedia.navigations

import com.example.cloningtokopedia.R

sealed class BottomNavItems(
    private val title: String,
    private val selectedIcon: Int,
    private val unselectedIcon: Int,
    private val routes: String
) {

    object Home: BottomNavItems(
        title = "Home",
        selectedIcon = R.drawable.icn_home_filled,
        unselectedIcon = R.drawable.icn_home_outlined,
        routes = "home_page"
    )

    object Feed: BottomNavItems(
        title = "Feed",
        selectedIcon = R.drawable.icn_feed_filled,
        unselectedIcon = R.drawable.icn_feed_outlined,
        routes = "feed_page"
    )

    object OfficialStore: BottomNavItems(
        title = "Official Store",
        selectedIcon = R.drawable.icn_official_store_filled,
        unselectedIcon = R.drawable.icn_official_store_outlined,
        routes = "official_store_page"
    )

    object Wishlist: BottomNavItems(
        title = "Wishlist",
        selectedIcon = R.drawable.icn_wishlist_filled,
        unselectedIcon = R.drawable.icn_wishlist_oulined,
        routes = "wishlist_page"
    )

    object Transaction: BottomNavItems(
        title = "Transaction",
        selectedIcon = R.drawable.icn_transaction_filled,
        unselectedIcon = R.drawable.icn_transaction_outlined,
        routes = "transaction_page"
    )

    fun getTitle() = this.title
    fun getSelectedIcon() = this.selectedIcon
    fun getUnselectedIcon() = this.unselectedIcon
    fun getRoutes() = this.routes
}