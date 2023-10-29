package com.example.cloningtokopedia.customization

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.helper.LoadIcon
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor

@Composable
fun CustomTopAppBarIcons(
    icon: Painter,
    size: Dp = 24.dp,
    tint: Color = Color.Black,
) {
    Row {
        LoadIcon(
            painter = icon,
            size = size,
            tint = tint
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopBarIconsPreview() {
     CloningTokopediaTheme {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
             val listIcons = listOf(
                R.drawable.icn_email,
                R.drawable.icn_bell,
                R.drawable.icn_cart,
                R.drawable.icn_menu
            )

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
}