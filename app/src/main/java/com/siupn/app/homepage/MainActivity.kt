package com.siupn.app.homepage

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.siupn.app.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // MENU RUANGAN
        val menuRuangan =
            findViewById<LinearLayout>(R.id.menu3)

        menuRuangan.setOnClickListener {

            val intent =
                Intent(
                    this,
                    ListFakultasActivity::class.java
                )

            startActivity(intent)

        }

    }

}