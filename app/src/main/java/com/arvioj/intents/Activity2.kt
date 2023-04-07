package com.arvioj.intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        val boton2 : Button
        boton2 = findViewById(R.id.button2)

        boton2.setOnClickListener() {
            val intent2 : Intent
            intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
        }
    }
}