package com.mathias8dev.christmas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.mathias8dev.christmas.ui.composables.TransparentSystemBars
import com.mathias8dev.christmas.ui.screens.ChristmasScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            TransparentSystemBars(darkIcons = false)
            ChristmasScreen()
        }
    }
}

