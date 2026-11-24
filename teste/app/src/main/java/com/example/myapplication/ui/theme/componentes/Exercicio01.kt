package com.example.myapplication.ui.theme.componentes

private const val TETO_ISENCAO = 2259.20

private const val TETO_FAIXA_INTERMEDIARIA = 2826.62

fun calcularIrrf2(salarioBruto: Double?): Double {
    val salario = salarioBruto ?: 0.0

    val aliquota = when {
        salario <= TETO_ISENCAO -> 0.0
        salario <= TETO_FAIXA_INTERMEDIARIA -> 7.5
        else -> 15.0
    }

    return salario * (aliquota / 100)
}