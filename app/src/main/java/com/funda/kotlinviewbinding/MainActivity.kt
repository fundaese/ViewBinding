package com.funda.kotlinviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.funda.kotlinviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvname.text = "Funda ESE"
    }


}