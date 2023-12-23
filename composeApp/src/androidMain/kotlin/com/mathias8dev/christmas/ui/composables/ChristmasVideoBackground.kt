package com.mathias8dev.christmas.ui.composables

import android.content.ContentResolver
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.mathias8dev.christmas.R
import com.mathias8dev.christmas.domain.Utils


@Composable
fun ChristmasVideoBackground() {
    val localContext = LocalContext.current
    val uri by remember(localContext) {
        derivedStateOf {
            Utils.uriFromRes(
                res = R.raw.video_christmas,
                packageName = localContext.packageName
            )
        }
    }
    
    VideoPlayer(
        modifier = Modifier.fillMaxSize(),
        uri = uri
    )
}

