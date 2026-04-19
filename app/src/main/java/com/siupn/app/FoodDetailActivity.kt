package com.siupn.app

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.siupn.app.data.FoodRepository

class FoodDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        val foodId = intent.getIntExtra("food_id", -1)
        val foodItem = FoodRepository.getFoodItemById(foodId)

        val img = findViewById<ImageView>(R.id.imgFood)
        val name = findViewById<TextView>(R.id.name)
        val price = findViewById<TextView>(R.id.price)
        val desc = findViewById<TextView>(R.id.desc)
        val btnOrder = findViewById<Button>(R.id.btnOrder)

        if (foodItem != null) {
            img.setImageResource(foodItem.imageResId)
            name.text = foodItem.name
            price.text = "Rp ${foodItem.price}"
            desc.text = foodItem.description
        }

        btnOrder.setOnClickListener {
            Toast.makeText(this, "Pesanan berhasil!", Toast.LENGTH_SHORT).show()
        }
    }
}