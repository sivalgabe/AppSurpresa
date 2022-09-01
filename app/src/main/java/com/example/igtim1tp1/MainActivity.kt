package com.example.igtim1tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botao = findViewById<Button>(R.id.BotaoCliqueAqui)
        botao.setOnClickListener {
            startActivity(Intent(this,ParabensActivity::class.java))
        }
    }
}