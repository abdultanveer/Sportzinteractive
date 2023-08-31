package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.sportzinteractive.model.Dice

class MainActivity : AppCompatActivity() {
    var TAG = MainActivity::class.java.simpleName

    //"MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "activity created")
        //taking handle of the button
        val rollButton: Button = findViewById(R.id.btnRoll)
        var data = intent.extras?.getString("skey")
        val resultTextView: TextView = findViewById(R.id.tvFirst)
        resultTextView.setText(data)
        rollButton.setOnClickListener {

            Log.e(TAG, "button clicked")

            rollDice()
        }


    }

    private fun rollDice() {
        Log.w(TAG, "dice rolled")

        val dice = Dice(6)
        val diceRoll = dice.roll()
        Log.w(TAG, "dice no got =" + diceRoll)
        var expression = diceRoll + 10 * 20 - 40
        val diceImage: ImageView = findViewById(R.id.imageView)


        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }


        val resultTextView: TextView = findViewById(R.id.tvFirst)
        resultTextView.text = diceRoll.toString()
        // throw NullPointerException("demo to crash the app")
    }

    fun clickHandler(view: View) {
        //get hold of the textview or get handle
        var firstTv: TextView = findViewById(R.id.tvFirst)
        //set the text on tv
        firstTv.setText("welcome to android at sportz interactive")
        // Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()
    }
}