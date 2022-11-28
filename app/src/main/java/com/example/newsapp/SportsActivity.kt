package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class SportsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)

        var sports = findViewById<WebView>(R.id.sportsView)
     sports.loadUrl("file:///android_asset/sports.html")


    }
}