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
fun Circle(
    color: Color,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .padding(horizontal = 4.dp)
            .defaultMinSize(32.dp, 32.dp)
            .clip(CircleShape)
            .background(color)
    )
}

@Composable
fun Rectangle(
    color: Color,
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape
) {
    Box(
        modifier = modifier
            .padding(horizontal = 4.dp)
            .defaultMinSize(32.dp, 32.dp)
            .clip(shape = shape)
            .background(color)
    )
}