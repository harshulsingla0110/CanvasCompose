package com.harshul.canvascompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.harshul.canvascompose.R
import com.harshul.canvascompose.navigation.CanvasScreens

@Composable
fun HomeScreen(navController: NavController) {
    MainContent(navController)
}

@Preview
@Composable
private fun MainContent(navController: NavController? = null) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.padding(top = 16.dp, bottom = 32.dp),
                text = "CANVAS",
                fontSize = 32.sp,
                letterSpacing = 4.sp,
                fontWeight = FontWeight.SemiBold
            )
            Box(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0XFFB4D4FF))
                    .clickable {
                        navController?.navigate(route = CanvasScreens.ShapesScreen.name)
                    }
            ) {
                Text(
                    text = "Shapes",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(top = 12.dp),
                    fontSize = 32.sp,
                    color = Color(0XFF1535CC),
                    fontWeight = FontWeight.SemiBold
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_shapes),
                    contentDescription = "shapes",
                    contentScale = ContentScale.FillWidth
                )
            }
            Box(
                modifier = Modifier
                    .padding(all = 16.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color(0XFFB4D4FF))
            ) {
                Text(
                    text = "Custom\nComponents",
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(24.dp),
                    fontSize = 32.sp,
                    color = Color(0XFF1535CC),
                    fontWeight = FontWeight.SemiBold,
                    lineHeight = 40.sp
                )
                Image(
                    modifier = Modifier
                        .padding(top = 24.dp, end = 8.dp, bottom = 8.dp)
                        .align(Alignment.BottomEnd),
                    painter = painterResource(id = R.drawable.ic_pen),
                    contentDescription = "shapes",
                    contentScale = ContentScale.Inside,
                    alignment = Alignment.Center
                )
            }
        }
    }
}