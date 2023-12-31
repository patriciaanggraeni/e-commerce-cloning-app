package com.example.cloningtokopedia.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomIcon
import com.example.cloningtokopedia.customization.CustomSearchField
import com.example.cloningtokopedia.modifier.CustomModifier.Companion.customSearchField
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor
import com.example.cloningtokopedia.ui.theme.secondaryTextColor

@Composable
fun CustomAppBar(modifier: Modifier) {
    val listIcons = listOf<Painter>(
        painterResource(id = R.drawable.icn_email),
        painterResource(id = R.drawable.icn_bell),
        painterResource(id = R.drawable.icn_cart),
        painterResource(id = R.drawable.icn_menu)
    )
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CustomSearchField(
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

        listIcons.forEach {
            CustomIcon(
                icon = it,
                size = 20.dp,
                tint = accentColor
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomTopAppBarPreview() {
    CloningTokopediaTheme {
        Row(
            Modifier.fillMaxSize(),
        ) {
            CustomAppBar(
                modifier = Modifier.fillMaxWidth().padding(10.dp)
            )
        }
    }
}