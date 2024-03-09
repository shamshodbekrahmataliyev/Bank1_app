package com.example.bank1app.Login_Register


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.bank1app.ForgotActivity
import com.example.bank1app.MainActivity
import com.example.bank1app.MainActivity2
import com.example.bank1app.R

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var Login = findViewById<ImageView>(R.id.Loginback)
        var Next = findViewById<AppCompatButton>(R.id.Log_in)
        var forgot = findViewById<TextView>(R.id.forgot_password)

        Login.setOnClickListener {
            var intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }
        Next.setOnClickListener {
            var intent = Intent(this@LoginActivity,MainActivity2::class.java)
            startActivity(intent)
        }
        forgot.setOnClickListener {
            var intent = Intent(this@LoginActivity,ForgotActivity::class.java)
            startActivity(intent)
        }
    }
}