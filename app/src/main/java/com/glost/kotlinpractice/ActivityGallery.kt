package com.glost.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_setting.*
import kotlin.random.Random

class ActivityGallery : AppCompatActivity() {
    private val imageList = ArrayList<Image>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        initFruits()
        val layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
//        val layoutManager = StaggeredGridLayoutManager(3, GridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = GalleryAdapter(imageList)
        recyclerView.adapter = adapter

    }

    private fun initFruits(){
        repeat(3) {
            imageList.add(Image(getRandomLengthString("Apple"), R.drawable.apple_pic))
            imageList.add(Image(getRandomLengthString("Banana"), R.drawable.banana_pic))
            imageList.add(Image(getRandomLengthString("Orange"), R.drawable.orange_pic))
            imageList.add(Image(getRandomLengthString("Watermelon"), R.drawable.watermelon_pic))
            imageList.add(Image(getRandomLengthString("Pear"), R.drawable.pear_pic))
            imageList.add(Image(getRandomLengthString("Grape"), R.drawable.grape_pic))
            imageList.add(Image(getRandomLengthString("Pineapple"), R.drawable.pineapple_pic))
            imageList.add(Image(getRandomLengthString("Strawberry"), R.drawable.strawberry_pic))
            imageList.add(Image(getRandomLengthString("Cherry"), R.drawable.cherry_pic))
            imageList.add(Image(getRandomLengthString("Mango"), R.drawable.mango_pic))
        }
    }

    private fun getRandomLengthString(string: String): String {
        val times = (1..15).random()
        val builder = StringBuilder()
        repeat(times){
            builder.append(string)
        }
        return builder.toString()
    }
}