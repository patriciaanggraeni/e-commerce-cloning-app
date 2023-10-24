package com.example.cloningtokopedia.helper

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

fun Modifier.customIcon(size: Dp, color: Color): Modifier {
    return width(size).height(size).background(color)
}

