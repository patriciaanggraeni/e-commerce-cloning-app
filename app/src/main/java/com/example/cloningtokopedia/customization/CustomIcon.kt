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
    iconName: String? = null,
    size: Dp = 24.dp,
    tint: Color = Color.Unspecified,
) {
    Icon(
        painter = icon,
        contentDescription = iconName,
        tint = tint,
        modifier = Modifier.customIcon(size, Color.Transparent),
    )
}