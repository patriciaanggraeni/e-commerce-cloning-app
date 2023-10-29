package com.example.cloningtokopedia.helper

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.modifier.customIcon


@Composable
fun LoadIcon(
    painter: Painter,
    iconName: String? = null,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified
) {
    Icon(
        painter = painter,
        contentDescription = iconName,
        tint = tint,
        modifier = Modifier.customIcon(size, Color.Transparent)
    )
}