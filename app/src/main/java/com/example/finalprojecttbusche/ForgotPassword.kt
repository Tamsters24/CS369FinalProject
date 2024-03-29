package com.example.finalprojecttbusche

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ForgotPassword : AppCompatActivity() {
    private lateinit var wordlePwdEmail: FirebaseAuth
    private var resetPwdEmail: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        wordlePwdEmail = Firebase.auth
        FirebaseApp.initializeApp(this)

        // Button
        // Navigate to Login Screen: activity_login_screen.xml & LoginScreen.kt
        findViewById<ImageButton>(R.id.forgotPwdToLoginBtn).setOnClickListener {
            val forgotPwdToLoginIntent = Intent(this, LoginScreen::class.java)
            startActivity(forgotPwdToLoginIntent)
        }

        // Button
        // Send email to reset password Action
        findViewById<Button>(R.id.forgotPwdEmailBtn).setOnClickListener {
            resetPwdEmail = findViewById<EditText>(R.id.forgotEmail).text.toString()

            if (resetPwdEmail == "") {
                Toast.makeText(baseContext, "Missing User Email Info",
                    Toast.LENGTH_SHORT).show()
            } else {
                pwdEmailReset(resetPwdEmail)
            }
        }

    }

    private fun pwdEmailReset(resetEmail: String) {
        FirebaseAuth.getInstance().sendPasswordResetEmail(resetEmail)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d(ContentValues.TAG, "passwordResetWithEmail:success")
                    Toast.makeText(baseContext, "Email sent!",
                        Toast.LENGTH_SHORT).show()

                    val backToLoginIntent = Intent(this, LoginScreen::class.java)
                    startActivity(backToLoginIntent)
                } else {
                    Log.w(ContentValues.TAG, "passwordResetWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Email not sent.",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
}