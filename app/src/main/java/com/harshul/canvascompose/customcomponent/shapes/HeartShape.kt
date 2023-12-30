package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun HeartShapeComposable(modifier: Modifier = Modifier, color: Color) {
    Surface(
        modifier = modifier.defaultMinSize(minWidth = 48.dp, minHeight = 48.dp),
        color = color,
        shape = HeartShape
    ) {

    }
}

val HeartShape = GenericShape { size, _ ->
    val h = size.height
    val w = size.width
    lineTo(0.5f * w, 0.25f * h)
    cubicTo(
        0.5f * w,
        0.225f * h,
        0.45833334f * w,
        0.125f * h,
        0.29166666f * w,
        0.125f * h
    )
    cubicTo(
        0.041666668f * w,
        0.125f * h,
        0.041666668f * w,
        0.4f * h,
        0.041666668f * w,
        0.4f * h
    )
    cubicTo(
        0.041666668f * w,
        0.5833333f * h,
        0.20833333f * w,
        0.76666665f * h,
        0.5f * w,
        0.9166667f * h
    )
    cubicTo(
        0.7916667f * w,
        0.76666665f * h,
        0.9583333f * w,
        0.5833333f * h,
        0.9583333f * w,
        0.4f * h
    )
    cubicTo(
        0.9583333f * w,
        0.4f * h,
        0.9583333f * w,
        0.125f * h,
        0.7083333f * w,
        0.125f * h
    )
    cubicTo(
        0.5833333f * w,
        0.125f * h,
        0.5f * w,
        0.225f * h,
        0.5f * w,
        0.25f * h
    )
    close()
}