package com.example.sportzinteractive

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
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

    fun launchDialer(view: View) {
        var dIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567"))
        startActivity(dIntent)
    }

    fun setAlarm(view: View) {
        createAlarm("time for sports",11,48)
    }

    fun createAlarm(message: String, hour: Int, minutes: Int) {
        val intent = Intent(AlarmClock.ACTION_SET_ALARM).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message)
            putExtra(AlarmClock.EXTRA_HOUR, hour)
            putExtra(AlarmClock.EXTRA_MINUTES, minutes)
        }
       // if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
       // }
    }
}