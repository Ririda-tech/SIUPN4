package com.siupn.app.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.siupn.app.homepage.MainActivity
import com.siupn.app.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, _root_ide_package_.com.siupn.app.homepage.MainActivity::class.java))
            finish()
        }, 2000)
    }
}