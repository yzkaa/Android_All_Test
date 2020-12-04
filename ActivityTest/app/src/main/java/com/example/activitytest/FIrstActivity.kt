package com.example.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast
//import kotlinx.android.synthetic.main.first_layout.*

class FIrstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
//        button1
        var button1:Button = findViewById(R.id.button1)
        button1.setOnClickListener{
            Toast.makeText(this,"You clicked Button 1",Toast.LENGTH_SHORT).show()
        }


    }
    //add menu Ctrl+O
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}