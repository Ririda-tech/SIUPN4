package com.siupn.app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.siupn.app.R
import com.siupn.app.model.FoodItem

class FoodListAdapter(
    context: Context,
    private val foodItems: List<FoodItem>
) : ArrayAdapter<FoodItem>(context, 0, foodItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_food_row, parent, false)

        val foodItem = foodItems[position]

        val imageView = view.findViewById<ImageView>(R.id.imgFood)
        val name = view.findViewById<TextView>(R.id.name)

        imageView.setImageResource(foodItem.imageResId)
        name.text = foodItem.name

        return view
    }
}