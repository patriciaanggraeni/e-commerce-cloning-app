package com.example.cloningtokopedia.helper

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.getCustomFont
import com.example.cloningtokopedia.ui.theme.primaryColor
import com.example.cloningtokopedia.ui.theme.primaryTextColor

@Composable
fun CustomizedText(
    text: String,
    weight: String = "regular",
    fontSize: Int = 12,
    color: Color = primaryTextColor
) {
    Text(
        text = text,
        fontFamily = getCustomFont(weight),
        fontSize = fontSize.sp,
        color = color
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearchView(
    modifier: Modifier,
    placeholder: String,
    placeholderColor: Color = primaryTextColor,
    placeholderTextSize: Int,
    spacer: Dp = 0.dp,
    icon: Painter,
    iconSize: Dp,
    iconTint: Color = primaryColor,
) {

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        var query by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.width(spacer))
        LoadIcon(
            painter = icon,
            size = iconSize,
            tint = iconTint
        )
        Spacer(modifier = Modifier.width(spacer))
        BasicTextField(
            modifier = Modifier.fillMaxWidth(),
            value = query,
            onValueChange = { query = it },
            singleLine = true,
            decorationBox = { innerTextField ->
                TextFieldDefaults.DecorationBox(
                    value = query,
                    innerTextField = { innerTextField() },
                    enabled = true,
                    singleLine = true,
                    contentPadding = PaddingValues(0.dp),
                    visualTransformation = VisualTransformation.None,
                    interactionSource = MutableInteractionSource(),
                    placeholder = {
                        if (query.isBlank()) {
                            CustomizedText(
                                text = placeholder,
                                fontSize = placeholderTextSize,
                                color = placeholderColor
                            )
                        }
                    }
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Previewer() {
    CloningTokopediaTheme {

    }
}