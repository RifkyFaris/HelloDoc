package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnNavigate: TextView =findViewById(R.id.forgotPassword)
        btnNavigate.setOnClickListener {
            val intent= Intent(this,Forgot_Password::class.java)
            startActivity(intent)
        }
        val btn2Navigate: TextView =findViewById(R.id.dontHaveAccount)
        btn2Navigate.setOnClickListener {
            val intent= Intent(this,Register::class.java)
            startActivity(intent)
        }
        val btn3Navigate: Button =findViewById(R.id.Login)
        btn3Navigate.setOnClickListener {
            val name=findViewById<EditText>(R.id.editTextUsername)
            val name1=name.text.toString()

            val intent= Intent(this,Home::class.java)
            intent.putExtra("USER_NAME",name1)
            startActivity(intent)
        }
    }
}