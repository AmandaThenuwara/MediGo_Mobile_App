package com.example.medigo

import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Schedule : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)

        // Initialize views
        calendarView = findViewById(R.id.calendarView)
        textView = findViewById(R.id.textView39)

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
