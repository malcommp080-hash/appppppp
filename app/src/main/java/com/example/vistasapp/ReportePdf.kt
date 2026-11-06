package com.example.vistasapp

import android.os.Bundle

class ReportePdf : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_reporte_pdf)
        configurarBarra(getString(R.string.m_reporte_pdf))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnGenerar to "Generar",
        )
    }
}
