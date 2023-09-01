package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.sportzinteractive.network.MarsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class NetActivity : AppCompatActivity() {
    var TAG = NetActivity::class.java.simpleName
    enum class MarsApiStatus { LOADING, ERROR, DONE }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net)
    }

    override fun onStart() {
        super.onStart()
        getMarsPhotos()


    }

    private fun getMarsPhotos() {
        GlobalScope.launch {
            val listResult = MarsApi.retrofitService.getPhotos()
            Log.i(TAG,"jsonstring is  "+listResult.toString())
        }
    }
    }