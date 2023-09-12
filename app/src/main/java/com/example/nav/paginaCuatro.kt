package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paginaCuatro : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_cuatro)


        val btn1:Button = findViewById(R.id.btnPagCuatroAUno)
        val btn2:Button = findViewById(R.id.btnPagCuatroADos)
        val btn3:Button = findViewById(R.id.btnPagCuatroATres)
        val btnClose:Button=findViewById(R.id.btnCloseCuatro)

        btnClose.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }


        btn1.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaUno::class.java)
            startActivities(arrayOf(intent))

        }
        btn2.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaDos::class.java)
            startActivities(arrayOf(intent))

        }
        btn3.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaTres::class.java)
            startActivities(arrayOf(intent))

        }
    }


}