package com.example.donation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_user1.*

class user1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user1)

        val actionBar = supportActionBar

        actionBar!!.title = "User Details"

        actionBar.setDisplayHomeAsUpEnabled(true)

        decline.setOnClickListener{
            val intent= Intent(this,decline_request::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener{
            val intent1=Intent(this,accept_request::class.java)
            startActivity(intent1)
        }
    }
}