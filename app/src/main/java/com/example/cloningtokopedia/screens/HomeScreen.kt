package com.example.cloningtokopedia.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cloningtokopedia.composable.CustomTopAppBar
import com.example.cloningtokopedia.composable.DeliveredAddress
import com.example.cloningtokopedia.customization.CustomTextView

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun HomeScreen() {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        CustomTopAppBar()
        Spacer(modifier = Modifier.height(10.dp))
        DeliveredAddress()
    }
}

@Composable
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
fun HomeScreenPreview() {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        CustomTopAppBar()
        Spacer(modifier = Modifier.height(10.dp))
        DeliveredAddress()
    }
}