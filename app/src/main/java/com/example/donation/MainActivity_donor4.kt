package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity_donor4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_donor4)
        val Name = findViewById<EditText>(R.id.editTextTextPersonName6)
        val city = findViewById<EditText>(R.id.editTextTextPersonName7)
        val contact = findViewById<EditText>(R.id.editTextTextPersonName8)
        val chkClothes = findViewById<CheckBox>(R.id.Clothes)
        val chkFood = findViewById<CheckBox>(R.id.Food)
        val chkEducational= findViewById<CheckBox>(R.id.Things)
        val chkToys = findViewById<CheckBox>(R.id.Toys)
        setContentView(R.layout.activity_main_donor4)

        val actionBar = supportActionBar

        actionBar!!.title = "Enter Donor's Details"

        actionBar.setDisplayHomeAsUpEnabled(true)


        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {

            val intent = Intent(this,MainActivity_donor5::class.java)
            startActivity(intent)
        }
    }
}
