package com.example.myapplication.ui.theme.lessons

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.myapplication.ui.theme.componentes.calcularIrrf2
import com.example.myapplication.ui.theme.lesson.Exercicio01Scaffold

@Composable
fun Exercicio01Composable(){
    val salario = 3000.0
    var resultado = calcularIrrf2(salario)

    Text(text = "O valor do salário é ${salario}")
    Text(text = resultado.toString())
}
