package com.example.cloningtokopedia.customization

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun CustomAddress(
    modifier: Modifier,
    iconOne: Painter,
    iconTwo: Painter,
    contentDescription: String?,
    text: String,
    customerName: String,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier.width(10.dp),
            painter = iconOne,
            contentDescription = contentDescription,
            tint = Color.Unspecified,
        )
        Spacer(modifier = Modifier.width(5.dp))
        CustomTextView(
            text = text,
            fontSize = 12,
            fontWeight = "regular",
        )
        Spacer(modifier = Modifier.width(2.dp))
        CustomTextView(
            text = customerName,
            fontSize = 12,
            fontWeight = "bold",
        )
        Spacer(modifier = Modifier.width(5.dp))
        Icon(
            modifier = Modifier.width(10.dp),
            painter = iconTwo,
            contentDescription = contentDescription,
            tint = Color.Unspecified,
        )
    }
}