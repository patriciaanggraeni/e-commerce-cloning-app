package com.example.cloningtokopedia.helper

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme

@Composable
fun LoadIcon(
    painter: Painter,
    iconName: String? = null,
    size: Dp = 24.dp
) {
    Icon(
        painter = painter,
        contentDescription = iconName,
        tint = Color.Unspecified,
        modifier = Modifier.customIcon(size, Color.Transparent)
    )
}