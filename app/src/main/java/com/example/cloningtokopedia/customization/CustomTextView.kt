package com.example.cloningtokopedia.customization

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.customFont

@Composable
fun CustomTextView(
    text: String,
    fontSize: Int,
    color: Color = Color.Black,
    fontWeight: String = "regular",
) {
    Text(
        text = text,
        style = TextStyle(
            color = color,
            fontSize = fontSize.sp,
            fontFamily = customFont(weight = fontWeight)
        )
    )
}