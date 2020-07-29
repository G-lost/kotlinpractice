package com.glost.kotlinpractice

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeWallpaper.setOnClickListener { Toast.makeText(this, "you click change wallpaper", Toast.LENGTH_SHORT).show() }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.setting -> {
                val settingIntent = Intent(this, ActivitySetting::class.java)
                startActivity(settingIntent)
            }
            R.id.gallery -> {
                val settingIntent = Intent(this, ActivityGallery::class.java)
                startActivity(settingIntent)
            }
        }
        return true
    }
}