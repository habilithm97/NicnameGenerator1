package com.example.nicnamegenerator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nicnamegenerator1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
    }
}