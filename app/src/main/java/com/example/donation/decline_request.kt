package com.example.donation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_decline_request.*

class decline_request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decline_request)

        val actionBar = supportActionBar

        actionBar!!.title = "Declined the Request"

        actionBar.setDisplayHomeAsUpEnabled(true)

        button.setOnClickListener{
            val intent= Intent(this,donation_requests::class.java)
            startActivity(intent)
        }
    }
}