package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.donation.R

class OrgDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_org_details)

        val actionBar = supportActionBar

        actionBar!!.title = "Organization Details"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, ReceiverHomePage::class.java)
            startActivity(intent)
        }
    }
}