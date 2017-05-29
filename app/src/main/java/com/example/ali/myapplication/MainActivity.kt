package com.example.ali.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMessage.text = "Hellllllo " + add(2,6)
        Toast.makeText(this, "This is toast message", Toast.LENGTH_SHORT).show()
    }

    fun add(x: Int, y: Int) : Int = x + y
}
