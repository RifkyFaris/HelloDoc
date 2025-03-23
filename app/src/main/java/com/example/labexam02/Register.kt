package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val registerNavigate:AppCompatButton=findViewById(R.id.register)
        registerNavigate.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
        val haveAnAccount:TextView=findViewById(R.id.haveAnAccount)
        haveAnAccount.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
}