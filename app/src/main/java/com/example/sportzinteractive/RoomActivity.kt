package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import com.example.sportzinteractive.database.Word


class RoomActivity : AppCompatActivity() {
lateinit var observerTextView: TextView
    private val wordViewModel: WordViewModel by viewModels {
        WordViewModelFactory((application as WordsApplication).repository)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)
        observerTextView = findViewById(R.id.tvObserver)

        wordViewModel.allWords.observe(this){words ->
            observerTextView.setText(words.get(words.size-1).word)
        }
    }

    fun putData(view: View) {
        wordViewModel.insert(Word("sportz interactive"))
    }
    fun getData(view: View) {}
}