package com.example.newsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sportBtn = findViewById<Button>(R.id.sports)
        sportBtn.setOnClickListener {
            var intent = Intent(applicationContext, SportsActivity::class.java)
            startActivity(intent)
        }

        var technology = findViewById<Button>(R.id.technology)
        technology.setOnClickListener {
            var technologyIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.technology.com"))
            startActivity(technologyIntent)
        }




        var bbcNews = findViewById<Button>(R.id.bbc)
        bbcNews.setOnClickListener {
            var bbcIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bbc.com"))
            startActivity(bbcIntent)
        }

        var dialer = findViewById<Button>(R.id.dial)
        dialer.setOnClickListener {
            var dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:0798242313"))
            startActivity(dialIntent)
        }

        var cameraCapture = findViewById<Button>(R.id.camera)
        cameraCapture.setOnClickListener {
            var cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }
        // Explicit and /Implicit Intents
    } // end onCreate
}