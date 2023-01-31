package com.amin.teslaneumorphism

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.amin.teslaneumorphism.databinding.ActivityMainBinding
import soup.neumorphism.NeumorphShapeAppearanceModel
import soup.neumorphism.ShapeType

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnOpen.setOnClickListener {
            val intent = Intent(this , Activity2::class.java)
            binding.btnOpenText.setTextColor( ContextCompat.getColor(this, R.color.blue_light))
            binding.btnOpenLogo.setColorFilter( ContextCompat.getColor(this, R.color.blue_light))
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        binding.btnOpenText.setTextColor( ContextCompat.getColor(this, R.color.gray_light))
        binding.btnOpenLogo.setColorFilter( ContextCompat.getColor(this, R.color.gray_light))
    }
}