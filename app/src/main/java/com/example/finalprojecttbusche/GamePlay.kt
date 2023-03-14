package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class GamePlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)

        // Set keyboard characters
        keyboard()

        // Button
        // Navigate to Main Activity Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.gameToMainBtn).setOnClickListener {
            val gameToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(gameToMainIntent)
        }
    }

    private fun keyboard() {
        val alpha = findViewById<Button>(R.id.buttonA)
        alpha.text = "A"

        val bravo = findViewById<Button>(R.id.buttonB)
        bravo.text = "B"

        val charlie = findViewById<Button>(R.id.buttonC)
        charlie.text = "C"

        val delta = findViewById<Button>(R.id.buttonD)
        delta.text = "D"

        val echo = findViewById<Button>(R.id.buttonE)
        echo.text = "E"

        val foxtrot = findViewById<Button>(R.id.buttonF)
        foxtrot.text = "F"

        val golf = findViewById<Button>(R.id.buttonG)
        golf.text = "G"

        val hotel = findViewById<Button>(R.id.buttonH)
        hotel.text = "H"

        val india = findViewById<Button>(R.id.buttonI)
        india.text = "I"

        val juliett = findViewById<Button>(R.id.buttonJ)
        juliett.text = "J"

        val kilo = findViewById<Button>(R.id.buttonK)
        kilo.text = "K"

        val lima = findViewById<Button>(R.id.buttonL)
        lima.text = "L"

        val mike = findViewById<Button>(R.id.buttonM)
        mike.text = "M"

        val november = findViewById<Button>(R.id.buttonN)
        november.text = "N"

        val oscar = findViewById<Button>(R.id.buttonO)
        oscar.text = "O"

        val papa = findViewById<Button>(R.id.buttonP)
        papa.text = "P"

        val quebec = findViewById<Button>(R.id.buttonQ)
        quebec.text = "Q"

        val romeo = findViewById<Button>(R.id.buttonR)
        romeo.text = "R"

        val sierra = findViewById<Button>(R.id.buttonS)
        sierra.text = "S"

        val tango = findViewById<Button>(R.id.buttonT)
        tango.text = "T"

        val uniform = findViewById<Button>(R.id.buttonU)
        uniform.text = "U"

        val victor = findViewById<Button>(R.id.buttonV)
        victor.text = "V"

        val whiskey = findViewById<Button>(R.id.buttonW)
        whiskey.text = "W"

        val xray = findViewById<Button>(R.id.buttonX)
        xray.text = "U"

        val yankee = findViewById<Button>(R.id.buttonY)
        yankee.text = "Y"

        val zulu = findViewById<Button>(R.id.buttonZ)
        zulu.text = "Z"
    }
}