package com.example.medigo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        val btnNavigate: Button = findViewById(R.id.signupbtn)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val textView: TextView = findViewById(R.id.textView21)
        textView.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        val textView1: TextView = findViewById(R.id.textView125)
        textView1.setOnClickListener {
            val intent = Intent(this, PaymentMethod::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}