package com.example.virtualpetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tvHealth: TextView
    private lateinit var tvHunger: TextView
    private lateinit var tvCleanliness: TextView
    private lateinit var btnFeed: Button
    private lateinit var btnClean: Button
    private var health = 100
    private var hunger = 0
    private var cleanliness = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHealth = findViewById(R.id.tvHealth)
        tvHunger = findViewById(R.id.tvHunger)
        tvCleanliness = findViewById(R.id.tvCleanliness)
        btnFeed = findViewById(R.id.btnFeed)
        btnClean = findViewById(R.id.btnClean)

        btnFeed.setOnClickListener {
            if (hunger > 0) {
                hunger -= 10
                health += 5
                updateStats()
            }
        }

        btnClean.setOnClickListener {
            cleanliness = 100
            updateStats()
        }
    }

    private fun updateStats() {
        tvHealth.text = "Health: $health"
        tvHunger.text = "Hunger: $hunger"
        tvCleanliness.text = "Cleanliness: $cleanliness"
    }
}
