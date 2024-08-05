package com.wangerqian.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wangerqian.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface {
                }
            }
        }
    }
}

@Composable
fun InfoPeople(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .padding(80.dp)
                .background(color = Color(0xFF073042))
        )
        Text(
            text = name,
            fontSize = 30.sp
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            style = TextStyle(color = Color(0xFF3ddc84))
        )
    }
}

@Composable
fun InfoContact(teleNumber: String, email: String, link: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text =teleNumber
            )
        }
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = email
            )
        }
        Row(
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = link,
            )
        }
    }
}

@Composable
fun UiAll(
    name: String,
    title: String,
    teleNumber: String,
    email: String,
    link: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        InfoPeople(
            name = name,
            title = title
        )
        InfoContact(
            teleNumber = teleNumber,
            email = email,
            link = link
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xd2e8d4)
@Composable
fun SetupUi() {
    BusinessCardTheme {
        UiAll(
            name = stringResource(id = R.string.name),
            title = stringResource(id = R.string.title),
            teleNumber = stringResource(id = R.string.telenum),
            email = stringResource(id = R.string.email),
            link = stringResource(id = R.string.link),

        )
    }
}

