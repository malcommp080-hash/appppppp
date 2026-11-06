package com.example.vistasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz del login
        setContentView(R.layout.activity_main)
        ajustarBordes()

        // Obtener el botón
        val botonIniciar = findViewById<Button>(R.id.btnIniciar)

        // Evento al hacer clic: en la vista de ejemplo entra sin revisar usuario
        botonIniciar.setOnClickListener {

            // Abrir el menú
            val intent = Intent(this, Menu::class.java)

            startActivity(intent)
        }

        // ¿Olvidó su contraseña?
        findViewById<TextView>(R.id.txtOlvido).setOnClickListener {
            Toast.makeText(this, "Se avisaría al administrador (vista de ejemplo)", Toast.LENGTH_SHORT).show()
        }
    }
}
