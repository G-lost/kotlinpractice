package com.glost.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.mainlayout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)
        button1.setOnClickListener { Toast.makeText(this, "you click button1", Toast.LENGTH_SHORT).show() }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.setting -> Toast.makeText(this, "setting option", Toast.LENGTH_SHORT).show()
            R.id.add_item -> Toast.makeText(this, "add option", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "remove option", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}