package com.android.zurimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minus: Button = findViewById(R.id.button1)
        val plus: Button = findViewById(R.id.button2)
        var count: TextView =findViewById(R.id.textView)
        count.text = "0"

        plus.setOnClickListener{
            count +=1
            count.text = count.toString()
        }

        minus.setOnClickListener {
            count -=1
            count.text = count.toString()
        }
    }
}





























