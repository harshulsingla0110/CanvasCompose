package com.harshul.canvascompose.canvasbasic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyCanvas() {
    Canvas(
        modifier = Modifier
            .padding(2.dp)
            .size(300.dp)
    ) {
        drawRect(
            color = Color.Black,
            size = size
        )

        drawRect(
            color = Color.Blue,
            topLeft = Offset(150.dp.toPx(), 150.dp.toPx()),
            size = Size(100.dp.toPx(), 100.dp.toPx()),
            style = Stroke(
                width = 4.dp.toPx()
            )
        )

        drawCircle(
            brush = Brush.radialGradient(
                colors = listOf(Color.Green, Color.Red),
                radius = 50.dp.toPx(),
                center = Offset(60.dp.toPx(), 60.dp.toPx())
            ),
            radius = 50.dp.toPx(),
            center = Offset(60.dp.toPx(), 60.dp.toPx())
        )

        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 270f,
            topLeft = Offset(120.dp.toPx(), 120.dp.toPx()),
            useCenter = true,
            size = Size(75.dp.toPx(), 75.dp.toPx())
        )

        drawArc(
            color = Color.Green,
            startAngle = 0f,
            sweepAngle = 270f,
            topLeft = Offset(160.dp.toPx(), 10.dp.toPx()),
            useCenter = false,
            size = Size(75.dp.toPx(), 75.dp.toPx()),
            style = Stroke(
                width = 2.dp.toPx()
            )
        )

        drawOval(
            color = Color.Magenta,
            topLeft = Offset(20.dp.toPx(), 170.dp.toPx()),
            size = Size(100f, 300f)
        )

        drawLine(
            color = Color.Cyan,
            start = Offset(20.dp.toPx(), 130.dp.toPx()),
            end = Offset(80.dp.toPx(), 170.dp.toPx()),
            strokeWidth = 3.dp.toPx()
        )

    }
}