package com.ufu.qrcodenatal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NatalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natal)
        if (intent.hasExtra("HASH")) {
            val hash = intent.getStringExtra("HASH") as String
            when (hash) {
                "FILIPE" -> {

                }
                "TESTE" -> {

                }
            }
        }
    }
}
