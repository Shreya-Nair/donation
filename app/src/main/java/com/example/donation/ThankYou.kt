package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.donation.R

class ThankYou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thank_you)

        val actionBar = supportActionBar

        actionBar!!.title = "Thank You"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, ReceiverHomePage::class.java)
            startActivity(intent)
        }
    }
}