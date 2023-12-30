package com.harshul.canvascompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.harshul.canvascompose.customcomponent.shapes.Circle
import com.harshul.canvascompose.customcomponent.shapes.Heart
import com.harshul.canvascompose.customcomponent.shapes.Rectangle

@Composable
fun ShapesScreen(navController: NavController) {
    MainContent()
}

@Preview
@Composable
private fun MainContent() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0XFFEEF5FF)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(bottom = 16.dp)
                    .align(Alignment.CenterHorizontally),
                text = "SHAPES",
                fontSize = 32.sp,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.SemiBold
            )

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "RectangleShape", modifier = Modifier.padding(end = 16.dp))
                Rectangle(color = Color(0XFFB4D4FF), modifier = Modifier.weight(0.2f))
                Rectangle(color = Color(0XFF86B6F6), modifier = Modifier.weight(0.7f))
                Rectangle(color = Color(0XFF176B87), modifier = Modifier.weight(0.3f))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "AbsoluteCutCornerShape", modifier = Modifier.padding(end = 16.dp))
                Rectangle(color = Color(0XFFB4D4FF), shape = AbsoluteCutCornerShape(8.dp))
                Rectangle(color = Color(0XFF86B6F6), shape = AbsoluteCutCornerShape(8.dp))
                Rectangle(color = Color(0XFF176B87), shape = AbsoluteCutCornerShape(8.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "CutCornerShape", modifier = Modifier.padding(end = 16.dp))
                Rectangle(color = Color(0XFFB4D4FF), shape = CutCornerShape(8.dp))
                Rectangle(color = Color(0XFF86B6F6), shape = CutCornerShape(8.dp))
                Rectangle(color = Color(0XFF176B87), shape = CutCornerShape(8.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "AbsoluteRoundedCornerShape", modifier = Modifier.padding(end = 16.dp))
                Rectangle(color = Color(0XFFB4D4FF), shape = AbsoluteRoundedCornerShape(8.dp))
                Rectangle(color = Color(0XFF86B6F6), shape = AbsoluteRoundedCornerShape(8.dp))
                Rectangle(color = Color(0XFF176B87), shape = AbsoluteRoundedCornerShape(8.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "RoundedCornerShape", modifier = Modifier.padding(end = 16.dp))
                Rectangle(color = Color(0XFFB4D4FF), shape = RoundedCornerShape(8.dp))
                Rectangle(color = Color(0XFF86B6F6), shape = RoundedCornerShape(8.dp))
                Rectangle(color = Color(0XFF176B87), shape = RoundedCornerShape(8.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "CircleShape", modifier = Modifier.padding(end = 16.dp))
                Circle(color = Color(0XFFB4D4FF), modifier = Modifier.weight(0.2f))
                Circle(color = Color(0XFF86B6F6), modifier = Modifier.weight(0.7f))
                Circle(color = Color(0XFF176B87), modifier = Modifier.weight(0.3f))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                Text(text = "Heart", modifier = Modifier.padding(end = 16.dp))
                Heart(color = Color(0XFFB4D4FF))
                Heart(color = Color(0XFF86B6F6))
                Heart(color = Color(0XFF176B87))
            }
        }
    }
}