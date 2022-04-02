package com.saico.myfirstproyectandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.AlarmClock
import android.util.Log
import com.saico.myfirstproyectandroid.R

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.e("MainActivity2", "onCreate")
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }
        Handler(Looper.getMainLooper()).postDelayed({ startActivity(intent); },4000)
    }

    override fun onStart() {
        Log.e("MainActivity2", "onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.e("MainActivity2", "onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.e("MainActivity2", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.e("MainActivity2", "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.e("MainActivity2", "onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.e("MainActivity2", "onRestart")
        super.onRestart()
    }
}