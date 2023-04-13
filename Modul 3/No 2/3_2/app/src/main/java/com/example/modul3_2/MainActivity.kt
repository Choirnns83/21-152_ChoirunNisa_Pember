package com.example.modul3_2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Eksplicit
        val eksplicit = findViewById<Button>(R.id.btn_menu)
        eksplicit.setOnClickListener {
            Intent(this, detail_activity::class.java).also {
                startActivity(it)
            }
        }

        //ke whatsapp
        val btn2 = findViewById<Button>(R.id.btn_order1)
        btn2.setOnClickListener(View.OnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6285704385878"))
            startActivity(i)
        })
    }
}