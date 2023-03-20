package com.example.finalprojecttbusche

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.io.BufferedReader
import java.io.InputStreamReader

class GamePlay : AppCompatActivity() {
    private var cell = 0
    private var row = 1
    private var guessString: String = ""
    private var wordle: String = ""
    private val wordleWords = mutableListOf<String>()   // list of words from sgb-words.txt
    private var guessNum = 0
    private lateinit var l1editText: EditText           // For each of the 5 letters of a guess
    private lateinit var l2editText: EditText
    private lateinit var l3editText: EditText
    private lateinit var l4editText: EditText
    private lateinit var l5editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_play)

        // Disable user keyboard. An on-screen keyboard used.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM,
            WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM)

        // Button
        // Navigate to Main Activity Screen: activity_main.xml & MainActivity.kt
        findViewById<ImageButton>(R.id.newGame).setOnClickListener {
            val newGameIntent = Intent(this, GamePlay::class.java)
            startActivity(newGameIntent)
        }

        // Retrieve a random word for from sgb-words.txt for game
        randomWordle()

        // Button
        // Start a new Game Play Activity Screen: activity_game_play.xml & GamePlay.kt
        findViewById<ImageButton>(R.id.gameToMainBtn).setOnClickListener {
            val gameToMainIntent = Intent(this, MainActivity::class.java)
            startActivity(gameToMainIntent)
        }
    }

    // Gets a word from the sgb-words.txt for the current game
    private fun randomWordle() {
        val inStream = assets.open("sgb-words.txt") // sgb-words.txt located in app/src/main/assets directory

        // Read each line of sgb-words.txt and add to wordleWords list
        val bufferedReader = BufferedReader(InputStreamReader(inStream))
        var word = bufferedReader.readLine()
        while (word != null) {
            wordleWords.add(word)
            word = bufferedReader.readLine()
            println(word)
        }
        bufferedReader.close()

        // Use a random value to pick a word from the list
        val randomValue = (0..wordleWords.size).random()
        wordle = wordleWords[randomValue]
        wordle = wordle.uppercase()

        // Toast for testing while creating, uncomment if you want to cheat (haha).
        Toast.makeText(baseContext, "The correct word is $wordle", Toast.LENGTH_SHORT).show()
    }

    // The game keyboard. ImageButtons are used because normal buttons cannot
    // facilitate a small enough font-size to fit all keys on the screen
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

    // When a letter key is selected, sets the character for the
    // current cell on the current row.
    private fun letterSet(letter: Char) {
        if (row <= 6)           // End game if more than 6 guesses have been attempted
            if (cell <= 4) {    // Increment cell value up to 5. Do nothing otherwise
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
        // For testing
        // Toast.makeText(baseContext, "current cell $cell current row $row", Toast.LENGTH_SHORT).show()
    }

    // When the delete button is selected, set the EditText to "" at the
    // current cell, and then decrement to the previous cell
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
        //For testing
        //Toast.makeText(baseContext, "current cell $cell current row $row", Toast.LENGTH_SHORT).show()
    }

    // If all 5 cells of a row are filled when the enter button is selected
    // check the current user's guess against the Wordle. If the current
    // row has less than 5 letters (cells), do nothing.
    fun checkGuess(view: View) {
        val checkGuessBtn = view as ImageButton
        if (cell < 5) { /* Do nothing */ }
        else {
            when (row) {
                1 -> {
                    l1editText = findViewById(R.id.guess1_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess1_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess1_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess1_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess1_l5)
                    guessString += l5editText.text.toString()
                }
                2 -> {
                    l1editText = findViewById(R.id.guess2_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess2_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess2_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess2_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess2_l5)
                    guessString += l5editText.text.toString()
                }
                3 -> {
                    l1editText = findViewById(R.id.guess3_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess3_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess3_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess3_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess3_l5)
                    guessString += l5editText.text.toString()
                }
                4 -> {
                    l1editText = findViewById(R.id.guess4_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess4_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess4_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess4_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess4_l5)
                    guessString += l5editText.text.toString()
                }
                5 -> {
                    l1editText = findViewById(R.id.guess5_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess5_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess5_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess5_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess5_l5)
                    guessString += l5editText.text.toString()
                }
                6 -> {
                    l1editText = findViewById(R.id.guess6_l1)
                    guessString += l1editText.text.toString()
                    l2editText = findViewById(R.id.guess6_l2)
                    guessString += l2editText.text.toString()
                    l3editText = findViewById(R.id.guess6_l3)
                    guessString += l3editText.text.toString()
                    l4editText = findViewById(R.id.guess6_l4)
                    guessString += l4editText.text.toString()
                    l5editText = findViewById(R.id.guess6_l5)
                    guessString += l5editText.text.toString()
                }
            }
        }
        if (guessString.length < 5) { /* do nothing, this is redundant, but an extra catch if needed */ }
        else if (guessString == wordle) {   // User's guess is the Wordle. Color cells and post message
            cellColor(l1editText, guessString, 0)
            cellColor(l2editText, guessString, 1)
            cellColor(l3editText, guessString, 2)
            cellColor(l4editText, guessString, 3)
            cellColor(l5editText, guessString, 4)

            row = 7     // to disable further gameplay
            guessNum++
            val winMessage = "\t\t\tYou Won is $guessNum guesses!\nClick \"Wordle\" for a new game"
            Toast.makeText(baseContext, winMessage, Toast.LENGTH_LONG).show()
        } // User's guess is incorrect. Color cells, increment row and guessNum, reset cell and guessString
        else if (wordleWords.contains(guessString.lowercase())) {
            cellColor(l1editText, guessString, 0)
            cellColor(l2editText, guessString, 1)
            cellColor(l3editText, guessString, 2)
            cellColor(l4editText, guessString, 3)
            cellColor(l5editText, guessString, 4)

            row++
            cell = 0
            guessString = ""
            guessNum++

            //For testing
            //Toast.makeText(baseContext, guessString, Toast.LENGTH_SHORT).show()
        } // User's guess is not a valid word. Print message to try again and reset guessString.
        else if (!wordleWords.contains(guessString.lowercase())) {
            Toast.makeText(baseContext, "Not a valid word, try again", Toast.LENGTH_SHORT).show()
            guessString = ""
        }
        // If User has 6 unsuccessful guesses, the game is over. Print message and Wordle.
        if (guessNum == 6) {
            val gameOver = "Game Over. Correct word is $wordle\n\tClick \"Wordle\" for a new game"
            Toast.makeText(baseContext, gameOver, Toast.LENGTH_LONG).show()
        }
    }

    private fun cellColor(editText: EditText, string: String, int: Int) {
        val correctLetterAndSpot = ContextCompat.getDrawable(this, R.drawable.game_table_correct_background)
        val correctLetterWrongSpot = ContextCompat.getDrawable(this, R.drawable.game_table_wrong_spot_background)
        val wrongLetterWrongSpot = ContextCompat.getDrawable(this, R.drawable.game_table_wrong_background)

        if (wordle[int] == string[int])
            editText.setBackgroundDrawable(correctLetterAndSpot)
        else if (wordle.contains(string[int]))
            editText.setBackgroundDrawable(correctLetterWrongSpot)
        else
            editText.setBackgroundDrawable(wrongLetterWrongSpot)
    }

}
