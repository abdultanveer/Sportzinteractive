package com.example.sportzinteractive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    lateinit var mainButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mainButton = findViewById(R.id.btnMain)
        mainButton.setOnClickListener { launchMainActivity() }
    }

    private fun launchMainActivity() {
        var mainIntent = Intent(this,MainActivity::class.java)
        mainIntent.putExtra("skey","rolling dice")
        startActivity(mainIntent)
    }
}