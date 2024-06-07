package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.content.Intent
import android.widget.Button

class MainActivity : ComponentActivity() {
    private lateinit var beachNameEditText: EditText
    private lateinit var cityEditText: EditText
    private lateinit var stateEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beachNameEditText = findViewById(R.id.editTextBeachName)
        cityEditText = findViewById(R.id.editTextCity)
        stateEditText = findViewById(R.id.editTextState)

        val btnIrParaParticipantes = findViewById<Button>(R.id.btnIrParaParticipantes)
        btnIrParaParticipantes.setOnClickListener {
            startActivity(Intent(this, Participantes::class.java))
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
    MyApplicationTheme {
        Greeting("Android")
    }
}