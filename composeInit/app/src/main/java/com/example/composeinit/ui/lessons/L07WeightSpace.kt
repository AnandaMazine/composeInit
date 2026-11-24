package com.example.composeinit.ui.lessons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.SliderControl
import com.example.composeinit.ui.theme.ComposeInitTheme

@Composable
fun L07WeigthSpace() {

    var weightA by remember { mutableStateOf(1f) }
    var weightB by remember { mutableStateOf(1f) }
    var weightC by remember { mutableStateOf(1f) }
    var rangeWeight = 1f..3f

    LessonScaffold(
        title = "Peso e espaço",
        notice = "Cada caixa tem um peso. Aumente um e veja-o roubar espaço dos " + "outros — a soma dos pesos é o todo, e cada caixa fica com a sua fração.",
        controls = {
            SliderControl("Peso A", weightA, { weightA = it }, rangeWeight)
            SliderControl("Peso B", weightB, { weightB = it }, rangeWeight)
            SliderControl("Peso C", weightC, { weightC = it }, rangeWeight)
        }
    ) {
        WeigthDemo(
            weightA = weightA,
            weightB = weightB,
            weightC = weightC,
        )

    }
}


@Composable
fun RowScope.PesoCaixa(
    rotulo: String,
    peso: Float,
    cor: Color
) {
    Text(
        text = rotulo,
        modifier = Modifier
            .weight(peso)
            .fillMaxHeight()
            .background(cor)
            .wrapContentHeight(Alignment.CenterVertically),
        textAlign = TextAlign.Center
    )
}


@Composable
fun WeigthDemo(
    weightA: Float,
    weightB: Float,
    weightC: Float,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        PesoCaixa("A", weightA, MaterialTheme.colorScheme.primaryContainer)
        PesoCaixa("B", weightB, MaterialTheme.colorScheme.secondaryContainer)
        PesoCaixa("C", weightC, MaterialTheme.colorScheme.tertiaryContainer)

    }
}

@Preview
@Composable
private fun L07WeigthSpacePreview() {
    ComposeInitTheme {
        L07WeigthSpace()
    }
}