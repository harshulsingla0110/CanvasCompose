package com.harshul.canvascompose.customcomponent.shapes

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val IncomingMessage = RoundedCornerShape(
    topStart = 8.dp,
    topEnd = 8.dp,
    bottomEnd = 8.dp,
    bottomStart = 0.dp
)

val OutgoingMessage = RoundedCornerShape(
    topStart = 8.dp,
    topEnd = 8.dp,
    bottomEnd = 0.dp,
    bottomStart = 8.dp
)

@Composable
fun MessageBubble(
    text: String,
    isIncoming: Boolean,
    modifier: Modifier = Modifier,
) {
    Surface(
        shape = if (isIncoming) IncomingMessage else OutgoingMessage,
        color = if (isIncoming) Color(0XFF176B87) else Color(0XFFB4D4FF),
        modifier = modifier.padding(4.dp)
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.Light, fontSize = 12.sp,
            color = Color.White,
            modifier = Modifier.padding(8.dp)
        )
    }
}