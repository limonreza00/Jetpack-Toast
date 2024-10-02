package com.coderscastle.jetpack_toast

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.coderscastle.jetpack_toast.ui.theme.JetpackToastTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackToastTheme {
                MyToast()
            }
        }
    }
}

@Composable
fun MyToast (){

    val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){

        Button(onClick = {

            Toast.makeText(context, "Hello World", Toast.LENGTH_SHORT).show()
        }) {
            Text(text = "Show Toast")
        }
    }
}