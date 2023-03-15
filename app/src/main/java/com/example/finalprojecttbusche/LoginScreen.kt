package com.example.finalprojecttbusche

// Reference: https://github.com/firebase/snippets-android/blob/16e5a7ec671f219373846a16b46fcae4a8e5f6b7/auth/app/src/main/java/com/google/firebase/quickstart/auth/kotlin/EmailPasswordActivity.kt#L15-L15

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginScreen : AppCompatActivity() {
    private lateinit var wordleLogin: FirebaseAuth
    private var userEmail: String = ""
    private var userPassword: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)
        wordleLogin = Firebase.auth

        FirebaseApp.initializeApp(this)

        // Button
        // Navigate to Main Activity Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.loginToMainBtn).setOnClickListener {
            val loginToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(loginToMainIntent)
        }

        // Button
        // Navigate to Create Account Screen: activity_create_account.xml & CreateAccount.kt
        findViewById<Button>(R.id.loginToCreateAcctBtn).setOnClickListener {
            val loginToCreateAcctIntent = Intent(this, CreateAccount::class.java)
            startActivity(loginToCreateAcctIntent)
        }

        // Button
        // Forgot Password Action
        findViewById<Button>(R.id.forgotPwdBtn).setOnClickListener {
            //val loginToMainIntent = Intent(this, MainActivity::class.java)
            //startActivity(loginToMainIntent)
        }

        // Button
        // Account Login
        findViewById<Button>(R.id.acctLoginBtn).setOnClickListener {
            userEmail = findViewById<EditText>(R.id.loginEmail).text.toString()
            userPassword = findViewById<EditText>(R.id.loginPassword).text.toString()
            if (userEmail == "" || userPassword == "") {
                Toast.makeText(baseContext, "Missing User Login Info",
                    Toast.LENGTH_SHORT).show()
            } else
                login(userEmail, userPassword)
        }
    }

    private fun login(email: String, password: String) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d(TAG, "signInWithEmail:success")
                    val user = FirebaseAuth.getInstance().currentUser
                    Toast.makeText(baseContext, "Welcome to Wordle!",
                        Toast.LENGTH_SHORT).show()
                    updateUI(user)

                    val returnToMainIntent = Intent(this, MainActivity::class.java)
                    startActivity(returnToMainIntent)
                } else {
                    Log.w(TAG, "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
    }

    private fun updateUI(user: FirebaseUser?) {
        if (user != null) {
            val userName = user.displayName
            val userEmail = user.email
        }
    }
}