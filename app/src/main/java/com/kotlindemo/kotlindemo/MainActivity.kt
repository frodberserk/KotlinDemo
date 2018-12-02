package com.kotlindemo.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var btnClick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, world!")
        btnClick = findViewById<Button>(R.id.btnClick)
        btnClick.setOnClickListener {
            showToast(timeNow())
        }
    }

    /**
     * Shows a toast message.
     *
     *@param message The message to display as toast.
     */
    private fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
    }

    /**
     * Returns current time in a string.
     *
     * @return Current time in a formatted string.
     */
    private fun timeNow(): String {
        val simpleDateFormat = SimpleDateFormat("hh:mm aa",
                Locale.getDefault())
        return simpleDateFormat.format(Date())
    }
}