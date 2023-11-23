package com.example.cloningtokopedia.modifier

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

// membuat fungsi extension modifier untuk custom icon yang digunakan
// fungsi ini bisa digunakan kembali jika dibutuhkan
fun Modifier.customIcon(size: Dp, color: Color): Modifier {
    return width(size).height(size).background(color)
}