package com.yosry.a04_buttons

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yosry.a04_buttons.ui.theme.ComposeTheme

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
                    SampleButtonApps()
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SampleButtonApps() {

    ButtonSampleContainer()
}

@Composable
fun ButtonSampleContainer() {
    Column(
        Modifier
            .padding(5.dp)
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(5.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ButtonWithBackground()
        Spacer(modifier = Modifier.width(10.dp))
        ButtonWithColor()
        Spacer(modifier = Modifier.width(10.dp))
        ButtonWithTwoTextView()
        Spacer(modifier = Modifier.height(10.dp))
        ButtonWithIcon()
        ButtonWithRectangleShape()
        ButtonWithCutCornerShape()
        ButtonWithRoundCornerShape()
        ButtonWithBorder()
        ButtonWithElevation()
    }
}

@Composable
fun ButtonWithBackground() {
    Button(onClick = { Log.d("KEY", "OnClick Pressed") }) {
        Text("Hi Button")

    }
}

@Composable
fun ButtonWithColor() {
    val context = LocalContext.current
    Button(
        onClick = {
            //your onclick code
            Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
        },
        colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)
    )

    {
        Text(text = "Button with gray background", color = Color.Black)
    }
}

@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = {
        //your onclick code here
        Log.i("KEY", "Button Clicked")
    }) {
        Text(text = "Click ", color = Color.Magenta)
        Text(
            text = "Here",
            Modifier.clickable { Log.i("KEY", "Text Clicked") },
            color = Color.Green
        )
    }
}
@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Image   (
            painterResource(id = R.drawable.baseline_shopping_cart),
            contentDescription = "Cart button icon",
            modifier = Modifier.size(20.dp)
        )

        Text(text = "Add to cart", Modifier.padding(start = 10.dp))
    }
}

//Button with shapes
@Composable
fun ButtonWithRectangleShape() {
    Button(onClick = {}, shape = RectangleShape) {
        Text(text = "Rectangle shape")
    }
}
@Composable
fun ButtonWithRoundCornerShape() {
    Button(onClick = {}, shape = RoundedCornerShape(20.dp)) {
        Text(text = "Round corner shape")
    }
}
@Composable
fun ButtonWithCutCornerShape() {
    //CutCornerShape(percent: Int)- it will consider as percentage
    //CutCornerShape(size: Dp)- you can pass Dp also.
    //Here we use Int, so it will take percentage.
    Button(onClick = {}, shape = CutCornerShape(10)) {
        Text(text = "Cut corner shape")
    }
}

//6. Button with Border:

@Composable
fun ButtonWithBorder() {
    Button(
        onClick = {
            //your onclick code
        },
        border = BorderStroke(1.dp, Color.Red),
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red, containerColor = Color.White)
    ) {
        Text(text = "Button with border", color = Color.DarkGray)
    }
}

// Button Elevation
@Composable
fun ButtonWithElevation() {
    Button(onClick = {
        //your onclick code here
    },elevation =  ButtonDefaults.buttonElevation(
        defaultElevation = 10.dp,
        pressedElevation = 15.dp,
        disabledElevation = 0.dp
    )) {
        Text(text = "Button with elevation")
    }
}