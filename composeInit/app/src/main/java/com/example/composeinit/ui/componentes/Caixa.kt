package com.example.composeinit.ui.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeinit.ui.theme.ComposeInitTheme

@Composable
fun Caixa(texto:String){
    Text(
        text = texto,
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(all=12.dp)

    )
}

@Preview(showBackground = true)
@Composable
private fun CaixaPreview(){
    ComposeInitTheme {
        Caixa(texto = "TESTE DE PREVIEW")
    }
}