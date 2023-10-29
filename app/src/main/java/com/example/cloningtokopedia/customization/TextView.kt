package com.example.cloningtokopedia.customization

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.getCustomFont
import com.example.cloningtokopedia.ui.theme.primaryTextColor

@Composable
fun CustomizedText(
    text: String,
    weight: String = "regular",
    fontSize: Int = 12,
    color: Color = primaryTextColor
) {
    Text(
        text = text,
        fontFamily = getCustomFont(weight),
        fontSize = fontSize.sp,
        color = color
    )
}