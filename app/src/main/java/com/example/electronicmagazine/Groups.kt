package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Groups : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groups)
    }

    fun onBack (view: View){
        val intent = Intent(this, Administrator::class.java)
        startActivity(intent)
    }
}