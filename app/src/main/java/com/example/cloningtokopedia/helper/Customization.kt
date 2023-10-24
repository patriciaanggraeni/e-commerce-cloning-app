package com.example.cloningtokopedia.helper

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.getFont

@Composable
fun CustomizedText(
    text: String,
    weight: String = "regular",
    fontSize: Int = 12, )
{
    Text(
        text = text,
        fontFamily = getFont(weight),
        fontSize = fontSize.sp,
    )
}