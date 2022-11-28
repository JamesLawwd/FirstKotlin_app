package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TechnologyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technology)

        var technology = findViewById<WebView>(R.id.technologyView)
        technology.loadUrl("file:///android_assets/technology.html")


    }
}