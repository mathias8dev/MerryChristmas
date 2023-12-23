package com.mathias8dev.christmas.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.mathias8dev.christmas.ui.composables.MerryChristmasDialog
import com.mathias8dev.christmas.ui.composables.TransparentSystemBars
import org.jetbrains.compose.resources.ExperimentalResourceApi
import ui.composables.ChristmasBackground
import ui.composables.SurpriseButton

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ChristmasScreen() {

    val showMerryChristmas = remember {
        mutableStateOf(false)
    }

    Box(modifier = Modifier.fillMaxSize()) {

        ChristmasBackground()

        SurpriseButton(modifier = Modifier.align(Alignment.Center)) {
            showMerryChristmas.value = !showMerryChristmas.value
        }

        Text(
            modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 64.dp).fillMaxWidth(),
            text = "Cliques pour voir une surprise 😁",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }

    AnimatedVisibility(showMerryChristmas.value) {
        MerryChristmasDialog {
            showMerryChristmas.value = false
        }
    }
}