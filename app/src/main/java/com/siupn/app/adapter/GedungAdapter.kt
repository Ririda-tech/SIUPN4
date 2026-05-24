package com.siupn.app.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.siupn.app.R
import com.siupn.app.homepage.DetailRuanganActivity
import com.siupn.app.model.Gedung

class GedungAdapter(
    private val list:ArrayList<Gedung>
)
    : RecyclerView.Adapter<GedungAdapter.ViewHolder>() {

    class ViewHolder(view:View):RecyclerView.ViewHolder(view){

        val img =
            view.findViewById<ImageView>(
                R.id.imgGedung
            )

        val nama =
            view.findViewById<TextView>(
                R.id.tvNamaGedung
            )

        val desc =
            view.findViewById<TextView>(
                R.id.tvDescGedung
            )

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val view =
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.item_gedung,
                    parent,
                    false
                )

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

        val data = list[position]

        holder.nama.text = data.nama

        holder.desc.text = data.desc

        holder.img.setImageResource(data.foto)

        // CLICK ITEM → DETAIL CARDVIEW
        holder.itemView.setOnClickListener {

            val intent =
                Intent(
                    holder.itemView.context,
                    DetailRuanganActivity::class.java
                )

            holder.itemView.context
                .startActivity(intent)

        }

    }

}