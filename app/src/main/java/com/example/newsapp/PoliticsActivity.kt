package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PoliticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politics)

        var politics = findViewById<WebView>(R.id.politicsView)
        politics.loadUrl("file:///android_asset/politics.html")
    }
}