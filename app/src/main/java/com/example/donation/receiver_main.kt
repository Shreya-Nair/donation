package com.example.donation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_receiver_main2.*

class receiver_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver_main2)
        button_donation_requests.setOnClickListener {
            val intent= Intent(this,donation_requests::class.java)
            startActivity(intent)
        }
    }
}