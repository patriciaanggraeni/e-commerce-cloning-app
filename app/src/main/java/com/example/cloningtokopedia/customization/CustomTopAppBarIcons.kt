package com.example.cloningtokopedia.customization

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.modifier.customIcon
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor

// membuat fungsi custom composable untuk membuat list icon di app bar
@Composable
fun CustomTopAppBarIcons(
    icon: Painter,
    iconName: String? = null,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified,
) {
    Icon(
        painter = icon,
        contentDescription = iconName,
        tint = tint,
        modifier = Modifier.customIcon(size, Color.Transparent),
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarIconsPreview() {
     CloningTokopediaTheme {
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
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