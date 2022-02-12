package com.bunbeauty.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bunbeauty.notes.databinding.ActivityMainBinding

/*
*1.Single Activity
* */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
    }

}