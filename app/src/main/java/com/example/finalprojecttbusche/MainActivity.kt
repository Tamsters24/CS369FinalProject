package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Image Button
        // Navigate to Game: activity_game_play.xml & GamePlay.kt
        findViewById<ImageButton>(R.id.mainToGameBtn).setOnClickListener {
            val mainToGameIntent = Intent(this, GamePlay::class.java)
            startActivity(mainToGameIntent)
        }

        // Button
        // Navigate to Login Screen: activity_login_screen.xml & LoginScreen.kt
        findViewById<Button>(R.id.mainToLoginBtn).setOnClickListener {
            val mainToLoginIntent = Intent(this, LoginScreen::class.java)
            startActivity(mainToLoginIntent)
        }

        // Button
        // Navigate to Stats Screen: activity_player_stats.xml & PlayerStats.kt
        findViewById<Button>(R.id.mainToStatsBtn).setOnClickListener {
            val mainToStatsIntent = Intent(this, PlayerStats::class.java)
            startActivity(mainToStatsIntent)
        }

        // Button
        // Navigate to How to Play: activity_how_to_play.xml & HowToPlay.kt
        findViewById<Button>(R.id.mainToHowToBtn).setOnClickListener {
            val mainToHowToIntent = Intent(this, HowToPlay::class.java)
            startActivity(mainToHowToIntent)
        }
    }
}