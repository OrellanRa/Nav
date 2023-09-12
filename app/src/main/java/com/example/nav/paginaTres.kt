package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paginaTres : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_tres)

        val btn1: Button = findViewById(R.id.btnPagTresAUno)
        val btn2: Button = findViewById(R.id.btnPagTresADos)
        val btn4: Button = findViewById(R.id.btnPagTresACuatro)
        val btnClose:Button=findViewById(R.id.btnCloseTres)

        btnClose.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }

        btn1.setOnClickListener {
            val intent4 = Intent(/* packageContext = */ this, /* cls = */ paginaUno::class.java)
            startActivities(arrayOf(intent4))

        }
        btn2.setOnClickListener {
            val intent5 = Intent(/* packageContext = */ this, /* cls = */ paginaDos::class.java)
            startActivities(arrayOf(intent5))

        }


        btn4.setOnClickListener {
            val intent6 = Intent(/* packageContext = */ this, /* cls = */ paginaCuatro::class.java)
            startActivities(arrayOf(intent6))

        }
    }
}