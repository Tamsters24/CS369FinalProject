package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton

class GamePlay : AppCompatActivity() {
    private var cell = 1
    private var row = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)

        // Button
        // Navigate to Main Activity Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.gameToMainBtn).setOnClickListener {
            val gameToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(gameToMainIntent)
        }
    }

    fun keyLetter(view: View) {
        //val currentLetter: EditText = findViewById(R.id.calc_display_bottom)
        var keyLetter = '_'
        val letterBtn = view as ImageButton

        //if (displayNumber == "0")
        //    displayNumber = ""
        /* Concatenate integers or decimal */
        when (letterBtn.id) {
            R.id.buttonQ -> keyLetter = 'Q'
            R.id.buttonW -> keyLetter = 'W'
            R.id.buttonE -> keyLetter = 'E'
            R.id.buttonR -> keyLetter = 'R'
            R.id.buttonT -> keyLetter = 'T'
            R.id.buttonY -> keyLetter = 'Y'
            R.id.buttonU -> keyLetter = 'U'
            R.id.buttonI -> keyLetter = 'I'
            R.id.buttonO -> keyLetter = 'O'
            R.id.buttonP -> keyLetter = 'P'
            R.id.buttonA -> keyLetter = 'A'
            R.id.buttonS -> keyLetter = 'S'
            R.id.buttonD -> keyLetter = 'D'
            R.id.buttonF -> keyLetter = 'F'
            R.id.buttonG -> keyLetter = 'G'
            R.id.buttonH -> keyLetter = 'H'
            R.id.buttonJ -> keyLetter = 'J'
            R.id.buttonK -> keyLetter = 'K'
            R.id.buttonL -> keyLetter = 'L'
            R.id.buttonZ -> keyLetter = 'Z'
            R.id.buttonX -> keyLetter = 'X'
            R.id.buttonC -> keyLetter = 'C'
            R.id.buttonV -> keyLetter = 'V'
            R.id.buttonB -> keyLetter = 'B'
            R.id.buttonN -> keyLetter = 'N'
            R.id.buttonM -> keyLetter = 'M'
        }
        letterSet(keyLetter)
    }

    private fun letterSet(letter: Char) {
        when (row) {
            1 -> { when (cell) {
                1 -> { val currentLetter: EditText = findViewById(R.id.guess1_l1)
                    currentLetter.setText(letter.toString()) }
                2 -> { val currentLetter: EditText = findViewById(R.id.guess1_l2)
                    currentLetter.setText(letter.toString()) }
                3 -> { val currentLetter: EditText = findViewById(R.id.guess1_l3)
                    currentLetter.setText(letter.toString()) }
                4 -> { val currentLetter: EditText = findViewById(R.id.guess1_l4)
                    currentLetter.setText(letter.toString()) }
                5 -> { val currentLetter: EditText = findViewById(R.id.guess1_l5)
                    currentLetter.setText(letter.toString()) }
                }
                if (cell < 6) cell++
            }
            2 -> { when (cell) {
                1 -> { val currentLetter: EditText = findViewById(R.id.guess2_l1)
                    currentLetter.setText(letter.toString()) }
                2 -> { val currentLetter: EditText = findViewById(R.id.guess2_l2)
                    currentLetter.setText(letter.toString()) }
                3 -> { val currentLetter: EditText = findViewById(R.id.guess2_l3)
                    currentLetter.setText(letter.toString()) }
                4 -> { val currentLetter: EditText = findViewById(R.id.guess2_l4)
                    currentLetter.setText(letter.toString()) }
                5 -> { val currentLetter: EditText = findViewById(R.id.guess2_l5)
                    currentLetter.setText(letter.toString()) }
            }
                if (cell < 6) cell++
            }
        }
    }

    fun deleteLetter(view: View) {
        val deleteBtn = view as ImageButton
        when (cell) {
            5 -> {
                val currentLetter: EditText = findViewById(R.id.guess1_l5)
                currentLetter.setText("")
            }
            4 -> {
                val currentLetter: EditText = findViewById(R.id.guess1_l4)
                currentLetter.setText("")
            }
            3 -> {
                val currentLetter: EditText = findViewById(R.id.guess1_l3)
                currentLetter.setText("")
            }
            2 -> {
                val currentLetter: EditText = findViewById(R.id.guess1_l2)
                currentLetter.setText("")
            }
            1 -> {
                val currentLetter: EditText = findViewById(R.id.guess1_l1)
                currentLetter.setText("")
            }
        }
        if (cell > 1) cell--
    }

    fun checkGuess(view: View) {
        val checkGuessBtn = view as ImageButton

    }

}