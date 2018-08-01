package com.example.gaurav.androidkotlinproject

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var ll_main_layout: LinearLayout;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // creating TextView programmatically
        val tv_dynamic = TextView(this)
        tv_dynamic.textSize = 20f
        tv_dynamic.text = "This is a dynamic TextView generated programmatically in Kotlin"

        ll_main_layout = findViewById(R.id.linearLayout);

        // add TextView to LinearLayout
        ll_main_layout.addView(tv_dynamic)

        tv_dynamic.setOnClickListener {
            // your code to perform when the user clicks on the TextView
            val Intent =Intent(this,SecondActivity :: class.java)
            startActivity(Intent)

//            Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
        }



    }
}
