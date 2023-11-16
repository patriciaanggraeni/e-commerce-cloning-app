package com.example.cloningtokopedia.customization

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.modifier.customSearchField
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentColor
import com.example.cloningtokopedia.ui.theme.primaryTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearchField(
    modifier: Modifier,
    placeholder: String,
    placeholderColor: Color = primaryTextColor,
    placeholderTextSize: Int,
    spacer: Dp = 0.dp,
    icon: Painter,
    iconSize: Dp = 24.dp,
    iconTint: Color = Color.Unspecified,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        var query by remember { mutableStateOf("") }
        CustomTopAppBarIcons(
            icon = icon,
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
                            CustomTextView(
                                text = placeholder,
                                fontSize = placeholderTextSize,
                                color = placeholderColor
                            )
                        }
                    },
                    container = {
                        OutlinedTextFieldDefaults.colors(
                            disabledContainerColor = Color.Transparent,
                            disabledBorderColor = Color.Transparent,
                            unfocusedBorderColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent
                        )
                    }
                )
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchFieldPreview() {
    CloningTokopediaTheme {
        CustomSearchField(
            modifier = Modifier.customSearchField(
                width = 200.dp,
                height = 35.dp,
                cornerSize = 7.dp
            ).padding(10.dp),
            spacer = 10.dp,
            placeholder = "Cari di Tokopedia",
            placeholderTextSize = 12,
            placeholderColor = accentColor,
            icon = painterResource(id = R.drawable.icn_search),
            iconSize = 10.dp
        )
    }
}