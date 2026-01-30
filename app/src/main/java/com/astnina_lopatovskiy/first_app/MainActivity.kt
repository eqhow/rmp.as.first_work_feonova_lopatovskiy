package com.astnina_lopatovskiy.first_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.astnina_lopatovskiy.first_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // подключаем binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // кнопка
        binding.rollButton.setOnClickListener {
            val number = Random.nextInt(1, 7)

            val imageRes = when (number) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            binding.diceImage.setImageResource(imageRes)
        }
    }
}