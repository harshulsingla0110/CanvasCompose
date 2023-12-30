package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val TearDropShape = RoundedCornerShape(
    topStartPercent = 50,
    topEndPercent = 50,
    bottomEndPercent = 10,
    bottomStartPercent = 50
)

@Composable
fun TearDrop(modifier: Modifier = Modifier, color: Color, value: String) {
    Surface(
        shape = TearDropShape,
        color = color,
        modifier = Modifier
            .padding(8.dp)
            .size(60.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = value, fontWeight = FontWeight.ExtraBold, fontSize = 30.sp)
        }
    }
}