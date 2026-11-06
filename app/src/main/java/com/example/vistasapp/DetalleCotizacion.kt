package com.example.vistasapp

import android.os.Bundle

class DetalleCotizacion : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_detalle_cotizacion)
        configurarBarra(getString(R.string.m_cotizacion))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnLlamar to "Llamar",
            R.id.btnAtender to "Atender",
        )
    }
}
