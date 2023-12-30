package com.harshul.canvascompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.harshul.canvascompose.screens.HomeScreen
import com.harshul.canvascompose.screens.ShapesScreen

@Composable
fun CanvasNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = CanvasScreens.HomeScreen.name) {
        composable(CanvasScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(CanvasScreens.ShapesScreen.name) {
            ShapesScreen(navController = navController)
        }
    }
}