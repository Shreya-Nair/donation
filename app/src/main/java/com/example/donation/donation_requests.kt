package com.example.donation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_donation_requests.*

class donation_requests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation_requests)
        button3.setOnClickListener{
            val intent= Intent(this,user1::class.java)
            startActivity(intent)
        }
    }
}