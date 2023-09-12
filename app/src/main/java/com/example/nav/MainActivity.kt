package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.textUsers)
        passwordEditText = findViewById(R.id.textClave)
        loginButton = findViewById(/* id = */ (R.id.btnEnter))

        loginButton.setOnClickListener{
            validarUsuario()
        }


    }
    private fun validarUsuario(){
        val usuario = usernameEditText.text.toString()
        val clave = passwordEditText.text.toString()

        if(usuario == "pablo" && clave == "123456"){

            Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, paginaUno::class.java)
            startActivities(arrayOf(intent))
            this.finish()
        }
        else{
            Toast.makeText(this, "Usuario no existe", Toast.LENGTH_SHORT).show()
        }
    }


}