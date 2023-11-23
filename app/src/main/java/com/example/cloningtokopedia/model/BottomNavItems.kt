package com.example.cloningtokopedia.model

import com.example.cloningtokopedia.R

// membuat sealed class BottomNavItems
// menggunakan sealed class karena jumlah item navigasi itu terbatas
sealed class BottomNavItems(
    private val title: String,
    private val selectedIcon: Int,
    private val unselectedIcon: Int,
    private val routes: String
) {

    // membuat class dengan tipe objek, mengartikan bahwa class di bawah adalah class singleton
    // dan merupakan turunan langsung dari class BottomNavItems
    object Home: BottomNavItems(title = "Home", selectedIcon = R.drawable.icn_home_filled, unselectedIcon = R.drawable.icn_home_outlined, routes = "home_page")
    object Feed: BottomNavItems(title = "Feed", selectedIcon = R.drawable.icn_feed_filled, unselectedIcon = R.drawable.icn_feed_outlined, routes = "feed_page")
    object OfficialStore: BottomNavItems(title = "Official Store", selectedIcon = R.drawable.icn_official_store_filled, unselectedIcon = R.drawable.icn_official_store_outlined, routes = "official_store_page")
    object Wishlist: BottomNavItems(title = "Wishlist", selectedIcon = R.drawable.icn_wishlist_filled, unselectedIcon = R.drawable.icn_wishlist_oulined, routes = "wishlist_page")
    object Transaction: BottomNavItems(title = "Transaction", selectedIcon = R.drawable.icn_transaction_filled, unselectedIcon = R.drawable.icn_transaction_outlined, routes = "transaction_page")

    // karena property class saya buat private, jadi saya buat fungsi getter
    fun getTitle() = this.title
    fun getSelectedIcon() = this.selectedIcon
    fun getUnselectedIcon() = this.unselectedIcon
    fun getRoutes() = this.routes
}