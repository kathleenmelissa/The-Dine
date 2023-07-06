package com.example.the_dine

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class reservationsactivity : AppCompatActivity() {
    lateinit var hote1:Button
    lateinit var hote2:Button
    lateinit var hote3:Button
    lateinit var hote4:Button
    lateinit var hote5:Button

    lateinit var hote7:Button
    lateinit var hote8:Button
    lateinit var hote9:Button
    lateinit var hote10:Button
    lateinit var hote11:Button
    lateinit var hote12:Button
    lateinit var hote13:Button
    lateinit var hote14:Button
    lateinit var hote15:Button
    lateinit var hote16:Button
    lateinit var hote17:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservationsactivity)
        hote1=findViewById(R.id.hotel1)
        hote2=findViewById(R.id.hotel2)
        hote3=findViewById(R.id.hotel3)
        hote4=findViewById(R.id.hotel4)
        hote5=findViewById(R.id.hotel5)

        hote7=findViewById(R.id.hotel7)
        hote8=findViewById(R.id.hotel8)
        hote9=findViewById(R.id.hotel9)
        hote10=findViewById(R.id.hotel10)
        hote11=findViewById(R.id.hotel11)
        hote12=findViewById(R.id.hotel12)
        hote13=findViewById(R.id.hotel13)
        hote14=findViewById(R.id.hotel14)
        hote15=findViewById(R.id.hotel15)
        hote16=findViewById(R.id.hotel16)
        hote17=findViewById(R.id.hotel17)
        hote1.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote3.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote4.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote5.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
8363104
        hote7.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote8.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote9.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote10.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote11.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote12.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote13.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote14.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote15.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote16.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }
        hote17.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0794963763")
            startActivity(dialIntent)
        }

    }
}