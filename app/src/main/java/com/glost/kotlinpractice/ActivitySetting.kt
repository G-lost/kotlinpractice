package com.glost.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_setting.*

class ActivitySetting : AppCompatActivity() {
    private val fruitList = ArrayList<Image>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        initFruits()
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = FruitAdapter(fruitList)
        recyclerView.adapter = adapter

    }

    private fun initFruits(){
        repeat(2) {
            fruitList.add(Image("Apple", R.drawable.apple_pic))
            fruitList.add(Image("Banana", R.drawable.banana_pic))
            fruitList.add(Image("Orange", R.drawable.orange_pic))
            fruitList.add(Image("Watermelon", R.drawable.watermelon_pic))
            fruitList.add(Image("Pear", R.drawable.pear_pic))
            fruitList.add(Image("Grape", R.drawable.grape_pic))
            fruitList.add(Image("Pineapple", R.drawable.pineapple_pic))
            fruitList.add(Image("Strawberry", R.drawable.strawberry_pic))
            fruitList.add(Image("Cherry", R.drawable.cherry_pic))
            fruitList.add(Image("Mango", R.drawable.mango_pic))
        }
    }
}