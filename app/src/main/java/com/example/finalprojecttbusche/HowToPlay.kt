package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HowToPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_play)

        // Button
        // Navigate to Main Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.howToMainBtn).setOnClickListener {
            val howToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(howToMainIntent)
        }
    }

}