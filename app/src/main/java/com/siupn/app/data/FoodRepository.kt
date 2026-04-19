package com.siupn.app.data
import com.siupn.app.R
import com.siupn.app.model.FoodItem

object FoodRepository {
    fun getFoodItems(): List<FoodItem> {
        return listOf(
            FoodItem(1, "Nasi Goreng", "Warung Nuantara", 12000, 4.5, "Nasi goreng gurih dengan topping lengkap, porsi pas buat isi energi sebelum/abis kelas. Cepat saji, enak, dan bikin kenyang!", R.drawable.nasi_goreng),
FoodItem(2, "Mie Ayam", "Warung Makan Ayam", 15000, 4.2, "Mie kenyal + ayam gurih manis dengan kuah hangat. Menu favorit kantin yang simpel tapi selalu bikin puas!", R.drawable.mie_ayam),
FoodItem(3, "Sate Ayam", "Warung Makan Ayam", 20000, 4.7, "Sate ayam dengan saus kacang kental gurih manis. Praktis, enak, dan pas buat ganjel lapar di sela jadwal padat.", R.drawable.sate_ayam),
FoodItem(4, "Soto Ayam", "Warung Makan Ayam", 18000, 4.4, "Soto ayam kuah gurih segar, cocok buat kamu yang mau makan ringan tapi tetap kenyang. Hangat dan bikin fresh lagi!", R.drawable.soto_ayam),
FoodItem(5, "Ayam Bakar", "Warung Makan Ayam", 25000, 4.9, "Ayam bakar bumbu meresap, disajikan dengan sambal dan lalapan. Rasanya mantap, cocok buat makan siang anak kampus!", R.drawable.ayam_bakar),
)
    }
    fun getFoodItemById(id: Int): FoodItem? {
        return getFoodItems().find { it.id == id }
    }
}