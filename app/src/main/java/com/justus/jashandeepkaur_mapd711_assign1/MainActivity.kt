package com.justus.jashandeepkaur_mapd711_assign1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var address: EditText
    lateinit var proffession: EditText
    lateinit var dreamjob: EditText
    lateinit var favoritefood: EditText
    lateinit var submit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         name =  findViewById(R.id.name)
          address =findViewById(R.id.address)
        proffession = findViewById(R.id.proffession)
         dreamjob = findViewById(R.id.dreamjob)
         favoritefood = findViewById(R.id.favoritefood)
         submit =  findViewById(R.id.button)

        submit.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", name.text.toString())
            bundle.putString("address", address.text.toString())
            bundle.putString("proffession", proffession.text.toString())
            bundle.putString("dreamjob", dreamjob.text.toString())
            bundle.putString("favoritefood", favoritefood.text.toString())

                      val intent = Intent(this, Display::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}