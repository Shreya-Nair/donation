package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_accept_request.*

class accept_request : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accept_request)
        exit_button.setOnClickListener {
            val builder = AlertDialog.Builder(this, 0)
            builder.setTitle("Exit")
            builder.setIcon(R.drawable.ic_action_warning)
            builder.setMessage("Are you sure,you want to exit?")
            builder.setPositiveButton("Yes"){dialog, which ->
                this.finishAffinity()
            }
            builder.setNegativeButton("No"){dialog ,which->
                Toast.makeText(this,"You clicked no",Toast.LENGTH_LONG).show()
                val intent=Intent(this,receiver_main::class.java)
                startActivity(intent)

            }
            builder.setNeutralButton("Cancel"){dialog,which->
                Toast.makeText(this,"You canceled",Toast.LENGTH_LONG).show()

            }
            val dialog:AlertDialog=builder.create()
            dialog.show()

        }
    }
}