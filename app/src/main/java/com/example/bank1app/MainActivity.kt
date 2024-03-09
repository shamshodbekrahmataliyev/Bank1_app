package com.example.bank1app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.bank1app.Login_Register.LoginActivity
import com.example.bank1app.Login_Register.RegisterActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Login = findViewById<AppCompatButton>(R.id.btnLogin)
        var Register = findViewById<AppCompatButton>(R.id.btnRegister)
        var account = findViewById<TextView>(R.id.account)

        Login.setOnClickListener {
            var intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
        Register.setOnClickListener {
            var intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        account.setOnClickListener {
            var intent = Intent(this@MainActivity, MemberActivity::class.java)
            startActivity(intent)
        }
    }
}