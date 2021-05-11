package com.daa.coilissueexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatDelegate
import coil.Coil
import coil.load
import coil.request.ImageRequest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        val image1 = findViewById<ImageView>(R.id.iv_1)
        val image2 = findViewById<ImageView>(R.id.iv_2)

        image1.load(R.drawable.ic_example_100)

        val request = ImageRequest.Builder(this)
            .data(R.drawable.ic_example_100)
            .target(image2)
            .build()
        Coil.imageLoader(this).enqueue(request)
    }
}