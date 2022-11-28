package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class BBCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bbcactivity)

        var bbc = findViewById<WebView>(R.id.bbcView)
        bbc.loadUrl("file:///android_assets/bbc.html")
    }
}