package com.example.diceroller

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        dice_roll.setOnClickListener {
            lets_start.text = "Game is on..."
            get_random_number()
        }

        dice_reset.setOnClickListener {
            lets_start.text = "Lets play again!!"
            reset_number()
        }
    }

    private fun reset_number() {
        generate_random_image.setImageResource(R.drawable.empty_dice)
    }

    private fun get_random_number() {

        val randomInt = (1..6).random()
        when (randomInt) {
            1 -> generate_random_image.setImageResource(R.drawable.dice_1)
            2 -> generate_random_image.setImageResource(R.drawable.dice_2)
            3 -> generate_random_image.setImageResource(R.drawable.dice_3)
            4 -> generate_random_image.setImageResource(R.drawable.dice_4)
            5 -> generate_random_image.setImageResource(R.drawable.dice_5)
            6 -> generate_random_image.setImageResource(R.drawable.dice_6)
        }
    }
}