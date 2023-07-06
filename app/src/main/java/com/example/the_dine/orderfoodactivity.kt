package com.example.the_dine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class orderfoodactivity : AppCompatActivity() {
    lateinit var breakfast: Button
    lateinit var lunchdinner: Button
    lateinit var dessert:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderfoodactivity)
        breakfast = findViewById(R.id.breakfast)
        lunchdinner=findViewById( R.id.lunch)
        dessert=findViewById(R.id.dessert)
        breakfast.setOnClickListener {
            var intent = Intent(this, breakfastactivity::class.java)
            startActivity(intent)
        }
        lunchdinner.setOnClickListener {
            var intent = Intent(this, lunchactivity::class.java)
            startActivity(intent)
        }
        dessert.setOnClickListener {
            var intent = Intent(this, dessertactivity::class.java)
            startActivity(intent)
        }



    }
}