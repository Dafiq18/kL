package com.example.guruprofil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.guruprofil.MainActivity3
import com.example.guruprofil.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button1 = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }

        button1.setOnClickListener {
            val Intent = Intent(this, MainActivity3::class.java)
            startActivity(Intent)
        }
    }
}