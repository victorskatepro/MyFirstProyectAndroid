package com.saico.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.saico.myfirstproyectandroid.R
import com.saico.myfirstproyectandroid.showToastShortExtensionFunction
import kotlinx.android.synthetic.main.activity_check_box.view.*

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
    }

    fun androidCheckBoxClicked(view: android.view.View) {
        when (view.id) {
            R.id.checkBox ->  this.showToastShortExtensionFunction("${view.checkBox.text} Selected")
            R.id.checkBox2 -> Toast.makeText(this, "${view.checkBox2.text} Selected", Toast.LENGTH_SHORT).show()
        }
    }


}