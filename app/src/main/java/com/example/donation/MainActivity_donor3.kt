package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_donor3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_donor3)
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {

            val intent = Intent(this,MainActivity_donor4::class.java)
            startActivity(intent)
        }
    }
}