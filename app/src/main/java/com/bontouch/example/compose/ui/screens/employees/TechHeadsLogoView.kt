package com.bontouch.example.compose.ui.screens.employees

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bontouch.example.compose.R

@Preview
@Composable
fun TechHeadsLogoViewPreview() {
    TechHeadsLogoView()
}

@Composable
fun TechHeadsLogoView() {

    Image(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        painter = painterResource(R.drawable.logo_techheads),
        contentDescription = null
    )
}
