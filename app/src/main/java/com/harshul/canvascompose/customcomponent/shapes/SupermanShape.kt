package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun SupermanShape(color: Color = Color(0XFF176B87), size: Dp = 100.dp) {
    Box() {
        Box(
            modifier = Modifier
                .size(size)
                .clip(AbsoluteCutCornerShape(topLeftPercent = 50))
                .background(color)
        ) {

        }
    }
}