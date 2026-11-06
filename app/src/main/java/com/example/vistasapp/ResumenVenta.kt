package com.example.vistasapp

import android.os.Bundle

class ResumenVenta : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_resumen_venta)
        configurarBarra(getString(R.string.m_resumen_venta))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnEliminarVenta to "Eliminar venta",
        )
    }
}
