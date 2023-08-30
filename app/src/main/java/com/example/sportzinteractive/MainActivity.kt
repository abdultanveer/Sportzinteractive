package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.sportzinteractive.model.Dice

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //taking handle of the button
        val rollButton: Button = findViewById(R.id.btnRoll)

        rollButton.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.tvFirst)
        resultTextView.text = diceRoll.toString()
    }

    fun clickHandler(view: View) {
        //get hold of the textview or get handle
        var firstTv:TextView = findViewById(R.id.tvFirst)
        //set the text on tv
        firstTv.setText("welcome to android at sportz interactive")
       // Toast.makeText(this,"welcome",Toast.LENGTH_SHORT).show()
    }
}