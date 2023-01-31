package com.amin.teslaneumorphism

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.amin.teslaneumorphism.databinding.Activity2Binding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class Activity2 : AppCompatActivity() {
    private lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        /*var count = 0
        binding.btnBatteryBN.setOnClickListener {
            when(count){
                0->{
                    binding.btnBatteryBN.setShapeType(ShapeType.PRESSED)
                    binding.btnBatteryBN.setColorFilter(ContextCompat.getColor(this , R.color.blue_light), PorterDuff.Mode.LIGHTEN)
                }
                1->{
                    binding.btnBatteryBN.setShapeType(ShapeType.FLAT)
                    binding.btnBatteryBN.setColorFilter(ContextCompat.getColor(this , R.color.text_gray))
                }

            }
            count++
            if (count == 2){
                count = 0
            }
        }*/
        
        onClick()

        
    }

    private fun onClick() {
        binding.btnBatteryBN.setOnClickListener {
            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {
                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDryBN.setShapeType(ShapeType.FLAT)
                binding.btnDirectionBN.setShapeType(ShapeType.FLAT)
                binding.btnClockBN.setShapeType(ShapeType.FLAT)

                binding.btnDryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnDirectionBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnClockBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnDryBN.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnBatteryBN.setShapeType(ShapeType.FLAT)
                binding.btnDirectionBN.setShapeType(ShapeType.FLAT)
                binding.btnClockBN.setShapeType(ShapeType.FLAT)

                binding.btnBatteryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnDirectionBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnClockBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnDirectionBN.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDryBN.setShapeType(ShapeType.FLAT)
                binding.btnBatteryBN.setShapeType(ShapeType.FLAT)
                binding.btnClockBN.setShapeType(ShapeType.FLAT)

                binding.btnDryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnBatteryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnClockBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnClockBN.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDryBN.setShapeType(ShapeType.FLAT)
                binding.btnDirectionBN.setShapeType(ShapeType.FLAT)
                binding.btnBatteryBN.setShapeType(ShapeType.FLAT)

                binding.btnDryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnDirectionBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnBatteryBN.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.neumorphProfileMe.setOnClickListener {
            val intent = Intent(this , ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}