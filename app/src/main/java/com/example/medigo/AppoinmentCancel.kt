package com.example.medigo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppoinmentCancel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appoinment_cancel)

        val imageView = findViewById<ImageView>(R.id.imageView75)
        imageView.setOnClickListener {
            val intent = Intent(this, AppoinmentComplete::class.java)
            startActivity(intent)
        }
        val imageView1 = findViewById<ImageView>(R.id.imageView79)
        imageView1.setOnClickListener {
            val intent = Intent(this, UpcomingAppoinment::class.java)
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

        val imageView5 = findViewById<ImageView>(R.id.imageView102)
        imageView5.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }
        val image = findViewById<ImageView>(R.id.backbtn)
        image.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}