package com.jorryn.myhistoryapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {

    private lateinit var searchButton: Button
    private lateinit var clearButton: Button
    private lateinit var editText: EditText
    private lateinit var resultTextView: TextView
    private lateinit var constraintLayout: ConstraintLayout

    // Map to store the image resource IDs corresponding to each historical figure number
    private val historicalFiguresImages = mapOf(

        67 to R.drawable.ileonardo,
        88 to R.drawable.imichelangelo,
        37 to R.drawable.ivincentt,
        91 to R.drawable.ipicasso,
        63 to R.drawable.irembrandt,
        86 to R.drawable.iclaude,
        43 to R.drawable.ijohannes,
        65 to R.drawable.ibotticelli,
        38 to R.drawable.icaravaggio,
        44 to R.drawable.ieyck,
        61 to R.drawable.idiego,
        71 to R.drawable.istern,

        1 to R.drawable.trytoinputanothernumber,
        2 to R.drawable.trytoinputanothernumber,
        3 to R.drawable.trytoinputanothernumber,
        4 to R.drawable.trytoinputanothernumber,
        5 to R.drawable.trytoinputanothernumber,
        6 to R.drawable.trytoinputanothernumber,
        7 to R.drawable.trytoinputanothernumber,
        8 to R.drawable.trytoinputanothernumber,
        9 to R.drawable.trytoinputanothernumber,
        10 to R.drawable.trytoinputanothernumber,
        11 to R.drawable.trytoinputanothernumber,
        12 to R.drawable.trytoinputanothernumber,
        13 to R.drawable.trytoinputanothernumber,
        14 to R.drawable.trytoinputanothernumber,
        15 to R.drawable.trytoinputanothernumber,
        16 to R.drawable.trytoinputanothernumber,
        17 to R.drawable.trytoinputanothernumber,
        18 to R.drawable.trytoinputanothernumber,
        19 to R.drawable.trytoinputanothernumber,
        20 to R.drawable.trytoinputanothernumber,
        21 to R.drawable.trytoinputanothernumber,
        22 to R.drawable.trytoinputanothernumber,
        23 to R.drawable.trytoinputanothernumber,
        24 to R.drawable.trytoinputanothernumber,
        25 to R.drawable.trytoinputanothernumber,
        26 to R.drawable.trytoinputanothernumber,
        27 to R.drawable.trytoinputanothernumber,
        28 to R.drawable.trytoinputanothernumber,
        29 to R.drawable.trytoinputanothernumber,
        30 to R.drawable.trytoinputanothernumber,
        31 to R.drawable.trytoinputanothernumber,
        32 to R.drawable.trytoinputanothernumber,
        33 to R.drawable.trytoinputanothernumber,
        34 to R.drawable.trytoinputanothernumber,
        35 to R.drawable.trytoinputanothernumber,
        36 to R.drawable.trytoinputanothernumber,


        39 to R.drawable.trytoinputanothernumber,
        40 to R.drawable.trytoinputanothernumber,
        41 to R.drawable.trytoinputanothernumber,
        42 to R.drawable.trytoinputanothernumber,


        45 to R.drawable.trytoinputanothernumber,
        46 to R.drawable.trytoinputanothernumber,
        47 to R.drawable.trytoinputanothernumber,
        48 to R.drawable.trytoinputanothernumber,
        49 to R.drawable.trytoinputanothernumber,
        50 to R.drawable.trytoinputanothernumber,
        51 to R.drawable.trytoinputanothernumber,
        52 to R.drawable.trytoinputanothernumber,
        53 to R.drawable.trytoinputanothernumber,
        54 to R.drawable.trytoinputanothernumber,
        55 to R.drawable.trytoinputanothernumber,
        56 to R.drawable.trytoinputanothernumber,
        57 to R.drawable.trytoinputanothernumber,
        58 to R.drawable.trytoinputanothernumber,
        59 to R.drawable.trytoinputanothernumber,
        60 to R.drawable.trytoinputanothernumber,

        62 to R.drawable.trytoinputanothernumber,

        64 to R.drawable.trytoinputanothernumber,

        66 to R.drawable.trytoinputanothernumber,

        68 to R.drawable.trytoinputanothernumber,
        69 to R.drawable.trytoinputanothernumber,
        70 to R.drawable.trytoinputanothernumber,

        72 to R.drawable.trytoinputanothernumber,
        73 to R.drawable.trytoinputanothernumber,
        74 to R.drawable.trytoinputanothernumber,
        75 to R.drawable.trytoinputanothernumber,
        76 to R.drawable.trytoinputanothernumber,
        78 to R.drawable.trytoinputanothernumber,
        79 to R.drawable.trytoinputanothernumber,
        80 to R.drawable.trytoinputanothernumber,
        81 to R.drawable.trytoinputanothernumber,
        82 to R.drawable.trytoinputanothernumber,
        83 to R.drawable.trytoinputanothernumber,
        84 to R.drawable.trytoinputanothernumber,
        85 to R.drawable.trytoinputanothernumber,

        87 to R.drawable.trytoinputanothernumber,

        89 to R.drawable.trytoinputanothernumber,
        90 to R.drawable.trytoinputanothernumber,

        92 to R.drawable.trytoinputanothernumber,
        93 to R.drawable.trytoinputanothernumber,
        94 to R.drawable.trytoinputanothernumber,
        95 to R.drawable.trytoinputanothernumber,
        96 to R.drawable.trytoinputanothernumber,
        97 to R.drawable.trytoinputanothernumber,
        98 to R.drawable.trytoinputanothernumber,
        99 to R.drawable.trytoinputanothernumber,
        100 to R.drawable.trytoinputanothernumber,

        // Add more entries for other historical figures as needed
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        editText = findViewById(R.id.editText)
        resultTextView = findViewById(R.id.resultTextView)
        constraintLayout = findViewById(R.id.main)

        clearButton.setOnClickListener {
            editText.text.clear()
        }

        searchButton.setOnClickListener {
            // Get the text entered by the user
            val input = editText.text.toString()

            // Check if the input is numeric
            if (!input.matches(Regex("\\d+"))) {
                // Display an error message for non-numeric input
                resultTextView.text = "The input is invalid, enter a number from 20 to 100."
                // Set the background of the ConstraintLayout to "trytoinputanothernumber"
                constraintLayout.setBackgroundResource(R.drawable.trytoinputanothernumber)
                // Clear the EditText
                editText.text.clear()
                // Return early from the function
                return@setOnClickListener
            }

            // Get the historical figure number entered by the user
            val num = input.toInt()

            // Check if the number is within the range of 20 to 100
            if (num !in 20..100) {
                // Display an error message for out-of-range input
                resultTextView.text = "Please enter a valid number from 20 to 100."
                // Clear the EditText
                editText.text.clear()
                // Return early from the function
                return@setOnClickListener
            }

            // Retrieve the corresponding image resource ID from the map
            val imageResourceId = historicalFiguresImages[num] ?: R.drawable.trytoinputanothernumber
            // Set the background of the ConstraintLayout to the retrieved image
            constraintLayout.setBackgroundResource(imageResourceId)

            // Get the description of the historical figure
            val specialNum = when (num) {
                67 -> "Leonardo da Vinci, he lived until the age of 67"
                88 -> "Michelangelo Buonarroti, he lived until the age of 88"
                37 -> "Vincent van Gogh, he lived until the age of 37"
                91 -> "Pablo Picasso, he lived until the age of 91"
                63 -> "Rembrandt van Rijn, he lived until the age of 63"
                86 -> "Claude Monet,he lived until the age of 86"
                43 -> "Johannes Vermeer, he lived until the age of 43"
                65 -> "Sandro Botticelli, he lived until the age of 85"
                38 -> "Caravaggio,he lived until the age of 38"
                44 -> "Jan van Eyck, he lived until the age of 44"
                61 -> "Diego Velázquez, he lived until the age of 61"
                71 -> "Irma Stern, she lived until the age of 61"
                // Add more cases for other historical figures as needed
                else -> null
            }

            // Display the description in the resultTextView
            val message = if (specialNum != null) {
                "Your historical twin is $specialNum."
            } else {
                "No one seems to match your age."
            }
            resultTextView.text = message
        }
    }
}
