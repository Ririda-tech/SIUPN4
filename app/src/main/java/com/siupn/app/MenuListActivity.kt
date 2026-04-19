package com.siupn.app

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.siupn.app.R
import com.siupn.app.adapter.FoodListAdapter
import com.siupn.app.data.FoodRepository

class MenuListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_list)

        val listView = findViewById<ListView>(R.id.listFoods)

        val foodItems = FoodRepository.getFoodItems()
        val adapter = FoodListAdapter(this, foodItems)

        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            val foodItem = foodItems[position]

            val intent = Intent(this, FoodDetailActivity::class.java)
            intent.putExtra("food_id", foodItem.id)

            startActivity(intent)
        }
    }
}