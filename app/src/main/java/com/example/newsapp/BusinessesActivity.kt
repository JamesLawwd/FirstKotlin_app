package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class BusinessesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_businesses)

        var business = findViewById<WebView>(R.id.businessesView)
        business.loadUrl("file:///android_asset/businesses.html")
    }
}