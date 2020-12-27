package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.donation.R

class MainActivity_receiver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_receiver)

        val actionBar = supportActionBar
        actionBar!!.title = "Receiver Home Page"

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, OrgDetails::class.java)
            startActivity(intent)
        }
    }
}