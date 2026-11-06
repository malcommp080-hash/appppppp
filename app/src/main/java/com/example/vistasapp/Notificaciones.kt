package com.example.vistasapp

import android.os.Bundle

class Notificaciones : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_notificaciones)
        configurarBarra(getString(R.string.m_notificaciones))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnLeerTodas to "Leer todas",
        )
    }
}
