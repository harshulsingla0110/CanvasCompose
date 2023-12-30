package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.harshul.canvascompose.ui.theme.BlueL3

@Preview
@Composable
fun TicketComposable(modifier: Modifier = Modifier) {
    Text(
        text = "🎉 CINEMA TICKET 🎉",
        style = TextStyle(
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Black,
        ),
        textAlign = TextAlign.Center,
        modifier = modifier
            .wrapContentSize()
            .graphicsLayer {
                shadowElevation = 8.dp.toPx()
                shape = TicketShape(24.dp.toPx())
                clip = true
            }
            .background(color = BlueL3)
            .drawBehind {
                scale(scale = 0.9f) {
                    drawPath(
                        path = drawTicketPath(size = size, cornerRadius = 24.dp.toPx()),
                        color = Color.Red,
                        style = Stroke(
                            width = 2.dp.toPx(),
                            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f))
                        )
                    )
                }
            }
            .padding(start = 32.dp, top = 64.dp, end = 32.dp, bottom = 64.dp)
    )
}

private class TicketShape(private val cornerRadius: Float) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(drawTicketPath(size, cornerRadius))
    }
}

fun drawTicketPath(size: Size, cornerRadius: Float): Path = Path().apply {
    reset()
    // Top left arc
    arcTo(
        rect = Rect(
            left = -cornerRadius,
            top = -cornerRadius,
            right = cornerRadius,
            bottom = cornerRadius
        ),
        startAngleDegrees = 90.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )
    // Top right arc
    arcTo(
        rect = Rect(
            left = size.width - cornerRadius,
            top = -cornerRadius,
            right = size.width + cornerRadius,
            bottom = cornerRadius
        ),
        startAngleDegrees = 180.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )

    // Bottom right arc
    arcTo(
        rect = Rect(
            left = size.width - cornerRadius,
            top = size.height - cornerRadius,
            right = size.width + cornerRadius,
            bottom = size.height + cornerRadius
        ),
        startAngleDegrees = 270.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )

    // Bottom left arc
    arcTo(
        rect = Rect(
            left = -cornerRadius,
            top = size.height - cornerRadius,
            right = cornerRadius,
            bottom = size.height + cornerRadius
        ),
        startAngleDegrees = 0.0f,
        sweepAngleDegrees = -90.0f,
        forceMoveTo = false
    )

    close()
}