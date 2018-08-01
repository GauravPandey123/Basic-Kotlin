package com.example.gaurav.androidkotlinproject

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView

class RecyclerviewClass : AppCompatActivity() {

    lateinit var recylerview : RecyclerView;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)
        setUpElements();
        setUpListeners();

    }


    private fun setUpElements() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun setUpListeners() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}