package com.example.lr1_first_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.lr1_first_app.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private val textViewModel: MainViewModel by viewModels()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        textViewModel.text.observe(this) { newText ->
            binding.textView1.text = newText
        }
        binding.button1.setOnClickListener {
            val newText = "Change text"
            textViewModel.changeText(newText)
        }
    }
}