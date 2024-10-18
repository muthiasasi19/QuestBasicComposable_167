package com.example.questbasiccomposable_167

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize() // urutan dalam modifier sangat berpengaruh, // untuk membuat full screen pada layar
            .padding(top = 0.dp) {
                Text("Login",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier =  Modifier.padding(5.dp))
                Text(text = "Ini adalah halaman login",
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Normal)

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
    QuestBasicComposable_167Theme {
        Greeting("Android")
    }
}