package com.example.modul3_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Eksplicit
        val eksplicit = findViewById<Button>(R.id.btn_eks)
        eksplicit.setOnClickListener{
            Intent(this, detail_activity::class.java).also{
                startActivity(it)
            }
        }
    }
}