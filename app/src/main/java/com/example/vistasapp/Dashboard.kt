package com.example.vistasapp

import android.os.Bundle

class Dashboard : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz del dashboard
        setContentView(R.layout.activity_dashboard)
        configurarBarra(getString(R.string.m_dashboard))

        // Las tarjetas y botones llevan a su sección
        findViewById<android.view.View>(R.id.scClientes).setOnClickListener { abrir(Clientes::class.java) }
        findViewById<android.view.View>(R.id.scVentas).setOnClickListener { abrir(Ventas::class.java) }
        findViewById<android.view.View>(R.id.scPrendas).setOnClickListener { abrir(Prendas::class.java) }
        findViewById<android.view.View>(R.id.scMonto).setOnClickListener { abrir(Reportes::class.java) }
        findViewById<android.view.View>(R.id.btnVerClientes).setOnClickListener { abrir(Clientes::class.java) }
        findViewById<android.view.View>(R.id.btnVerVentas).setOnClickListener { abrir(Ventas::class.java) }
    }
}
