package com.example.cloningtokopedia.customization

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.getCustomFont

// membuat fungsi custom composable untuk membuat dan menampilkan teks
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
            fontFamily = getCustomFont(weight = fontWeight)
        )
    )
}