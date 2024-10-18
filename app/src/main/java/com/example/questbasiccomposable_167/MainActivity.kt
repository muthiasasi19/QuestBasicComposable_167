package com.example.questbasiccomposable_167

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.questbasiccomposable_167.ui.theme.QuestBasicComposable_167Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_167Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BasicColumn(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}
@Composable
fun BasicColumn(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,

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
    QuestBasicComposable_167Theme {
        Greeting("Android")
    }
}