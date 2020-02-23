package com.ufu.qrcodenatal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        val btnStart = findViewById<Button>(R.id.bt_search)
        btnStart.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { goToCameraActivity() }

    private fun goToCameraActivity() {
        Log.d("MainActivity", "Clicked on button")
        val intent = Intent(this, CameraActivity::class.java)
        startActivity(intent)
    }
}
