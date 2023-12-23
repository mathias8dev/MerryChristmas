package ui.composables

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource


@ExperimentalResourceApi
@Composable
fun SurpriseButton(
    modifier: Modifier = Modifier,
    onClick: ()->Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        ) {
        Text("Surprise", fontSize = 18.sp)
            Image(
                painterResource("surprise.png"),
                null,
                modifier = Modifier.size(32.dp),
            )
    }
}

