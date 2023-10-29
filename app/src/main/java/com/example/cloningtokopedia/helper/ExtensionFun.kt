package com.example.cloningtokopedia.helper

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.ui.theme.borderColor

fun Modifier.customIcon(size: Dp, color: Color): Modifier {
    return width(size).height(size).background(color)
}

fun Modifier.customSearchField(
    width: Dp = 0.dp,
    height: Dp = 0.dp,
    cornerSize: Dp = 0.dp,
    borderWidth: Dp = 1.dp,
    color: Color = Color.Transparent
): Modifier {
    return width(width).height(height).background(
        color = color,
        shape = RoundedCornerShape(cornerSize)
    ).border(
        BorderStroke(
            color = borderColor,
            width = borderWidth
        ),
        shape = RoundedCornerShape(cornerSize)
    )
}