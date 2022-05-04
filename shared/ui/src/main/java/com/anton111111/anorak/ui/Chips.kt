package com.anton111111.anorak.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.anton111111.anorak.theme.appColors

@Composable
fun Chips(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Card(
        modifier = modifier.height(24.dp),
        backgroundColor = appColors.surface,
        border = BorderStroke(
            width = 1.dp,
            color = appColors.onSurface.copy(alpha = 0.4f)
        ),
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            content()
        }
    }
}

@Composable
fun Chips(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes imageResId: Int? = null,
    imageModifier: Modifier = Modifier.size(24.dp),
    imageContentDescription: String? = null,
    textColor: Color = appColors.onSurface,
    imageColorFilter: ColorFilter? = null
) {
    Chips(
        modifier = modifier
    ) {
        imageResId?.let {
            Image(
                modifier = imageModifier.padding(end = 2.dp),
                painter = painterResource(id = it),
                contentDescription = imageContentDescription,
                colorFilter = imageColorFilter
            )
        }

        text?.let {
            Text(
                textAlign = TextAlign.Center,
                text = it,
                color = textColor,
                style = MaterialTheme.typography.caption
            )
        }
    }
}
