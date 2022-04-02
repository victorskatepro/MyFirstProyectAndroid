package com.saico.myfirstproyectandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.AlarmClock
import com.saico.myfirstproyectandroid.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, "message")
        }

        Handler(Looper.getMainLooper()).postDelayed({ startActivity(intent); finish() },3000)
    }
}