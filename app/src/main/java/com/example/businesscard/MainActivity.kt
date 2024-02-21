package com.example.businesscard

//import android.graphics.Color
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xffe4faea)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val bg = painterResource(R.drawable.android_logo)
        Box(
            modifier = Modifier
                .size(120.dp, 120.dp)
                .background(Color.Black)
                .padding(8.dp)
        ) {
            Image(
                painter = bg,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text(text = "Biligt Gursed", fontSize = 40.sp)
        Text(text = "Android Developer Extraordinate", color = Color(0xFF3ddc84), fontSize = 20.sp)
    }
    val iconSize = 40.dp
    val detFontSize = 25.sp
    val iconPhone = painterResource(R.drawable.phone_call)
    val iconInternet = painterResource(R.drawable.internet)
    val iconEmail = painterResource(R.drawable.email)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Image(
                painter = iconPhone,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize, iconSize)
            )
            Text(
                text = "+976 99137730",
                color = Color.Black,
                fontSize = detFontSize,
                modifier = Modifier.padding(start = 20.dp, top = 3.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Image(
                painter = iconInternet,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize, iconSize)
            )
            Text(
                text = "@BiligtGursed",
                color = Color.Black,
                fontSize = detFontSize,
                modifier = Modifier.padding(start = 20.dp, top = 3.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Image(
                painter = iconEmail,
                contentDescription = null,
                modifier = Modifier
                    .size(iconSize, iconSize)
            )
            Text(
                text = "biligtgursed@gmail.com",
                color = Color.Black,
                fontSize = detFontSize,
                modifier = Modifier.padding(start = 20.dp, top = 3.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        Greeting()
    }
}