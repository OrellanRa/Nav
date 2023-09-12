package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class paginaDos: AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_dos)


        val btn1:Button = findViewById(R.id.btnPagDosAUno)
        val btn3:Button = findViewById(R.id.btnPagDosATres)
        val btn4:Button = findViewById(R.id.btnPagDosACuatro)
        val btnClose:Button=findViewById(R.id.btnCloseDos)

        btnClose.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ MainActivity::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }


        btn1.setOnClickListener {
            val intent = Intent(/* packageContext = */ this, /* cls = */ paginaUno::class.java)
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