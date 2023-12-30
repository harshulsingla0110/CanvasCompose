package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp


@Composable
fun CircleShapeComposable(
    color: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(top = 8.dp)
            .padding(horizontal = 4.dp)
            .defaultMinSize(64.dp, 64.dp)
            .clip(CircleShape)
            .background(color)
    )
}

@Composable
fun RectangleShapeComposable(
    color: Color,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    Box(
        modifier = modifier
            .padding(top = 8.dp)
            .padding(horizontal = 4.dp)
            .defaultMinSize(64.dp, 64.dp)
            .clip(shape = shape)
            .background(color)
    )
}