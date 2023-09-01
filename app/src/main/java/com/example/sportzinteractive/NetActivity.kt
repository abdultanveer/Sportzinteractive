package com.example.sportzinteractive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.sportzinteractive.model.MarsPhoto
import com.example.sportzinteractive.network.MarsApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.Dispatcher

class NetActivity : AppCompatActivity() {
    lateinit var  listResult: List<MarsPhoto>
    lateinit var urlTextView: TextView
    var TAG = NetActivity::class.java.simpleName


    private val _photos = MutableLiveData<List<MarsPhoto>>()
    val photos: LiveData<List<MarsPhoto>> = _photos

    private val _status = MutableLiveData<MarsApiStatus>()
    val status: LiveData<MarsApiStatus> = _status

    enum class MarsApiStatus { LOADING, ERROR, DONE }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net)
         urlTextView = findViewById(R.id.tvUrl);

    }

    override fun onStart() {
        super.onStart()
        getMarsPhotos()
    }

    override fun onResume() {
        super.onResume()




    }

    private fun getMarsPhotos() {
        GlobalScope.launch {
           /*  _photos.value = MarsApi.retrofitService.getPhotos()
            Log.i(TAG,"jsonstring is  "+_photos.value)
            _status.value = MarsApiStatus.DONE*/
        }

    }
    }