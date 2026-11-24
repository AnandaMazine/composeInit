package com.example.composeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeinit.ui.componentes.BoasVindas
import com.example.composeinit.ui.lessons.L01FirstComposable
import com.example.composeinit.ui.lessons.L02FirstComposable
import com.example.composeinit.ui.lessons.L03Parameters
import com.example.composeinit.ui.lessons.L04Modifier
import com.example.composeinit.ui.lessons.L05ColumnRow
import com.example.composeinit.ui.lessons.L06Box
import com.example.composeinit.ui.lessons.L07WeightSpace
import com.example.composeinit.ui.lessons.L07WeigthSpace
import com.example.composeinit.ui.lessons.L08LazyColumn
import com.example.composeinit.ui.lessons.L09Button
import com.example.composeinit.ui.theme.ComposeInitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeInitTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    BoasVindas(
//                        name = "Ananda",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                //L02FirstComposable()
                //L03Parameters()
                //L04Modifier()
                //L05ColumnRow()
                //L06Box()
                //L07WeightSpace()
                //L08LazyColumn()
                L09Button()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeInitTheme {
        Greeting("Android")
    }
}