package com.example.cloningtokopedia.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomSearchField
import com.example.cloningtokopedia.customization.CustomTopAppBarIcons
import com.example.cloningtokopedia.modifier.customSearchField
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor
import com.example.cloningtokopedia.ui.theme.secondaryTextColor

// membuat fungsi composable untuk menampilkan komponen-komponen yang ada di top appbar
@Composable
fun CustomTopAppBar() {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {

        // menaggil fungsi kustom search field yang telah dibuat sebelumnya
        CustomSearchField(
            // modifiernya menggunakan fungsi ekstensi yang telah dibuat sebelumnya
            modifier = Modifier
                .customSearchField(
                    width = 200.dp,
                    height = 35.dp,
                    cornerSize = 7.dp
                )
                .padding(10.dp),
            spacer = 10.dp,
            placeholder = "Cari di Tokopedia",
            placeholderTextSize = 12,
            placeholderColor = secondaryTextColor,
            icon = painterResource(id = R.drawable.icn_search),
            iconSize = 10.dp,
            iconTint = accentColor,
        )

        // setalahnya panggil juga fungsi kustom untuk menampilkan icon di appbar
        CustomTopAppBarIcons(
             icon = painterResource(id = R.drawable.icn_email),
             size = 20.dp,
             tint = accentColor
        )

        CustomTopAppBarIcons(
             icon = painterResource(id = R.drawable.icn_bell),
             size = 20.dp,
             tint = accentColor
        )

        CustomTopAppBarIcons(
             icon = painterResource(id = R.drawable.icn_cart),
             size = 20.dp,
             tint = accentColor
        )

        CustomTopAppBarIcons(
             icon = painterResource(id = R.drawable.icn_menu),
             size = 20.dp,
             tint = accentColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CustomTopAppBarPreview() {
    CloningTokopediaTheme {
        Row(
            Modifier.fillMaxSize(),
        ) {
            CustomTopAppBar()
        }
    }
}