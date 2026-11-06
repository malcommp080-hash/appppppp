package com.example.vistasapp

import android.os.Bundle
import android.view.View

class Cotizaciones : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_cotizaciones)
        configurarBarra(getString(R.string.m_cotizaciones))

        // Abrir otras pantallas
        findViewById<View>(R.id.cotizacion3).setOnClickListener { abrir(DetalleCotizacion::class.java) }
        findViewById<View>(R.id.cotizacion2).setOnClickListener { abrir(DetalleCotizacion::class.java) }
    }
}
