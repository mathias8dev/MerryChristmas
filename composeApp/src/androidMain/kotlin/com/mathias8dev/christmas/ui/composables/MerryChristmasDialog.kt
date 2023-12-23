package com.mathias8dev.christmas.ui.composables


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.window.DialogProperties
import com.mathias8dev.christmas.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MerryChristmasDialog(
    onDismissRequest: () -> Unit = {},
) {
    
    AlertDialog(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        LottieAnimation(
            modifier = Modifier.clip(RoundedCornerShape(8.dp)).fillMaxWidth().height(500.dp),
            animationRes = R.raw.lottie_merry_christmas
        )
    }
}

