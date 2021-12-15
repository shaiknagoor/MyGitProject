package com.example.mygitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Welcome to First Push ",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Welcome to Second Toast ",Toast.LENGTH_SHORT).show()
        Log.v("sss","button added with constraint")
button2.setOnClickListener {
textView2.text="Welcome to Main Activity"
    val name ="Nagoorvali Shaik "
    val current_compeny ="Capgemini"
}

    }
}