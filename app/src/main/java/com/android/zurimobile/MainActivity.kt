package com.android.zurimobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minus: Button = findViewById(R.id.button1)
        val plus: Button = findViewById(R.id.button2)
        val number: TextView = findViewById(R.id.textView)
        var textView = 0

        plus.setOnClickListener{
            textView++
            number.text = textView.toString()
        }

        minus.setOnClickListener {
            textView--
            number.text = textView.toString()
        }



    }
}





























