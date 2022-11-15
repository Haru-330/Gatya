package com.example.gatya

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.example.gatya.databinding.ActivityStartBinding

class Start : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        val actionBar: ActionBar? = supportActionBar
        if (actionBar != null) {
            actionBar.setTitle("スタート画面")
            actionBar.setBackgroundDrawable(ColorDrawable(Color.argb(100,144,238 ,14)))
        }
        binding.button2.setOnClickListener{
            val intent = Intent(application,MainActivity::class.java)
            startActivity(intent)
        }
    }
}