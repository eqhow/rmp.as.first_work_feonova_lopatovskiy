package com.astnina_lopatovskiy.first_app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage: ImageView = findViewById(R.id.diceImage)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            val number = Random.nextInt(1, 7)
            val imageRes = when (number) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(imageRes)
        }
    }
}