package com.example.vistasapp

import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/*
  Pantalla es la base de todas las vistas del panel.
  Configura la barra superior (barra_superior.xml), que se repite en cada pantalla:
  el botón ☰ regresa al menú, 🔔 abre notificaciones y "Salir" regresa al login.
*/
open class Pantalla : AppCompatActivity() {

    // Llamar después de setContentView(...) con el título de la pantalla
    fun configurarBarra(titulo: String) {

        // Que el contenido no quede debajo de la barra de estado
        ajustarBordes()

        // Título de la barra
        findViewById<TextView>(R.id.txtTituloBarra).text = titulo

        // Regresar al menú
        findViewById<TextView>(R.id.btnVolver).setOnClickListener {
            finish()
        }

        // Abrir notificaciones
        findViewById<Button>(R.id.btnNotificaciones).setOnClickListener {
            abrir(Notificaciones::class.java)
        }

        // Salir: regresa al login y cierra las demás pantallas
        findViewById<Button>(R.id.btnSalir).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }

    // Abrir otra pantalla
    fun abrir(pantalla: Class<*>) {
        startActivity(Intent(this, pantalla))
    }

    // Las vistas no guardan nada: los botones de acción sólo muestran este aviso
    fun avisoMaqueta(accion: String) {
        Toast.makeText(this, "$accion (vista de ejemplo, no se guarda)", Toast.LENGTH_SHORT).show()
    }

    // Asigna un aviso a varios botones a la vez
    fun avisoEnBotones(vararg botones: Pair<Int, String>) {
        for ((id, accion) in botones) {
            findViewById<android.view.View>(id).setOnClickListener { avisoMaqueta(accion) }
        }
    }
}
