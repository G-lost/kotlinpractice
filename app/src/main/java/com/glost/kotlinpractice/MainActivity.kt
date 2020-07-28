package com.glost.kotlinpractice

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.mainlayout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        changeWallpaper.setOnClickListener { Toast.makeText(this, "you click change wallpaper", Toast.LENGTH_SHORT).show() }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val settingIntent = Intent(this, Setting::class.java)
        when(item.itemId){
            R.id.setting -> startActivity(settingIntent)
            R.id.refresh -> Toast.makeText(this, "refresh option", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}