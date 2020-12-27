package com.example.donation

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity_donor5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_donor5)

        val actionBar = supportActionBar

        actionBar!!.title = "Thank You!"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val alertBtn = findViewById<Button>(R.id.alertBtn)
        alertBtn.setOnClickListener {
            //nov define our theme in style, nov define here our theme
            val builder = android.app.AlertDialog.Builder(this,0)
            builder.setTitle("Exit")

            builder.setIcon(R.drawable.ic_action_warning)

            builder.setMessage("Are you sure ,you want to exit?")


            builder.setPositiveButton("yes") { dialog, which ->
                this.finishAffinity()

            }
            builder.setNegativeButton("No") {dialog, which ->

                Toast.makeText(this,"You clicked over no button" , Toast.LENGTH_LONG).show()

            }
            builder.setNeutralButton("Cancel") {dialog , which ->

                Toast.makeText(this,"You clicked over cancel button", Toast.LENGTH_LONG).show()

            }
            val dialog : android.app.AlertDialog = builder.create()
            dialog.show()
        }


    }
}
