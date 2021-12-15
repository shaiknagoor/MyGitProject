package com.example.mygitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Welcome to First Push ",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Welcome to Second Toast ",Toast.LENGTH_SHORT).show()

    }
}