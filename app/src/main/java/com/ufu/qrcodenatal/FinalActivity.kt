package com.ufu.qrcodenatal

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class FinalActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val ivFinal = findViewById<ImageView>(R.id.iv_movie_final)

        Picasso.get()
            .load("https://natal.s3-sa-east-1.amazonaws.com/14568021_1217152641679855_187517150649091117_n.jpg")
            .placeholder(R.drawable.ic_launcher_background)
            .into(ivFinal)
    }
}
