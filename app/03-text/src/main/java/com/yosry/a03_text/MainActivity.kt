package com.yosry.a03_text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.yosry.a03_text.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SimpleApp()
                }
            }
        }
    }
}

@Preview
@Composable
fun SimpleApp(){
    Column {
        TextWithSize()
        ColorText()
        BoldText()
        ItalicText()
        MaxLines()
        OverflowedText()
        SelectableText()
    }
}
@Composable
fun TextWithSize(){
    Text("Hi", fontSize = TextUnit.Unspecified)
}




@Composable
fun ColorText() {
    Text("Color text", color = Color.Blue)
}
@Composable
fun BoldText() {
    Text("Bold text", fontWeight = FontWeight.Black)
}

@Composable
fun ItalicText() {
    Text("Italic Text", fontStyle = FontStyle.Italic)
}

@Composable
fun MaxLines() {
    Text("hello ".repeat(50), maxLines = 2)
}

@Composable
fun OverflowedText() {
    Text("Hello Compose ".repeat(50), maxLines = 2, overflow = TextOverflow.Ellipsis)
}


@Composable
fun SelectableText() {
    SelectionContainer {
        Text("This text is selectable")
    }
}