package com.arvioj.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 : Button
        boton1 = findViewById(R.id.button)

        boton1.setOnClickListener() {
        val intent1 : Intent
        intent1 = Intent(this, Activity2::class.java)
        startActivity(intent1)
        }

    }
}