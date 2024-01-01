package com.example.cloningtokopedia.customization

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme

@Composable
fun CustomHomeAddress(
    modifier: Modifier,
    username: String,
    leadingIcon: Painter,
    trailingIcon: Painter,
    iconSize: Dp,
    iconSpace: Dp,
    fontSize: Double,
    verticalAlgnment: Alignment.Vertical = Alignment.CenterVertically,
    horizontalAlignment: Arrangement.Horizontal = Arrangement.SpaceEvenly
) {
    val text = "Dikirim ke "
    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(fontSize = fontSize.sp)) {
            append(text)
        }
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = fontSize.sp)) {
            append(username)
        }
    }

    Row(
        modifier = modifier,
        verticalAlignment = verticalAlgnment,
        horizontalArrangement = horizontalAlignment
    ) {
        CustomIcon(
            icon = leadingIcon,
            size = iconSize,
            iconName = "Address"
        )
        Spacer(modifier = Modifier.width(iconSpace))
        CustomAddressTextView(
            text = annotatedString,
            fontSize = fontSize
        )
        Spacer(modifier = Modifier.width(iconSpace))
        CustomIcon(
            icon = trailingIcon,
            size = iconSize,
            iconName = "Arrow Address Toggle"
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@Preview(showBackground = true)
fun CustomHomeAddressPreview() {
    CloningTokopediaTheme {
        Row {
            CustomHomeAddress(
                username = "Anggara Susilo",
                leadingIcon = painterResource(id = R.drawable.icn_maps_filled),
                trailingIcon = painterResource(id = R.drawable.arrow_down),
                iconSize = 12.dp,
                iconSpace = 10.dp,
                fontSize = 12.0,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}