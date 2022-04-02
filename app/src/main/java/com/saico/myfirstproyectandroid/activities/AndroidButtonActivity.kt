package com.saico.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.saico.myfirstproyectandroid.R
import com.saico.myfirstproyectandroid.addMyText
import com.saico.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)
        changeTextButton()
        declareClickListener()
    }

    private fun changeTextButton() {
        Handler(Looper.getMainLooper()).postDelayed({ btnSimpleButton.text = "New Text Button" },4000)


        Handler(Looper.getMainLooper()).postDelayed({ btnButtonIcon.text = "Button Icon New Text" },4000)
    }

    private fun declareClickListener() {

        btnSimpleButton.setOnClickListener {
            this.showToastShortExtensionFunction("btnSimpleButton")
        }

        btnButtonIcon.setOnClickListener {
            this.showToastShortExtensionFunction("".addMyText("btnButtonIcon"))
        }
    }

    fun callRightIconButton(view: android.view.View) {
        showToastShort("RightIconButton && callBackgroundImageButton")
    }

    fun callBackgroundImageButton(view: android.view.View) {
        showToastShort("callBackgroundImageButton")
    }

    fun showToastShort(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()


}