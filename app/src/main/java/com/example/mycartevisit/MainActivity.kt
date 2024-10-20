package com.example.mycartevisit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycartevisit.R
import com.example.mycartevisit.ui.theme.MyCarteVisitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCarteVisitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun MyParty(text: String, icon: ImageVector){
    Row { Icon(
        icon,
        contentDescription = stringResource(id = R.string.email_content_desc),
        modifier = Modifier.padding(end = 8.dp)
    )
        Text(
            text = text
        ) }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.size(80.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally){
            Image(painter = painterResource(R.drawable.myimage), contentDescription = "Main Image", modifier = Modifier.size(200.dp).clip(CircleShape))
            Text(text = "KONATE Alassane Amed", fontWeight = FontWeight.Bold, fontSize = 28.sp)
            Text(text = "Junior Fullstack Developer", fontSize = 18.sp)
        }
        Spacer(modifier = Modifier.size(40.dp))
        Column{
            MyParty("+225 07 59 72 30 74", Icons.Rounded.Call)
            MyParty("assanekonate13@gmail.com", Icons.Rounded.Email)
            MyParty("Abidjan, Port-Bouët", Icons.Rounded.LocationOn)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCarteVisitTheme {
        Greeting()
    }
}