package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_donor1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_donor1)

        val actionBar = supportActionBar

        actionBar!!.title = "List of Organizations"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val intent = Intent(this,MainActivity_donor2::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {

            val intent = Intent(this,MainActivity_donor3::class.java)
            startActivity(intent)
        }
    }
}