package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        // Button
        // Navigate to Login Screen: activity_login_screen.xml & StudentInfo.kt
        findViewById<ImageButton>(R.id.loginToMainBtn).setOnClickListener {
            val submitOnlineIntent = Intent(this, MainActivity::class.java)
            startActivity(submitOnlineIntent)
        }
    }
}