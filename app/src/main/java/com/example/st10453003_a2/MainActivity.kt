package com.example.st10453003_a2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    class MainActivity : AppCompatActivity() {

        lateinit var button: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            button = findViewById<Button>(R.id.button)

            button.setOnClickListener {
                val intent = Intent(this, Activity_main2::class.java)
                startActivity(intent)

            }

        }


    }

 enum class Activity_main2 }



