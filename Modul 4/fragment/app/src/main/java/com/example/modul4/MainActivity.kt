package com.example.modul4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //deklarasi fragment yang akan ditanam
        val fragsatu = FragmentSatu()
        val frag = supportFragmentManager.findFragmentByTag(FragmentSatu::class.java.simpleName)

        //kondisi
        if (frag !is FragmentSatu){
            supportFragmentManager.beginTransaction()
                .add(R.id.container, fragsatu, FragmentSatu::class.java.simpleName)
                .commit()
        }
    }
}