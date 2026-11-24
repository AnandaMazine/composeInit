package com.example.composeinit.ui.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.enuns.BoxAlignmentOption
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl
import com.example.composeinit.ui.theme.ComposeInitTheme

@Composable
fun L06Box() {
    var alignment by remember { mutableStateOf(BoxAlignmentOption.CENTER) }

    LessonScaffold(
        title = "Box",
        notice = "'contentAlignment' move a caixa da frente para um canto ou para o " +
                "centro do fundo. Ligue a sobreposição para empilhar uma segunda camada.",
        controls = {
            OptionsControl(
                label = "ContentAlignment",
                options = BoxAlignmentOption.entries.toList(),
                selected = alignment,
                optionLabel = {it.label},
                onSelected = {alignment = it}
            )
        },

        ) {

        Box(
            modifier = Modifier
                .size(160.dp)
                .background(MaterialTheme.colorScheme.surfaceVariant),
            contentAlignment = alignment.value
        ){
            Text("FRENTE")
        }
    }
}

@Preview
@Composable
private fun L06BoxPreview() {
    ComposeInitTheme() {
        L06Box()
    }
}
