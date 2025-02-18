package com.example.questbasiccomposable_167

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
            .fillMaxSize()  // urutan dalam modifier sangat berpengaruh, // untuk membuat full screen pada layar
            .padding(top = 0.dp))  {
        Text("Login",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier =  Modifier.padding(5.dp))
        Text(text = "Ini adalah halaman login",
            fontSize = 15.sp,
            fontStyle = FontStyle.Normal)

        Spacer(modifier = Modifier.padding(10.dp))
        Image(
            painter = painterResource(id = R.drawable.umy),
            contentDescription = "", // harus ada
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape))


        Text(text = "Nama",
            fontSize = 15.sp,
            fontStyle = FontStyle.Normal)

        Text(text = "Muthia Sasi Marsakina",
            fontSize = 15.sp,
            fontStyle = FontStyle.Normal,
            color = Color.Red)


        Text(text = "20220140167",
            fontSize = 35.sp,
            fontStyle = FontStyle.Normal)


        Image(
            painter = painterResource(id = R.drawable.mypicture),
            contentDescription = "",
            modifier = Modifier
                .padding(16.dp)
                .size(250.dp, 420.dp) // Mengatur ukuran untuk agar membentuk lonjong
                .clip(RoundedCornerShape(150.dp)) // Mengatur sudut agar membulat
                .graphicsLayer(
                    alpha = 1.0f,
                    translationX = -10f,
                    scaleX = 1.02f,
                    scaleY = 1.02f
                )
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

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