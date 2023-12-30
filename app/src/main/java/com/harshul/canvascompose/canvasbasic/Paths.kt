package com.harshul.canvascompose.canvasbasic

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harshul.canvascompose.ui.theme.BlueBgLight

@Preview
@Composable
fun ScratchPad() {

    Column(Modifier.background(BlueBgLight)) {
        Canvas(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(13 / 4f)
        ) {
            val widthMulti = size.width / 13f
            val heightMulti = size.height / 4f
            drawPath(
                path = Path().apply {
                    moveTo(x = 1f * widthMulti, y = 1f * heightMulti)
                    lineTo(x = 4f * widthMulti, y = 3f * heightMulti)
                    moveTo(x = 6f * widthMulti, y = 3f * heightMulti)
                    lineTo(x = 8f * widthMulti, y = 1f * heightMulti)
                    lineTo(x = 12f * widthMulti, y = 3f * heightMulti)
                },
                color = Color.Black,
                style = Stroke(width = 4.dp.value, cap = StrokeCap.Round)
            )
        }

        Canvas(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(13 / 7f)
        ) {
            val widthMulti = size.width / 13f
            val heightMulti = size.height / 7f
            drawPath(
                path = Path().apply {
                    moveTo(x = 1f * widthMulti, y = 1f * heightMulti)
                    lineTo(x = 6f * widthMulti, y = 1f * heightMulti)
                    arcTo(
                        Rect(
                            left = 1f * widthMulti,
                            top = 1f * heightMulti,
                            right = 12f * widthMulti,
                            bottom = 6f * heightMulti
                        ),
                        startAngleDegrees = 0f,
                        sweepAngleDegrees = 180f,
                        forceMoveTo = false
                    )

                },
                color = Color.Black,
                style = Stroke(width = 4.dp.value, cap = StrokeCap.Round)
            )
        }

        Canvas(
            modifier = Modifier
                .weight(1f)
                .aspectRatio(13 / 7f)
        ) {
            val widthMulti = size.width / 13f
            val heightMulti = size.height / 7f
            drawPath(
                path = Path().apply {
                    moveTo(x = 1f * widthMulti, y = 1f * heightMulti)
                    lineTo(x = 6f * widthMulti, y = 1f * heightMulti)
                    arcTo(
                        Rect(
                            left = 1f * widthMulti,
                            top = 1f * heightMulti,
                            right = 12f * widthMulti,
                            bottom = 6f * heightMulti
                        ),
                        startAngleDegrees = 0f,
                        sweepAngleDegrees = 180f,
                        forceMoveTo = true
                    )
                },
                color = Color.Black,
                style = Stroke(width = 4.dp.value, cap = StrokeCap.Round)
            )
        }
    }
}