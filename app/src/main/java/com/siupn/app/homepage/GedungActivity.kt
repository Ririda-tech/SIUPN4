package com.siupn.app.homepage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.siupn.app.R
import com.siupn.app.adapter.GedungAdapter
import com.siupn.app.model.Gedung

class GedungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_gedung
        )

        val rv=
            findViewById<RecyclerView>(
                R.id.rvGedung
            )

        val data= arrayListOf(

            Gedung(
                "Gedung Dewi Sartika",
                "Gedung Kuliah",
                R.drawable.fh
            ),

            Gedung(
                "Gedung Lab FIK",
                "Gedung Praktikum",
                R.drawable.fh
            )

        )

        rv.layoutManager=
            GridLayoutManager(this,2)

        rv.adapter=
            GedungAdapter(data)

    }

}