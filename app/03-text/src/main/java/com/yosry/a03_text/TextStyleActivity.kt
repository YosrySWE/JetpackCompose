package com.yosry.a03_text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.SystemFontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yosry.a03_text.ui.theme.ComposeTheme

class TextStyleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Surface {
                    SampleTextStyleApp()
                }
            }
        }
    }
}


@Preview
@Composable
fun SampleTextStyleApp(){
    Column {
        TextViewFun()
        TextWithShadow()
        TextHeadingStyle()
    }
}

@Composable
fun TextViewFun(){
    Text(
        text = "Hello World",
        style = TextStyle(
            color = Color.Red,
            fontSize = 16.sp,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.W800,
            fontStyle = FontStyle.Italic,
            letterSpacing = 0.5.em,
            background = Color.LightGray,
            textDecoration = TextDecoration.Underline
        )
    )
}
@Composable
fun TextWithShadow(){
    Text(
        text = "Text with Shadow",
        style = TextStyle(
            color = Color.Yellow,
            background = Color.White,
            shadow = Shadow(
                color = Color.Black,
                offset = Offset(5f, 5f),
                blurRadius = 5f
            )
        )
    )
}

@Composable
fun TextHeadingStyle() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
    ) {
        Text(
            text = "Heading Large",
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = "Heading Medium",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Heading Small",
            style = MaterialTheme.typography.bodySmall
        )
    }
}