package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button
        // Navigate to Login Screen: activity_login_screen.xml & StudentInfo.kt
        findViewById<Button>(R.id.mainToLoginBtn).setOnClickListener {
            val submitOnlineIntent = Intent(this, LoginScreen::class.java)
            startActivity(submitOnlineIntent)
        }
    }
}