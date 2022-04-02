package com.saico.myfirstproyectandroid.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saico.myfirstproyectandroid.R
import kotlinx.android.synthetic.main.activity_edit_text.*

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)
    }

    fun register(view: android.view.View) {

        /*if (edtFirstName.text.isBlank() && edtLastName.text.isBlank()) {
            tvDisplayName.text = "Ingresar texto"
        } else {
            tvDisplayName.text = "Your username is ${edtFirstName.text} ${edtLastName.text}"
        } */

        when (edtFirstName.text.isBlank() && edtLastName.text.isBlank()) {
            true -> tvDisplayName.text = "Ingresar texto"
            false -> tvDisplayName.text = "Your username is ${edtFirstName.text} ${edtLastName.text}"
        }
    }
}