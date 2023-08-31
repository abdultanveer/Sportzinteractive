package com.example.sportzinteractive

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class HomeActivity : AppCompatActivity() {
    lateinit var mainButton: Button
    lateinit var nameEditText: EditText
    lateinit var pwdEditText: EditText

var TAG = HomeActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"activity created")
        setContentView(R.layout.activity_home)
        mainButton = findViewById(R.id.btnMain)
        nameEditText = findViewById(R.id.etName)
        pwdEditText = findViewById(R.id.etpaswd)

        mainButton.setOnClickListener { launchMainActivity() }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"activity started")

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"activity resumed--restore state")
        restoreState()

    }

    private fun restoreState() {
        //read the data from the file
        //set it in the edittext
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"activity paused--save the state")
        saveState()
    }

    private fun saveState() {
        //get the data from edittexts
        var name = nameEditText.text.toString()
        var pass = pwdEditText.text.toString()
        //create the file
        var sharedPrefs = getSharedPreferences("sportsfile", MODE_PRIVATE)
        //open the file in edit mode
        var editor = sharedPrefs.edit()
        //write to the file
        editor.putString("nkey",name)
        editor.putString("pkey",pass)
        //save the file
        editor.apply()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"activity stopped")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"activity destroyed")

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