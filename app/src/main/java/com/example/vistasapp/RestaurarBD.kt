package com.example.vistasapp

import android.os.Bundle

class RestaurarBD : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_restaurar_bd)
        configurarBarra(getString(R.string.m_restaurar))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnElegirArchivo to "Elegir archivo",
            R.id.btnRestaurar to "Restaurar",
        )
    }
}
