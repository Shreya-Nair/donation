package com.example.donation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_org_details.*

class OrgDetails : AppCompatActivity() {
    lateinit var editTextName: EditText
    lateinit var editTextAddress:EditText
    lateinit var edittextNumber:EditText
    lateinit var editTextLicenseNumber: EditText
    lateinit var editTextEmail: EditText
    lateinit var buttonNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_org_details)

        val actionBar = supportActionBar

        actionBar!!.title = "Organization Details"

        actionBar.setDisplayHomeAsUpEnabled(true)


        editTextName = findViewById(R.id.editTextTextOrgName)
        editTextAddress = findViewById(R.id.editTextTextOrgAddress)
        edittextNumber = findViewById(R.id.editTextPhone)
        editTextLicenseNumber = findViewById(R.id.editTextTextPersonName3)
        editTextEmail = findViewById(R.id.editTextTextEmailAddress)
        buttonNext = findViewById(R.id.button2)

        button2.setOnClickListener {
            saveHero()
            val intent = Intent(this,ReceiverHomePage::class.java)
            startActivity(intent)
        }


    }

    private fun saveHero() {
        val Name = editTextName.text.toString().trim()
        val Address = editTextAddress.text.toString().trim()
        val Number = edittextNumber.text.toString().trim()
        val LicenseNumber = editTextLicenseNumber.text.toString().trim()
        val Email = editTextEmail.text.toString().trim()


        val ref = FirebaseDatabase.getInstance().getReference("heroes")
        val receiverid = ref.push().key.toString()
        val receiver = Receiver(receiverid, Name, Address, Number, LicenseNumber, Email)
        ref.child(receiverid).setValue(receiver).addOnCompleteListener {}
        Toast.makeText(applicationContext, "Information saved successfully", Toast.LENGTH_LONG).show()
    }
}
