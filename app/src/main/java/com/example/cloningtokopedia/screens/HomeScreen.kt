package com.example.cloningtokopedia.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.cloningtokopedia.R
import com.example.cloningtokopedia.composable.CustomAppBar
import com.example.cloningtokopedia.customization.CustomHomeAddress
import com.example.cloningtokopedia.customization.CustomTextView
import com.example.cloningtokopedia.ui.theme.CloningTokopediaTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen() {
    Scaffold {
        ConstraintLayout {
            val (appBar, address) = createRefs()

            CustomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(color = Color.White)
                    .constrainAs(appBar) {
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                    }
            )
            CustomHomeAddress(
                modifier = Modifier
                    .padding(10.dp)
                    .constrainAs(address) {
                        top.linkTo(appBar.bottom)
                        start.linkTo(parent.start)
                    },
                username = "Anggara Susilo",
                leadingIcon = painterResource(id = R.drawable.icn_maps_filled),
                trailingIcon = painterResource(id = R.drawable.arrow_down),
                iconSize = 12.dp,
                iconSpace = 10.dp,
                fontSize = 12.0
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    CloningTokopediaTheme {
        HomeScreen()
    }
}