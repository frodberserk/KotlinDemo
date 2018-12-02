package com.kotlindemo.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var btnClick: Button
    lateinit var btnFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello, world!")

        btnClick = findViewById<Button>(R.id.btnClick)
        btnFragment = findViewById<Button>(R.id.btnFragment)

        btnClick.setOnClickListener {
            showToast(timeNow())
        }
        btnFragment.setOnClickListener {
            fragmentManager.beginTransaction().add(R.id.parent, HomeFragment(), "")
                    .addToBackStack("").commit()
        }
    }

    /**
     * Shows a toast message.
     *
     *@param message The message to display as toast.
     */
    fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
    }

    /**
     * Returns current time in a string.
     *
     * @return Current time in a formatted string.
     */
    fun timeNow(): String {
        val simpleDateFormat = SimpleDateFormat("hh:mm aa",
                Locale.getDefault())
        return simpleDateFormat.format(Date())
    }

    override fun onBackPressed() {
        //If there is a fragment in backstack, pop it. Else finish the activity.
        if (!fragmentManager.popBackStackImmediate()) {
            super.onBackPressed()
        }
    }
}