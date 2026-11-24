package com.example.composeinit.ui.lessons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.SliderControl
import com.example.composeinit.ui.theme.ComposeInitTheme
import kotlin.math.roundToInt

@Composable
fun L08LazyColumn(modifier: Modifier){
    var count by remember { mutableStateOf(20f) }
    LessonScaffold(
        title = "LazyColumn",
        notice = "Aumente a quantidade de itens e role a lista. Mesmo com centenas " +
                "de linhas, a rolagem é leve: só as linhas visíveis existem de fato.",
        controls = {
            SliderControl("itens", count, {count = it}, 5f..300f)
        }
        ) {
        LazyColumnDemo(
            count=count.roundToInt()
        )
    }
}

@Composable
fun LazyColumnDemo(count: Int){
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(items=(1..count).toList()){ n->
            Text(text = "Item $n",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )
            HorizontalDivider()

        }
    }
}

@Preview
@Composable
private fun L08LazyColumnPreview() {
    ComposeInitTheme {
        L08LazyColumn()
    }

}