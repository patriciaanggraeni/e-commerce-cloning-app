package com.example.cloningtokopedia.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.R

val openSauceOneLight = FontFamily(
    Font(R.font.open_sauce_sans_light)
)

val openSauceOneRegular = FontFamily(
    Font(R.font.open_sauce_one_regular)
)

val openSauceOneBold = FontFamily(
    Font(R.font.open_sauce_one_bold)
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

fun getCustomFont(weight: String = "regular"): FontFamily {
    return when (weight) {
        "light" -> openSauceOneLight
        "regular" -> openSauceOneRegular
        "bold" -> openSauceOneBold
        else -> FontFamily.Default
    }
}