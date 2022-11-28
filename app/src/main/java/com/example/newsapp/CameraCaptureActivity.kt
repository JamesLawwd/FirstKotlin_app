package com.example.newsapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CameraCaptureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_capture)

        var camera_capture = findViewById<WebView>(R.id.camera_captureView)
        camera_capture.loadUrl("file:///android_assets/camera_capture.html")
    }
}