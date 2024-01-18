package com.example.helloinf2007

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloinf2007.ui.theme.HelloINF2007Theme
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloINF2007Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting("INF2007")
                        From("Alan")
                    }
                }
            }
        }

        val dateTime = getTime()

        Log.d("MainActivity","“OnCreate function is created at $dateTime.")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun From(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "From $name!" ,
        modifier = modifier
    )
}

// Function to Call to get the current Date and Time.
fun getTime(): String {
    // Get the current Date and Time.
    val currentDateTime = LocalDateTime.now()

    // Define a custom date and time format.
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    // Format the current date and time using formatter and Return it.
    return currentDateTime.format(formatter)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloINF2007Theme {
        Column {
            Greeting("INF2007")
            From("Alan")
        }
    }
}
