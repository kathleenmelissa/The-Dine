package com.example.the_dine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homeactivity : AppCompatActivity() {
    lateinit var menu: Button
    lateinit var hirechefs: Button
    lateinit var hotel: Button
    lateinit var reserve: Button
    lateinit var recreation: Button
    lateinit var gallery: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        menu = findViewById(R.id.menu)
        hirechefs = findViewById(R.id.hirechefs)
        hotel = findViewById(R.id.knowthehotel)
        reserve = findViewById(R.id.makereservations)
        recreation = findViewById(R.id.recreationactivities)
        gallery = findViewById(R.id.ourgallery)

        menu.setOnClickListener {
            var intent = Intent(this, orderfoodactivity::class.java)
            startActivity(intent)
        }
            hirechefs.setOnClickListener {
            var intent = Intent(this, hirechefsactivity::class.java)
            startActivity(intent)
        }
        hotel.setOnClickListener {
            var intent = Intent(this, knowhotelsactivity::class.java)
            startActivity(intent)
        }
        reserve.setOnClickListener {
            var intent = Intent(this, reservationsactivity::class.java)
            startActivity(intent)
        }
        recreation.setOnClickListener {
            var intent = Intent(this,recreationactivity::class.java)
            startActivity(intent)
        }
        gallery.setOnClickListener {
            var intent = Intent(this, galleryactiivity::class.java)
            startActivity(intent)
        }

    }
}