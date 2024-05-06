package com.example.st10453003_a2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 {
    lateinit var image: ImageView
    lateinit var feedCountTextView: TextView
    lateinit var playCountTextView: TextView
    lateinit var cleanCountTextView: TextView
    var feedClickCount = 0
    var playClickCount = 0
    var cleanClickCount = 0

    @SuppressLint("MissingInflatedId")
    fun onCreate(savedInstanceState: Bundle?) {
        onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        image = findViewById<ImageView>(R.drawable.snowy) as ImageView
        feedCountTextView = findViewById<TextView>(R.id.FeedCount) as TextView
        playCountTextView = findViewById<TextView>(R.id.PlayCount) as TextView
        cleanCountTextView = findViewById<TextView>(R.id.CleanCount) as TextView


        val FeedBtn = findViewById<Button>(R.id.FeedBtn)
        FeedBtn.setOnClickListener {
            image.setImageResource(R.drawable.chew)
            feedClickCount++
            feedCountTextView.text = "$feedClickCount"
        }
        val PlayBtn = findViewById<Button>(R.id.PlayBtn)
        PlayBtn.setOnClickListener {
            image.setImageResource(R.drawable.player)
            playClickCount++
            playCountTextView.text = "$playClickCount"
        }
        val CleanBtn = findViewById<Button>(R.id.CleanBtn)
        CleanBtn.setOnClickListener {
            image.setImageResource(R.drawable.bubbles)
            cleanClickCount++
            cleanCountTextView.text = "$cleanClickCount"
        }
    }

    private fun <T> findViewById(cleanBtn: Int) {

    }

    private fun setContentView(activityMain2: Int) {

    }
}

private fun Any.setOnClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}

private fun Any.onCreate(savedInstanceState: Bundle?) {
    TODO("Not yet implemented")
}


