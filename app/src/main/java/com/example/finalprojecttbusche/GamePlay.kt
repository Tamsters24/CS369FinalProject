package com.example.finalprojecttbusche

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class GamePlay : AppCompatActivity() {
    private var cell = 0
    private var row = 1
    private var guessString: String = ""
    private var guessNum: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)
        // Disable user keyboard. An on-screen keyboard used.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)

        // Button
        // Navigate to Main Activity Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.gameToMainBtn).setOnClickListener {
            val gameToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(gameToMainIntent)
        }
    }

    fun keyLetter(view: View) {
        var keyLetter = ' '
        val letterBtn = view as ImageButton

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
        // End game if more than 6 guesses have been attempted
        if (row <= 6)
            if (cell <= 4) {
                cell++
                when (row) {
                    1 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess1_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess1_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess1_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess1_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess1_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                    2 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess2_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess2_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess2_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess2_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess2_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                    3 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess3_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess3_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess3_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess3_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess3_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                    4 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess4_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess4_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess4_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess4_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess4_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                    5 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess5_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess5_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess5_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess5_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess5_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                    6 -> when (cell) {
                        1 -> {
                            val currentLetter: EditText = findViewById(R.id.guess6_l1)
                            currentLetter.setText(letter.toString())
                        }
                        2 -> {
                            val currentLetter: EditText = findViewById(R.id.guess6_l2)
                            currentLetter.setText(letter.toString())
                        }
                        3 -> {
                            val currentLetter: EditText = findViewById(R.id.guess6_l3)
                            currentLetter.setText(letter.toString())
                        }
                        4 -> {
                            val currentLetter: EditText = findViewById(R.id.guess6_l4)
                            currentLetter.setText(letter.toString())
                        }
                        5 -> {
                            val currentLetter: EditText = findViewById(R.id.guess6_l5)
                            currentLetter.setText(letter.toString())
                        }
                    }
                }
            }
        //Toast.makeText(baseContext, "current cell $cell current row $row", Toast.LENGTH_SHORT).show()
    }

    fun deleteLetter(view: View) {
        val deleteBtn = view as ImageButton
        when (row) {
            1 -> when (cell) {
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
            2 -> when (cell) {
                5 -> {
                    val currentLetter: EditText = findViewById(R.id.guess2_l5)
                    currentLetter.setText("")
                }
                4 -> {
                    val currentLetter: EditText = findViewById(R.id.guess2_l4)
                    currentLetter.setText("")
                }
                3 -> {
                    val currentLetter: EditText = findViewById(R.id.guess2_l3)
                    currentLetter.setText("")
                }
                2 -> {
                    val currentLetter: EditText = findViewById(R.id.guess2_l2)
                    currentLetter.setText("")
                }
                1 -> {
                    val currentLetter: EditText = findViewById(R.id.guess2_l1)
                    currentLetter.setText("")
                }
            }
            3 -> when (cell) {
                5 -> {
                    val currentLetter: EditText = findViewById(R.id.guess3_l5)
                    currentLetter.setText("")
                }
                4 -> {
                    val currentLetter: EditText = findViewById(R.id.guess3_l4)
                    currentLetter.setText("")
                }
                3 -> {
                    val currentLetter: EditText = findViewById(R.id.guess3_l3)
                    currentLetter.setText("")
                }
                2 -> {
                    val currentLetter: EditText = findViewById(R.id.guess3_l2)
                    currentLetter.setText("")
                }
                1 -> {
                    val currentLetter: EditText = findViewById(R.id.guess3_l1)
                    currentLetter.setText("")
                }
            }
            4 -> when (cell) {
                5 -> {
                    val currentLetter: EditText = findViewById(R.id.guess4_l5)
                    currentLetter.setText("")
                }
                4 -> {
                    val currentLetter: EditText = findViewById(R.id.guess4_l4)
                    currentLetter.setText("")
                }
                3 -> {
                    val currentLetter: EditText = findViewById(R.id.guess4_l3)
                    currentLetter.setText("")
                }
                2 -> {
                    val currentLetter: EditText = findViewById(R.id.guess4_l2)
                    currentLetter.setText("")
                }
                1 -> {
                    val currentLetter: EditText = findViewById(R.id.guess4_l1)
                    currentLetter.setText("")
                }
            }
            5 -> when (cell) {
                5 -> {
                    val currentLetter: EditText = findViewById(R.id.guess5_l5)
                    currentLetter.setText("")
                }
                4 -> {
                    val currentLetter: EditText = findViewById(R.id.guess5_l4)
                    currentLetter.setText("")
                }
                3 -> {
                    val currentLetter: EditText = findViewById(R.id.guess5_l3)
                    currentLetter.setText("")
                }
                2 -> {
                    val currentLetter: EditText = findViewById(R.id.guess5_l2)
                    currentLetter.setText("")
                }
                1 -> {
                    val currentLetter: EditText = findViewById(R.id.guess5_l1)
                    currentLetter.setText("")
                }
            }
            6 -> when (cell) {
                5 -> {
                    val currentLetter: EditText = findViewById(R.id.guess6_l5)
                    currentLetter.setText("")
                }
                4 -> {
                    val currentLetter: EditText = findViewById(R.id.guess6_l4)
                    currentLetter.setText("")
                }
                3 -> {
                    val currentLetter: EditText = findViewById(R.id.guess6_l3)
                    currentLetter.setText("")
                }
                2 -> {
                    val currentLetter: EditText = findViewById(R.id.guess6_l2)
                    currentLetter.setText("")
                }
                1 -> {
                    val currentLetter: EditText = findViewById(R.id.guess6_l1)
                    currentLetter.setText("")
                }
            }
        }
        if (cell > 0) cell--
        Toast.makeText(baseContext, "current cell $cell current row $row", Toast.LENGTH_SHORT).show()
    }

    fun checkGuess(view: View) {
        val checkGuessBtn = view as ImageButton
        if (cell < 5) { /* Do nothing */ }
        else {
            when (row) {
                1 -> {
                    val l1editText: EditText = findViewById(R.id.guess1_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess1_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess1_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess1_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess1_l5)
                    guessString += l5editText.text.toString()
                }
                2 -> {
                    val l1editText: EditText = findViewById(R.id.guess2_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess2_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess2_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess2_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess2_l5)
                    guessString += l5editText.text.toString()
                }
                3 -> {
                    val l1editText: EditText = findViewById(R.id.guess3_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess3_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess3_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess3_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess3_l5)
                    guessString += l5editText.text.toString()
                }
                4 -> {
                    val l1editText: EditText = findViewById(R.id.guess4_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess4_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess4_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess4_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess4_l5)
                    guessString += l5editText.text.toString()
                }
                5 -> {
                    val l1editText: EditText = findViewById(R.id.guess5_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess5_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess5_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess5_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess5_l5)
                    guessString += l5editText.text.toString()
                }
                6 -> {
                    val l1editText: EditText = findViewById(R.id.guess6_l1)
                    guessString += l1editText.text.toString()
                    val l2editText: EditText = findViewById(R.id.guess6_l2)
                    guessString += l2editText.text.toString()
                    val l3editText: EditText = findViewById(R.id.guess6_l3)
                    guessString += l3editText.text.toString()
                    val l4editText: EditText = findViewById(R.id.guess6_l4)
                    guessString += l4editText.text.toString()
                    val l5editText: EditText = findViewById(R.id.guess6_l5)
                    guessString += l5editText.text.toString()
                }
            }
        }

        if (guessString.length < 5) { /* do nothing */ }
        else {
            Toast.makeText(baseContext, guessString, Toast.LENGTH_SHORT).show()
            row++
            cell = 0
            guessString = ""
            guessNum++
        }
        if (guessNum == 6) {
            Toast.makeText(baseContext, "Game Over", Toast.LENGTH_SHORT).show()
        }
    }
}
