package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickHandler(view: View) {
        //get hold of the textview or get handle
        var firstTv:TextView = findViewById(R.id.tvFirst)
        //set the text on tv
        firstTv.setText("welcome to android")
       // Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()
    }
}