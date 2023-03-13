package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PlayerStats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_stats)

        // Button
        // Navigate to Login Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.statsToMainBtn).setOnClickListener {
            val statsToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(statsToMainIntent)
        }
    }
}