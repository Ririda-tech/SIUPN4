package com.siupn.app.homepage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.siupn.app.R
import com.siupn.app.adapter.FakultasAdapter
import com.siupn.app.model.Fakultas

class ListFakultasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(
            R.layout.activity_list_fakultas
        )

        val rv=
            findViewById<RecyclerView>(
                R.id.rvFakultas
            )

        val data= arrayListOf(

            Fakultas(
                "Fakultas Ilmu Komputer (FIK)",
                "Lab & ruang kelas",
                R.drawable.fh
            ),

            Fakultas(
                "Fakultas Kedokteran (FK)",
                "Laboratorium & ruang belajar",
                R.drawable.fh
            ),

            Fakultas(
                "Fakultas Ekonomi Bisnis (FEB)",
                "Ruang seminar",
                R.drawable.fh
            ),

            Fakultas(
                "Fakultas Hukum (FH)",
                "Ruang sidang & kelas",
                R.drawable.fh
            )

        )

        rv.layoutManager=
            LinearLayoutManager(this)

        rv.adapter=
            FakultasAdapter(data)

    }

}