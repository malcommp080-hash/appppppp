package com.example.vistasapp

import android.os.Bundle

class RespaldarBD : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_respaldar_bd)
        configurarBarra(getString(R.string.m_respaldar))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnDescargar to "Descargar",
        )
    }
}
