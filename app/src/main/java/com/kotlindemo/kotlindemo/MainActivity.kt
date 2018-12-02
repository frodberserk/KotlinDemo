package com.kotlindemo.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnClick: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, world!")
        btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener {
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
        }
    }
}