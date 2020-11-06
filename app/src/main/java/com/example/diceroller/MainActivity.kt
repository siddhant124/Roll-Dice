package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        dice_roll.setOnClickListener {
            get_random_number()
        }

        dice_reset.setOnClickListener {
            reset_number()
        }
    }

    private fun reset_number() {
        val randomNumber = findViewById<TextView>(R.id.generate_random_number)
        randomNumber.text = "Roll Dice!!"
    }

    private fun get_random_number() {
        val randomInt = (1..6).random()
        val randomNumber = findViewById<TextView>(R.id.generate_random_number)
        randomNumber.text = randomInt.toString()
    }
}