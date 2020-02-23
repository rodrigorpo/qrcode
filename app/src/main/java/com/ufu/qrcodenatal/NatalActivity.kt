package com.ufu.qrcodenatal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

class NatalActivity : AppCompatActivity() {
    var lastScreen = false

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_natal)

        val btnBack = findViewById<Button>(R.id.bt_back)
        val tvTitle = findViewById<TextView>(R.id.tv_title)
        val tvContent = findViewById<TextView>(R.id.tv_content)
        val ivMovie = findViewById<ImageView>(R.id.iv_movie)

        btnBack.setOnClickListener(clickListener)

        if (intent.hasExtra("HASH")) {
            val hash = intent.getStringExtra("HASH") as String
            when (hash) {
                "b2c54c3c-870b-40ed-9441-abde04da97aa" -> {
                    Picasso.get()
                        .load("https://natal.s3-sa-east-1.amazonaws.com/first_qr_code_colored.png")
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(ivMovie)
                    tvTitle.text = "Primeiro QR Code"
                    tvContent.text = "O próximo QR Code se encontra na cozinha com a cor Azul"
                }
                "89a761b3-b557-425e-ad0b-e177b08b2614" -> {
                    Picasso.get()
                        .load("https://natal.s3-sa-east-1.amazonaws.com/second_qr_code_colored.png")
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(ivMovie)
                    tvTitle.text = "Segundo QR Code"
                    tvContent.text = "O próximo QR Code se encontra atrás da TV com a cor Verde"
                }
                "79abd06c-d83c-4ead-984e-e3422ddcf673" -> {
                    Picasso.get()
                        .load("https://natal.s3-sa-east-1.amazonaws.com/third_qr_code_colored.png")
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(ivMovie)
                    tvTitle.text = "Terceiro QR Code"
                    tvContent.text =
                        "O próximo QR Code se encontra na porta do quarto do meu pai com a cor Preta"
                }
                "4e1dbc5f-789c-456c-aff9-52fcdf7e0c95" -> {
                    Picasso.get()
                        .load("https://natal.s3-sa-east-1.amazonaws.com/fourth_qr_code_v3.png")
                        .placeholder(R.drawable.ic_launcher_background)
                        .into(ivMovie)
                    tvTitle.text = "Quarto QR Code"
                    tvContent.text = "Seu presente encontra-se na geladeira com seu nome!"
                    btnBack.setText("Terminar")
                    lastScreen = true
                }
            }
        }
    }

    private val clickListener = View.OnClickListener { endActivity() }

    private fun endActivity() {
        if (lastScreen) {
            Log.d("FinalActivity", "Finishing App")
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
            return
        }
        Log.d("NatalActivity", "Finishing activity")
        this.finish()
    }
}
