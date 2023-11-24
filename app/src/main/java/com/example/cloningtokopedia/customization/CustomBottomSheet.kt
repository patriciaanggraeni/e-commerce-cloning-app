package com.example.cloningtokopedia.customization

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun CustomBottomSheet() {
//    val sheetState = rememberModalBottomSheetState()
//    var isSheetOpened by rememberSaveable {
//        mutableStateOf(false)
//    }
//
//    Button(
//        onClick = {
//            isSheetOpened = true;
//        }
//    ) {
//        Text(text = "Buka BottomSheet")
//    }
//
//    if (isSheetOpened) {
//        ModalBottomSheet(
//            sheetState = sheetState,
//            onDismissRequest = { isSheetOpened = false }
//        ) {
//            // content
//        }
//    }
}