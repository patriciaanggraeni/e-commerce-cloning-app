package com.example.cloningtokopedia.composable

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomIcon
import com.example.cloningtokopedia.customization.CustomSearch
import com.example.cloningtokopedia.customization.CustomText
import com.example.cloningtokopedia.modifier.CustomModifier.Companion.customSearchField
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentGray200

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
       CustomSearch(
           query = "",
           icon = painterResource(id = R.drawable.icn_search),
           iconSize = 12.dp,
           iconTint = accentGray200,
           modifier = Modifier
               .width(200.dp)
               .height(35.dp)
               .border(
                   width = 1.dp,
                   color = accentGray200,
                   shape = RoundedCornerShape(7.dp)
               ),
           placeholder = {
               CustomText(
                   text = "Cari di Tokopedia",
                   fontSize = 12.toDouble(),
                   color = accentGray200
               )
           }
        )

        listIcons.forEach {
            CustomIcon(
                icon = it,
                size = 20.dp,
                tint = accentGray200
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