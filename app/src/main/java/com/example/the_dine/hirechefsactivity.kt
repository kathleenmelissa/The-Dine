package com.example.the_dine

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView

class hirechefsactivity : AppCompatActivity() {
    lateinit var chefmahundhry:Button
    lateinit var chefraphael:Button
    lateinit var cheffregz:Button
    lateinit var chefcyril:Button
    lateinit var cheflilian:Button
    lateinit var chefyohannis:Button
    lateinit var lottie: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hirechefsactivity)
        lottie=findViewById(R.id.lottie3)
        chefmahundhry=findViewById(R.id.alimahandhry)
        chefraphael=findViewById(R.id.chefraphael)
        cheffregz=findViewById(R.id.chefregz)
        chefcyril=findViewById(R.id.chefcyril)
        cheflilian=findViewById(R.id.cheflilian)
        chefyohannis=findViewById(R.id.chefyohannis)
        chefmahundhry.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "chefalimahundhry@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Ali Mahundhry,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }
        chefraphael.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "chefraphael@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Raphael,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }
        cheffregz.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "chefregz@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Regz,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }
        chefcyril.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "chefcyril@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Cyril,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }
        cheflilian.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "cheflilian@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Lilian,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }
        chefyohannis.setOnClickListener {
            val emailIntent= Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "chefyohannis@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"CHEFERY BOOKING")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear Chef Yohannis,...")
            startActivity(Intent.createChooser(emailIntent,"Send email..."))

        }

    }
}