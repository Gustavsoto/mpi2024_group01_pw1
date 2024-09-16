package com.example.pirmais_praktiskais_darbs
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pirmais_praktiskais_darbs.ui.theme.PirmaispraktiskaisdarbsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PirmaispraktiskaisdarbsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name1 = "Gustavs Oto Cers",
                        name2 = "Rainers Strads",
                        name3 = "Rainers Reds Biezais",
                        grpNr = 1,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name1: String,name2: String,name3: String, grpNr:Int, modifier: Modifier = Modifier) {
    Column{
        Text(text = "This is first application from group $grpNr:", modifier = modifier)
        Text(text = "\u2022 $name1", modifier = modifier)
        Text(text = "\u2022 $name2", modifier = modifier)
        Text(text = "\u2022 $name3", modifier = modifier)
        Text(text = "And the application was developed by $name1")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PirmaispraktiskaisdarbsTheme {
        Greeting("Gustavs Oto Cers", "Rainers Strads", "Rainers Reds Biezais", 1)
    }
}