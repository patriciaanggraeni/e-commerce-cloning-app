package com.example.cloningtokopedia.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.cloningtokopedia.customization.CustomTextView

@Composable
fun OfficialStoreScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomTextView(
            text = "Official Store Screen",
            fontSize = 30,
            fontWeight = "bold"
        )
    }
}