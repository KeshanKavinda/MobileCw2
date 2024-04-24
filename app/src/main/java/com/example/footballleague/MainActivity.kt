package com.example.footballleague

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.footballleague.ui.theme.FootBallLeagueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Football Club Details",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold ,
                            modifier = Modifier.padding(bottom = 16.dp)


                        )



                        Button(
                            onClick = { /*Intent(applicationContext,GuessTheCountry::class.java).also { startActivity(it) }*/ },
                            modifier = Modifier.padding(12.dp).height(55.dp).width(230.dp),
                            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                        ) {
                            Text(text = "Add Leagues to DB")
                        }
                        Button(
                            onClick = { /*Intent(applicationContext,GuessHint::class.java).also { startActivity(it) } */},
                            modifier = Modifier.padding(12.dp).height(55.dp).width(230.dp),
                            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                        ) {
                            Text(text = "Search for Clubs By League")
                        }
                        Button(
                            onClick = { /*Intent(applicationContext,GuessTheFlag::class.java).also { startActivity(it) }*/ },
                            modifier = Modifier.padding(12.dp).height(55.dp).width(230.dp),
                            shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                        ) {
                            Text(text = "Search for Clubs")
                        }

                    }
                }
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FootBallLeagueTheme {
        Greeting("Android")
    }
}