package com.example.cloningtokopedia.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.openSauceOneBold
import com.example.cloningtokopedia.ui.theme.openSauceOneLight
import com.example.cloningtokopedia.ui.theme.openSauceOneRegular
import com.example.cloningtokopedia.ui.theme.primaryTextColor

object AssetsLoader {

    @Composable
    fun LoadIcon(painter: Painter, width: Dp = 24.dp, height: Dp = 24.dp) {
        Icon(
            painter = painter,
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier
                .width(width)
                .height(height)
                .wrapContentSize()
                .background(color = Color.Transparent)
        )
    }

    @Composable
    fun CustomText(
        text: String,
        weight: String = "regular",
        fontSize: Int = 12,
    ) {
         Text(
            text = text,
            fontFamily = getFont(weight),
            fontSize = fontSize.sp,
        )
    }

    private fun getFont(weight: String): FontFamily {
        return when (weight) {
            "light" -> openSauceOneLight
            "regular" -> openSauceOneRegular
            "bold" -> openSauceOneBold
            else -> FontFamily.Default
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoadIconPreview() {
    CloningTokopediaTheme {
        AssetsLoader.LoadIcon(painter = painterResource(id = R.drawable.icn_wishlist_filled))
    }
}