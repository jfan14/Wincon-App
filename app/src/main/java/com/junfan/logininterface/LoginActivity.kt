package com.junfan.logininterface

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
    }

    private fun init() {
        text_view_login.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        login_button_login_layout.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            var user = username_edit_text.text.toString()
            var pass = password_edit_text.text.toString()
            var sharedPreferences = getSharedPreferences("my_preference", Context.MODE_PRIVATE)
            var user_auth = sharedPreferences.getString("USERNAME", "N/A")
            var pass_auth = sharedPreferences.getString("PASSWORD", "N/A")
            if(user == user_auth && pass == pass_auth) {
                intent.putExtra("EMAIL", user)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Wrong Credential", Toast.LENGTH_LONG).show()
            }
        }
    }
}