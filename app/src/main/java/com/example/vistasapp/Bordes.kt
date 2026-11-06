package com.example.vistasapp

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

/*
  Desde Android 15 las apps se dibujan detrás de la barra de estado y de navegación.
  Esta función agrega ese espacio como margen interno a la vista raíz (id "main") de cada layout,
  para que el contenido no quede debajo de la hora o de los botones del sistema.
*/
fun AppCompatActivity.ajustarBordes() {
    ViewCompat.setOnApplyWindowInsetsListener(findViewById<View>(R.id.main)) { vista, insets ->
        val sistema = insets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.ime())
        vista.setPadding(sistema.left, sistema.top, sistema.right, sistema.bottom)
        insets
    }
}
