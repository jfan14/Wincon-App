package com.junfan.logininterface

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        init()
    }

    private fun init() {
        var user = intent.getStringExtra("EMAIL")
        username_home.text = user

        var sharedPreferences = getSharedPreferences("my_preference", Context.MODE_PRIVATE)
        username_display.text = sharedPreferences.getString("USERNAME", "N/A")
        email_display.text = sharedPreferences.getString("EMAIL", "N/A")
        password_display.text = sharedPreferences.getString("PASSWORD", "N/A")
    }
}