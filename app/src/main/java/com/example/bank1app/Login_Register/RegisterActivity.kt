package com.example.bank1app.Login_Register

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.bank1app.MainActivity
import com.example.bank1app.MainActivity2
import com.example.bank1app.R

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var Register = findViewById<ImageView>(R.id.Registerback)
        var Next = findViewById<AppCompatButton>(R.id.Register)
        var member = findViewById<TextView>(R.id.member)

        Register.setOnClickListener {
            var intent = Intent(this@RegisterActivity, MainActivity::class.java)
            startActivity(intent)
        }

        Next.setOnClickListener {
            var intent = Intent(this@RegisterActivity, MainActivity2::class.java)
            startActivity(intent)
        }

        member.setOnClickListener {
            var intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}