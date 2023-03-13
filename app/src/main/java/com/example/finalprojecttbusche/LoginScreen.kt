package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        // Button
        // Navigate to Login Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.loginToMainBtn).setOnClickListener {
            val loginToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(loginToMainIntent)
        }
    }
}