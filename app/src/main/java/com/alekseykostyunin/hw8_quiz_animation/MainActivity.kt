package com.alekseykostyunin.hw8_quiz_animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alekseykostyunin.hw8_quiz_animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}