package com.example.donation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.title = "Welcome Page"


        button_receiver.setOnClickListener {
            val intent= Intent(this,MainActivity_receiver::class.java)
            startActivity(intent)
        }
        button_donor.setOnClickListener {
            val intent2=Intent(this,MainActivity_donor1::class.java)
            startActivity(intent2)
        }
    }
}