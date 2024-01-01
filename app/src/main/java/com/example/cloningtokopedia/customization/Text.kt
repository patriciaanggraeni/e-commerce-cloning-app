package com.example.cloningtokopedia.customization

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.customFont

@Composable
fun CustomText(
    text: String = "",
    annotatedText: AnnotatedString? = null,
    fontSize: Double,
    fontWeight: String = "regular",
    color: Color = Color.Black
) {
    annotatedText?.let {
        Text(
            text = it,
            style = TextStyle(
                color = color,
                fontSize = fontSize.sp,
                fontFamily = customFont(weight = fontWeight)
            )
        )
    } ?: Text(
        text = text,
        style = TextStyle(
            color = color,
            fontSize = fontSize.sp,
            fontFamily = customFont(weight = fontWeight)
        )
    )
}