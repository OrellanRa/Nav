package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paginaUno : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_uno)


        val btn2:Button = findViewById(R.id.btnPagUnoADos)
        val btn3:Button = findViewById(R.id.btnPagUnoATres)
        val btn4:Button = findViewById(R.id.btnPagUnoACuatro)
        val btnClose:Button=findViewById(R.id.btnCloseUno)

        btnClose.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }


        btn2.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaDos::class.java)
            startActivities(arrayOf(intent))

        }
        btn3.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaTres::class.java)
            startActivities(arrayOf(intent))

        }
        btn4.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaCuatro::class.java)
            startActivities(arrayOf(intent))

        }
    }


}