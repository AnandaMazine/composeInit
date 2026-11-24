package com.example.composeinit.ui.lessons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeinit.ui.lesson.LessonScaffold
import com.example.composeinit.ui.lesson.TextControl

@Composable
fun L03Parameters() {
    var text by remember { mutableStateOf("Tela de Login") }
    LessonScaffold(
        title = "Parâmentros",
        notice = "O primeiro título ignora o que você digita — o texto dele está " +
                "escrito por dentro da função. Os três de baixo são o MESMO componente, " +
                "chamado três vezes com valores diferentes.",
        controls = {
            TextControl(
                label = "Texto a ser alterado",
                value = text,
                onValueChange = {text = it},
            )
        }

        ){
        ParametersDemo(text)
    }
}

@Composable
fun StatelessTitle() {
    Text(
        text = "Tela de Login",
        fontSize = 28.sp
    )
}

@Composable
fun StatefullTitle(text: String) {
    Text(
        text = text,
        fontSize = 28.sp
    )
}

@Composable
fun ParametersDemo(text: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Componente Stateless"
        )
        StatelessTitle()

        Text(
            text = "Componente Statefull"
        )
        StatefullTitle(text)
        StatefullTitle("$text (de novo)")
        StatefullTitle(text.uppercase())
    }
}

@Preview(showBackground = true)
@Composable
private fun ParametersDemoPreview() {
    ParametersDemo("TESTE DSM5")
}