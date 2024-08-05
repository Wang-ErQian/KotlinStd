package com.wangerqian.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wangerqian.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                SetupAllQuadrant()
            }
        }
    }
}

@Composable
fun SetupQuadrant(firstText: String, secondText: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = firstText,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(
                    bottom = 16.dp
                )
        )
        Text(
            text = secondText,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun SetupAllQuadrant(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .weight(1f)
        ) {
            SetupQuadrant(
                firstText = stringResource(id = R.string.firstQuadrant_text1),
                secondText = stringResource(id = R.string.firstQuadrant_text2),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFEADDFF))
            )
            SetupQuadrant(
                firstText = stringResource(id = R.string.secondQuadrant_text1),
                secondText = stringResource(id = R.string.secondQuadrant_text2),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
            )
        }
        Row(
            modifier = modifier
                .weight(1f)
        ) {
            SetupQuadrant(
                firstText = stringResource(id = R.string.thirdQuadrant_text1),
                secondText = stringResource(id = R.string.thirdQuadrant_text2),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFB69DF8))
            )
            SetupQuadrant(
                firstText = stringResource(id = R.string.forthQuadrant_text1),
                secondText = stringResource(id = R.string.forthQuadrant_text2),
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewQuadrant() {
    ComposeQuadrantTheme {
        SetupAllQuadrant(
        )
    }
}

