package com.example.medigo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DoctorProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_doctor_profile)

        val imageView = findViewById<ImageView>(R.id.backbtn)
        imageView.setOnClickListener {
            val intent = Intent(this, Doctors::class.java)
            startActivity(intent)
        }

        val textView: TextView = findViewById(R.id.textView37)
        textView.setOnClickListener {
            val intent = Intent(this, PreSchedule::class.java)
            startActivity(intent)
        }
        val imageView2 = findViewById<ImageView>(R.id.imageView5)
        imageView2.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        val imageView3 = findViewById<ImageView>(R.id.imageView6)
        imageView3.setOnClickListener {
            val intent = Intent(this, ContactSupporter::class.java)
            startActivity(intent)
        }
        val imageView4 = findViewById<ImageView>(R.id.imageView7)
        imageView4.setOnClickListener {
            val intent = Intent(this, AppoinmentComplete::class.java)
            startActivity(intent)
        }
        val imageView5 = findViewById<ImageView>(R.id.imageView102)
        imageView5.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}