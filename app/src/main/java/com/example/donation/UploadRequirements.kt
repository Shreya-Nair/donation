package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.donation.R
import com.example.donation.ThankYou

class UploadRequirements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_requirements)

        val actionBar = supportActionBar

        actionBar!!.title = "Upload your Requirements"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, ThankYou::class.java)
            startActivity(intent)
        }


    }
}