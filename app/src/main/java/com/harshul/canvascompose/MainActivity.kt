package com.harshul.canvascompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.harshul.canvascompose.customcomponent.loader.JumpAndSlideLoader
import com.harshul.canvascompose.navigation.CanvasNavigation
import com.harshul.canvascompose.ui.theme.CanvasComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasComposeTheme {
                CanvasNavigation()
            }
        }
    }
}
