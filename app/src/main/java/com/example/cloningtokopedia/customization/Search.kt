package com.example.cloningtokopedia.customization

import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme
import com.example.cloningtokopedia.ui.theme.accentGray200

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomSearch(
    query: String,
    icon: Painter,
    iconSize: Dp = 24.dp,
    iconTint: Color = Color.Black,
    modifier: Modifier,
    contentPadding: PaddingValues = PaddingValues(),
    placeholder: @Composable (() -> Unit)?,
) {
    var state by remember { mutableStateOf(query) }

    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = modifier,
        content = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 10.dp)
            ) {
                CustomIcon(
                    icon = icon,
                    size = iconSize,
                    tint = iconTint,
                )
                Spacer(modifier = Modifier.width(10.dp))
                BasicTextField(
                    value = state,
                    onValueChange = { state = it },
                    modifier = Modifier.weight(1f)
                ) {
                    TextFieldDefaults.DecorationBox(
                        value = state,
                        innerTextField = { it() },
                        enabled = true,
                        singleLine = true,
                        contentPadding = contentPadding,
                        visualTransformation = VisualTransformation.None,
                        interactionSource = MutableInteractionSource(),
                        placeholder = {
                            if (state.isEmpty()) {
                                if (placeholder != null) {
                                    placeholder()
                                }
                            }
                        },
                        container = {
                            OutlinedTextFieldDefaults.colors(
                                focusedBorderColor = Color.Transparent,
                                unfocusedBorderColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                unfocusedContainerColor = Color.Transparent
                            )
                        }
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun SearchFieldPreview() {
    CloningTokopediaTheme {
        CustomSearch(
            query = "",
            icon = painterResource(id = R.drawable.icn_search),
            iconSize = 12.dp,
            iconTint = accentGray200,
            modifier = Modifier
                .width(200.dp)
                .height(35.dp)
                .border(
                    width = 1.dp,
                    color = accentGray200,
                    shape = RoundedCornerShape(7.dp)
                ),
            placeholder = {
                CustomText(
                    text = "Cari di Tokopedia",
                    fontSize = 12.toDouble(),
                    color = accentGray200
                )
            }
        )
    }
}