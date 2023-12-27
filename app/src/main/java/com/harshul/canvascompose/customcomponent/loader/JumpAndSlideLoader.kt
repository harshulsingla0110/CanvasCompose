package com.harshul.canvascompose.customcomponent.loader

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun JumpAndSlideLoader(
    noOfItems: Int = 5,
    itemSize: Size = Size(width = 70f, height = 70f),
    itemsSpacing: Float = 100f,
    cornerRadius: Float = 15f,
    itemsColorList: List<Color>? = listOf(
        Color(0XFF1D9EFF),
        Color(0XFF22B0FE),
        Color(0XFF22C7FB),
        Color(0XFF22D4FB),
        Color(0XFF22D1FA)
    ),
    itemRotationTime: Int = 500,
    animationStartOffset: Int = 1000,
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        val infiniteTransition = rememberInfiniteTransition(label = "Jump n slide loader")

        val firstBallX = noOfItems / 2
        val totalAnimTime = noOfItems * itemRotationTime
        val rotationList = mutableListOf<Float>()
        val colorList = mutableListOf<Color>()

        for (i in 0 until noOfItems) {
            if (i == 0) {
                //setting main item translation values
                val translateX = (noOfItems - 1) * itemsSpacing
                val translation by infiniteTransition.animateFloat(
                    initialValue = 0f,
                    targetValue = translateX,
                    animationSpec = infiniteRepeatable(
                        animation = keyframes {
                            durationMillis = totalAnimTime
                        },
                        repeatMode = RepeatMode.Reverse,
                        initialStartOffset = StartOffset(offsetMillis = animationStartOffset)
                    ),
                    label = "translate : $i"
                )
                rotationList.add(translation)

                //setting main item color values
                val colorValue by infiniteTransition.animateColor(
                    initialValue = itemsColorList?.getOrNull(0) ?: Color.Black,
                    targetValue = itemsColorList?.lastOrNull() ?: Color.Black,
                    animationSpec = infiniteRepeatable(
                        animation = keyframes {
                            durationMillis = totalAnimTime
                        },
                        repeatMode = RepeatMode.Reverse,
                        initialStartOffset = StartOffset(offsetMillis = animationStartOffset)
                    ),
                    label = "main item color values"
                )
                colorList.add(colorValue)
            } else {
                //setting rotation values
                val rotation by infiniteTransition.animateFloat(
                    initialValue = 0f,
                    targetValue = -180f,
                    animationSpec = infiniteRepeatable(
                        animation = keyframes {
                            durationMillis = totalAnimTime
                            0f at ((i - 1) * itemRotationTime)
                            -180f at ((i + 1) * itemRotationTime)
                        },
                        repeatMode = RepeatMode.Reverse,
                        initialStartOffset = StartOffset(offsetMillis = animationStartOffset)
                    ),
                    label = "rotation : $i"
                )
                rotationList.add(rotation)

                //setting color values
                val initialColor = itemsColorList?.getOrNull(i) ?: Color.Black
                val targetColor = itemsColorList?.getOrNull(i - 1) ?: Color.Black
                val colorValue by infiniteTransition.animateColor(
                    initialValue = initialColor,
                    targetValue = targetColor,
                    animationSpec = infiniteRepeatable(
                        animation = keyframes {
                            durationMillis = totalAnimTime
                            initialColor at ((i - 1) * itemRotationTime)
                            targetColor at ((i + 1) * itemRotationTime)
                        },
                        repeatMode = RepeatMode.Reverse,
                        initialStartOffset = StartOffset(offsetMillis = animationStartOffset)
                    ),
                    label = "main item color values"
                )
                colorList.add(colorValue)
            }
        }


        Canvas(modifier = Modifier.fillMaxSize()) {

            for (i in 0 until noOfItems) {
                val xPosition = if (noOfItems % 2 != 0) {
                    (center.x - itemSize.width / 2) + (-firstBallX + i) * itemsSpacing
                } else {
                    (firstBallX - i - 0.5f) * itemsSpacing
                }
                val yPosition = center.y - itemSize.height / 2
                val rotationAxisX =
                    center.x - (firstBallX * itemsSpacing) + (i - 0.5f) * itemsSpacing

                if (i == 0) {
                    translate(left = rotationList[i]) {
                        drawRoundRect(
                            color = colorList.getOrNull(0) ?: Color.Black,
                            size = Size(width = itemSize.width, height = itemSize.height),
                            topLeft = Offset(
                                x = xPosition,
                                y = yPosition
                            ),
                            cornerRadius = CornerRadius(x = cornerRadius)
                        )
                    }
                } else {
                    rotate(
                        degrees = rotationList[i],
                        pivot = Offset(x = rotationAxisX, y = center.y)
                    ) {
                        drawRoundRect(
                            color = colorList.getOrNull(i) ?: Color.Black,
                            size = Size(width = itemSize.width, height = itemSize.height),
                            topLeft = Offset(
                                x = xPosition,
                                y = yPosition
                            ),
                            cornerRadius = CornerRadius(x = cornerRadius)
                        )
                    }
                }
            }

        }
    }
}