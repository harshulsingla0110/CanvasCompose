package com.harshul.canvascompose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.harshul.canvascompose.customcomponent.shapes.CircleShapeComposable
import com.harshul.canvascompose.customcomponent.shapes.HeartShapeComposable
import com.harshul.canvascompose.customcomponent.shapes.MessageBubbleComposable
import com.harshul.canvascompose.customcomponent.shapes.RectangleShapeComposable
import com.harshul.canvascompose.customcomponent.shapes.TearDropShapeComposable
import com.harshul.canvascompose.customcomponent.shapes.TicketComposable
import com.harshul.canvascompose.ui.theme.BlueL1
import com.harshul.canvascompose.ui.theme.BlueL2
import com.harshul.canvascompose.ui.theme.BlueL3

@Composable
fun ShapesScreen(navController: NavController) {
    MainContent()
}

@Preview
@Composable
private fun MainContent() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        color = Color(0XFFEEF5FF)
    ) {
        Column(
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
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

            DifferentApplyMethods()

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //Rectangle Shape
            Row(modifier = Modifier.fillMaxWidth()) {
                RowItem {
                    Text(text = "Rectangle Shape", textAlign = TextAlign.Center, minLines = 2)
                    RectangleShapeComposable(color = BlueL1)
                }
                RowItem {
                    Text(text = "Cut Corner Shape", textAlign = TextAlign.Center, minLines = 2)
                    RectangleShapeComposable(color = BlueL2, shape = CutCornerShape(8.dp))
                }
                RowItem {
                    Text(
                        text = "Absolute Cut Corner Shape",
                        textAlign = TextAlign.Center,
                        minLines = 2
                    )
                    RectangleShapeComposable(color = BlueL3, shape = AbsoluteCutCornerShape(8.dp))
                }
            }

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //Rounded Shape
            Row(modifier = Modifier.fillMaxWidth()) {
                RowItem {
                    Text(text = "Circle Shape", textAlign = TextAlign.Center, minLines = 3)
                    CircleShapeComposable(color = BlueL1, modifier = Modifier)
                }
                RowItem {
                    Text(text = "Rounded Corner Shape", textAlign = TextAlign.Center, minLines = 3)
                    RectangleShapeComposable(color = BlueL2, shape = RoundedCornerShape(8.dp))
                }
                RowItem {
                    Text(
                        text = "Absolute Rounded Corner Shape",
                        textAlign = TextAlign.Center,
                        minLines = 3
                    )
                    RectangleShapeComposable(
                        color = BlueL3,
                        shape = AbsoluteRoundedCornerShape(8.dp)
                    )
                }
            }

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //Heart Shape
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Heart", modifier = Modifier.padding(end = 16.dp))
                HeartShapeComposable(color = BlueL1)
                HeartShapeComposable(color = Color(0XFF86B6F6))
                HeartShapeComposable(color = Color(0XFF176B87))
            }

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //Message Bubble
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "MessageBubble",
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .align(Alignment.CenterHorizontally)
                )
                MessageBubbleComposable(
                    text = "Cool!!",
                    false,
                    modifier = Modifier.align(Alignment.End)
                )
                MessageBubbleComposable(text = "You have an incoming message", isIncoming = true)
            }

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //tear drop
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "TearDropShape", modifier = Modifier.padding(end = 16.dp))
                TearDropShapeComposable(color = BlueL1, value = "0")
                TearDropShapeComposable(color = Color(0XFF86B6F6), value = "1")
                TearDropShapeComposable(color = Color(0XFF176B87), value = "2")
            }

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )

            //ticket
            Text(text = "Ticket Shape", modifier = Modifier.align(Alignment.CenterHorizontally))
            TicketComposable(
                modifier = Modifier
                    .height(height = 200.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Divider(
                modifier = Modifier
                    .padding(24.dp)
                    .alpha(0.5f)
            )
        }
    }
}

@Composable
fun DifferentApplyMethods() {
    Row(modifier = Modifier.fillMaxWidth()) {
        RowItem(modifier = Modifier.padding(horizontal = 8.dp)) {
            Text(text = "clip", modifier = Modifier.padding(bottom = 8.dp))
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .clip(AbsoluteRoundedCornerShape(50))
                    .background(BlueL1)
            ) {
                Text(text = "Content of the Box", fontSize = 18.sp)
            }
        }

        RowItem(modifier = Modifier.padding(horizontal = 8.dp)) {
            Text(text = "background", modifier = Modifier.padding(bottom = 8.dp))
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .background(color = BlueL2, shape = AbsoluteRoundedCornerShape(50))
            ) {
                Text(text = "Content of the Box", fontSize = 18.sp)
            }
        }

        RowItem(modifier = Modifier.padding(horizontal = 8.dp)) {
            Text(text = "border", modifier = Modifier.padding(bottom = 8.dp))
            Box(
                modifier = Modifier
                    .wrapContentHeight()
                    .border(width = 4.dp, color = BlueL3, shape = AbsoluteRoundedCornerShape(50))
            ) {
                Text(text = "Content of the Box", fontSize = 18.sp)
            }
        }
    }
}

@Composable
fun RowScope.RowItem(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Column(modifier = modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
        content()
    }
}