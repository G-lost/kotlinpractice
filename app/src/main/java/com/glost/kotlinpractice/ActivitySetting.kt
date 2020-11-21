package com.glost.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_setting.*

class ActivitySetting : AppCompatActivity() {
    private val itemList = ArrayList<Image>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        initFruits()
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(itemList)
        recyclerView.adapter = adapter

    }

    private fun initFruits() {
        itemList.add(Image("Apple", R.drawable.apple_pic))
        itemList.add(Image("Banana", R.drawable.banana_pic))
        itemList.add(Image("Orange", R.drawable.orange_pic))
        itemList.add(Image("Watermelon", R.drawable.watermelon_pic))
        itemList.add(Image("Pear", R.drawable.pear_pic))
        itemList.add(Image("Grape", R.drawable.grape_pic))
        itemList.add(Image("Pineapple", R.drawable.pineapple_pic))
        itemList.add(Image("Strawberry", R.drawable.strawberry_pic))
        itemList.add(Image("Cherry", R.drawable.cherry_pic))
        itemList.add(Image("Mango", R.drawable.mango_pic))
        itemList.add(Image("database", R.drawable.apple_pic))
    }
}