package com.example.cloningtokopedia.customization

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.getFont

@Composable
fun CustomTextView(
    text: String,
    fontSize: Int,
    fontWeight: String = "regular",
    color: Color = Color.Black
) {
    Text(
        text = text,
        style = TextStyle(
            color = color,
            fontSize = fontSize.sp,
            fontFamily = getFont(weight = fontWeight)
        )
    )
}