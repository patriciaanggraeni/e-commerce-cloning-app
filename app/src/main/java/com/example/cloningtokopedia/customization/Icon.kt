package com.example.cloningtokopedia.customization

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.modifier.CustomModifier.Companion.customIcon

@Composable
fun CustomIcon(
    icon: Painter,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified,
    description: String? = null,
) {
    Icon(
        painter = icon,
        tint = tint,
        contentDescription = description,
        modifier = Modifier.customIcon(size, Color.Transparent),
    )
}