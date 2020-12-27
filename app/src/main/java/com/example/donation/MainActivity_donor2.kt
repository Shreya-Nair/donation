package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_donor2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_donor2)

        val actionBar = supportActionBar

        actionBar!!.title = "Details of the organization"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {

            val intent = Intent(this,MainActivity_donor4::class.java)
            startActivity(intent)
        }

    }
}