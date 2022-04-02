package com.saico.myfirstproyectandroid.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saico.myfirstproyectandroid.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDirection.setOnClickListener {

        }
        val intent = Intent(Intent.ACTION_SEND).apply {
            putExtra(Intent.EXTRA_TEXT, "ESTE ES EL MENSAJE QUE SE VA A COMPARTIR --->>> TEST")
        }
        intent.setType("text/plain")
        startActivity(intent)
    }
}