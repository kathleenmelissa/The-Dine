package com.example.the_dine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var welcome: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        welcome=findViewById(R.id.getstarted)
        welcome.setOnClickListener {
            Toast.makeText(applicationContext,"Welcome To The Dine!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, signupactivity::class.java)
            startActivity(intent)
            finish()
        }




    }



}

