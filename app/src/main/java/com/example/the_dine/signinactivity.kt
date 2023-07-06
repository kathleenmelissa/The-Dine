package com.example.the_dine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class signinactivity : AppCompatActivity() {

    private lateinit var myemail: EditText
    private lateinit var mypassword1: EditText
    lateinit var login1: Button
    lateinit var signup: TextView
    lateinit var logintext: TextView

    lateinit var lottie:LottieAnimationView

    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signinactivity)

        logintext=findViewById(R.id.tosignup)
        myemail = findViewById(R.id.email22)
        mypassword1 = findViewById(R.id.password)
        lottie=findViewById(R.id.lottie)
        login1 = findViewById(R.id.loginbutton)
        signup = findViewById(R.id.tosignup)
        auth = FirebaseAuth.getInstance()


        login1.setOnClickListener {
           Login()
        }

        logintext.setOnClickListener {
            val intent = Intent(this, signupactivity::class.java)
            startActivity(intent)
        }

    }
    private fun Login(){
        val email = myemail.text.toString()
        val pass = mypassword1.text.toString()

        auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this){
            if(it.isSuccessful){
                Toast.makeText(this,"Successfully LoggedIn", Toast.LENGTH_LONG).show()
                val intent= Intent(this,homeactivity::class.java)
                startActivity(intent)
            }
            else
                Toast.makeText(this,"Log In failed", Toast.LENGTH_LONG).show()
        }
    }

}

