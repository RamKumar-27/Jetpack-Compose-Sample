package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Column(//column use to arrange the children vertically
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Sample text One",
                        style = TextStyle(
                            color = colorResource(id = R.color.teal_700),
                            fontSize = 24.sp
                        )
                    )
                    addSpace()
                    Text(
                        text = "Sample text two",
                        style = TextStyle(
                            color = colorResource(id = R.color.black),
                            fontSize = 16.sp
                        )
                    )
                    addSpace()
                    Button(onClick = { }, modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Clickable",
                            style = TextStyle(
                                fontSize = 14.sp
                            )
                        )
                    }
                    addSpace()
                    Row(//Row use to arrange the children Horizontally
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp),
                        Arrangement.SpaceEvenly
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_frame),
                            contentDescription = null
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_picture_frames),
                            contentDescription = null
                        )

                    }
                }
            }
        }
    }

    /*If you add any common view means you should add Composable annotate operator for that method*/
    @Composable
    fun addSpace() {
        Spacer(modifier = Modifier.padding(4.dp))//give some space
    }
}


