package com.example.composeinit.ui.lessons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.enuns.ArrangementOption
import com.example.composeinit.enuns.RowAlignmentOption
import com.example.composeinit.ui.componentes.Caixa
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.OptionsControl
import com.example.composeinit.ui.theme.ComposeInitTheme

@Composable
fun L05ColumnRow(modifier: Modifier = Modifier){
    var arrangement by remember { mutableStateOf(ArrangementOption.START) }
    var alignment by remember { mutableStateOf(RowAlignmentOption.CENTER) }
    LessonScaffold(
        title = "Column e Row",
        notice = "As três caixas estão numa Row. 'arrangement' muda como o espaço " +
                "horizontal é distribuído; 'alignment' encosta as caixas no topo, no " +
                "meio ou na base. A Column faria o mesmo, só que na vertical.",
        controls = {
            OptionsControl(
                label = "horizontalArrangement",
                options = ArrangementOption.entries.toList(),
                selected = arrangement,
                optionLabel = {it.label},
                onSelected = {arrangement=it}
            )
            OptionsControl(
                label = "verticalAlignment",
                options = RowAlignmentOption.entries.toList(),
                selected = alignment,
                optionLabel = {it.label},
                onSelected = {alignment=it}
            )

        }
    ) {
        RowDemo(
            arrangement.value,
            alignmentOption = alignment.value
        )
    }

}

@Composable
fun RowDemo(
    arrangementOption: Arrangement.Horizontal,
    alignmentOption: Alignment.Vertical,
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        horizontalArrangement = arrangementOption,
        verticalAlignment = alignmentOption
    ) {
        Caixa("Nome")
        Caixa("Perfil")
        Caixa("100")
    }
}

@Preview(showBackground = true)
@Composable
private fun L05ColumnRowPreview(){
    ComposeInitTheme {
        L05ColumnRow()
    }
}