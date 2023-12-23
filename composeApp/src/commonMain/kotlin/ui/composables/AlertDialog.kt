package ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties


@Composable
fun AlertDialog(
    onDismissRequest: () -> Unit = {},
    cornerRadius: Dp = 8.dp,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    backgroundColor: Color = MaterialTheme.colors.background,
    content: @Composable ColumnScope.() -> Unit,
) {
    AlertDialog(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onDismissRequest = onDismissRequest,
        backgroundColor = backgroundColor,
        shape = RoundedCornerShape(cornerRadius),
        properties = DialogProperties(usePlatformDefaultWidth = false),
        text = {
            Column(
                modifier = Modifier.padding(contentPadding)
            ) {
                content()
            }
        },
        buttons = {})

}