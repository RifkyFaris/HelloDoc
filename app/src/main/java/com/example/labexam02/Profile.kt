package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
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