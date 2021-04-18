package com.junfan.logininterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var th : Thread

        th = Thread() {
            kotlin.run {
                Thread.sleep(5000)
                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        th.start()
    }
}