package com.example.medigo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CancelAppoinment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cancel_appoinment)

        val imageView = findViewById<ImageView>(R.id.imageView129)
        imageView.setOnClickListener {
            val intent = Intent(this, UpcomingAppoinment::class.java)
            startActivity(intent)
        }
        val btnNavigate: Button = findViewById(R.id.button5)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, UpcomingAppoinment::class.java)
            startActivity(intent)
        }
        val btnNavigate1: Button = findViewById(R.id.button6)
        btnNavigate1.setOnClickListener {
            val intent = Intent(this, SuccessfullCancelation::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}