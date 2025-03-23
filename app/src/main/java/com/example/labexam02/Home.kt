package com.example.labexam02

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        val intent=intent
        val name=intent.getStringExtra("USER_NAME")
        val textView=findViewById<TextView>(R.id.name)
        textView.text="Hello, $name"
        val btnNavNavigate: BottomNavigationView =findViewById(R.id.navigation)
        btnNavNavigate.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.home->{
                    startActivity(Intent(this, Home::class.java))
                    true

                }
                R.id.video -> {
                    // Handle Video navigation
                    startActivity(Intent(this, Videocall::class.java))
                    true
                }
                R.id.logout -> {
                    // Handle Video navigation
                    startActivity(Intent(this, Login::class.java))
                    true
                }
                R.id.profile -> {
                    // Handle Video navigation
                    startActivity(Intent(this, Profile::class.java))
                    true
                }
                else -> false

            }

        }

    }
}