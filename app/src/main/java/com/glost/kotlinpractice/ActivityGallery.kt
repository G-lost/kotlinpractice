package com.glost.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_setting.*

class ActivityGallery : AppCompatActivity() {
    private val imageList = ArrayList<Image>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)
        initFruits()
        val layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
        val adapter = GalleryAdapter(imageList)
        recyclerView.adapter = adapter

    }

    private fun initFruits(){
        repeat(2) {
            imageList.add(Image("Apple", R.drawable.apple_pic))
            imageList.add(Image("Banana", R.drawable.banana_pic))
            imageList.add(Image("Orange", R.drawable.orange_pic))
            imageList.add(Image("Watermelon", R.drawable.watermelon_pic))
            imageList.add(Image("Pear", R.drawable.pear_pic))
            imageList.add(Image("Grape", R.drawable.grape_pic))
            imageList.add(Image("Pineapple", R.drawable.pineapple_pic))
            imageList.add(Image("Strawberry", R.drawable.strawberry_pic))
            imageList.add(Image("Cherry", R.drawable.cherry_pic))
            imageList.add(Image("Mango", R.drawable.mango_pic))
        }
    }
}