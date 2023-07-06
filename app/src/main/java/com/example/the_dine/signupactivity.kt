package com.example.the_dine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.airbnb.lottie.LottieAnimationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class signupactivity : AppCompatActivity() {
    lateinit var signuptext: TextView
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var myconfpassword: EditText
    lateinit var signup: Button
    lateinit var mylogin: TextView
    lateinit var lottie: LottieAnimationView

    private lateinit var auth: FirebaseAuth //creating firebase authentication
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)

        signuptext = findViewById(R.id.textsignin)
        myemail = findViewById(R.id.email)
        mypassword = findViewById(R.id.enterpassword)
        myconfpassword = findViewById(R.id.confirmpassword)
        signup = findViewById(R.id.signupbutton)
        lottie=findViewById(R.id.lottie2)
        mylogin = findViewById(R.id.textsignin)

        auth = Firebase.auth

        signup.setOnClickListener {
            SignUpUser()
        }
        signuptext.setOnClickListener {
            val intent = Intent(this, signinactivity::class.java)
            startActivity(intent)
            finish()
        }
    }


    private fun SignUpUser() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()
        val confirmpass = myconfpassword.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()) {
            Toast.makeText(this, " Email and password can't be blank", Toast.LENGTH_LONG)
                .show()
            return
        } else if (pass != confirmpass) {
            Toast.makeText(this, "Password do not match", Toast.LENGTH_LONG).show()
            return
        }

        val addOnCompleteListener =
            auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Signed up Successfully", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Failed to Create", Toast.LENGTH_LONG).show()
                }
            }
    }
}
