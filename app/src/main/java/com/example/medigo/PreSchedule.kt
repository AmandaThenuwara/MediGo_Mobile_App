package com.example.medigo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class PreSchedule : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_schedule)


        val btnNavigate: Button = findViewById(R.id.schedule1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Schedule1::class.java)
            startActivity(intent)
        }
        val image = findViewById<ImageView>(R.id.backbtn)
        image.setOnClickListener {
            val intent = Intent(this, DoctorProfile::class.java)
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

        // Initialize views
        calendarView = findViewById(R.id.calendar)
        textView = findViewById(R.id.date)

        // Display the current date on startup
        val currentDate = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Date())
        display(currentDate)

        // Set a listener for date selection
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val selectedDate = String.format("%02d-%02d-%04d", dayOfMonth, month + 1, year)
            display(selectedDate)
        }
    }

    private fun display(text: String) {
        textView.text = text
    }
}
