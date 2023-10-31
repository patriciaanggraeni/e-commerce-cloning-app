package com.example.cloningtokopedia.model

import com.example.cloningtokopedia.R

sealed class BottomNavItems(
    private val title: String,
    private val icon: Int,
    private val routes: String
) {

    object Home: BottomNavItems(title = "Home", icon = R.drawable.icn_home_filled, routes = "home_page")
    object Feed: BottomNavItems(title = "Feed", icon = R.drawable.icn_feed_filled, routes = "feed_page")
    object OfficialStore: BottomNavItems(title = "Official Store", icon = R.drawable.icn_official_store_filled, routes = "official_store_page")
    object Wishlist: BottomNavItems(title = "Wishlist", icon = R.drawable.icn_wishlist_filled, routes = "wishlist_page")
    object Transaction: BottomNavItems(title = "Transaction", icon = R.drawable.icn_transaction_filled, routes = "transaction_page")

    fun getTitle() = this.title
    fun getIcon() = this.icon
    fun getRoutes() = this.routes

}