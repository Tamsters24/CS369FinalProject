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
import com.google.firebase.auth.FirebaseUser

class CreateAccount : AppCompatActivity() {
    private lateinit var wordleAcctCreate: FirebaseAuth
    private var newUserEmail: String = ""
    private var newUserPassword1: String = ""
    private var newUserPassword2: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        FirebaseApp.initializeApp(this)

        // Button
        // Navigate to Login Screen: activity_login_screen.xml & LoginScreen.kt
        findViewById<ImageButton>(R.id.newAcctToLoginBtn).setOnClickListener {
            val newAcctToLoginIntent = Intent(this, LoginScreen::class.java)
            startActivity(newAcctToLoginIntent)
        }

        // Button
        // Complete New User Account Registration
        findViewById<Button>(R.id.completeRegBtn).setOnClickListener {
            newUserEmail = findViewById<EditText>(R.id.newAcctEmail).text.toString()
            newUserPassword1 = findViewById<EditText>(R.id.newAcctPW1).text.toString()
            newUserPassword2 = findViewById<EditText>(R.id.newAcctPW2).text.toString()

            if (newUserPassword1 != newUserPassword2) {
                Toast.makeText(baseContext, "passwords do not match, try again",
                    Toast.LENGTH_SHORT).show()
            } else if (newUserEmail == "" || newUserPassword1 == "") {
                Toast.makeText(baseContext, "Missing User Registration Info",
                    Toast.LENGTH_SHORT).show()
            } else {
                createAccount(newUserEmail, newUserPassword1)
            }
        }

    }

    private fun createAccount(newEmail: String, newPassword: String) {
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(newEmail, newPassword)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d(ContentValues.TAG, "createUserWithEmail:success")
                    val newUser = FirebaseAuth.getInstance().currentUser
                    Toast.makeText(baseContext, "Registration Successful!",
                        Toast.LENGTH_SHORT).show()
                    registerUpdateUI(newUser)

                    val backToMainIntent = Intent(this, MainActivity::class.java)
                    startActivity(backToMainIntent)
                } else {
                    Log.w(ContentValues.TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Registration failed.",
                        Toast.LENGTH_SHORT).show()
                    registerUpdateUI(null)
                }
            }
    }

    private fun registerUpdateUI(user: FirebaseUser?) {
        if (user != null) {
            val userName = user.displayName
            val userEmail = user.email
        }
    }

}