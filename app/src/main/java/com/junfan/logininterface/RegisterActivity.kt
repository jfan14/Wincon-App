package com.junfan.logininterface

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        init()
    }

    private fun init() {
        register_button_in_register.setOnClickListener {
            val sharedPreferences = getSharedPreferences("my_preference", Context.MODE_PRIVATE)
            var editor = sharedPreferences.edit()
            var intent = Intent(this, LoginActivity::class.java)
            var username = edit_text_username.text.toString()
            var email = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()

            editor.putString("USERNAME", username)
            editor.putString("EMAIL", email)
            editor.putString("PASSWORD", password)
            editor.commit()

            startActivity(intent)
        }
        text_view_in_register.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}