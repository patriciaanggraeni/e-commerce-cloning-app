package com.example.cloningtokopedia.composable

import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.customization.CustomAddress

@Composable
fun DeliveredAddress() {
    CustomAddress(
        modifier = Modifier.wrapContentSize(),
        iconOne = painterResource(id = R.drawable.icn_maps_filled),
        iconTwo = painterResource(id = R.drawable.arrow_down),
        contentDescription = null,
        text = "Dikirim ke",
        customerName = "Rumah Angga Susilo"
    )
}