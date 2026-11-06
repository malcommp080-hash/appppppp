package com.example.vistasapp

import android.os.Bundle
import android.view.View

class Ventas : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_ventas)
        configurarBarra(getString(R.string.m_ventas))

        // Abrir otras pantallas
        findViewById<View>(R.id.btnRegistrarVenta).setOnClickListener { abrir(NuevaVenta::class.java) }
        findViewById<View>(R.id.venta24).setOnClickListener { abrir(ResumenVenta::class.java) }
        findViewById<View>(R.id.venta23).setOnClickListener { abrir(ResumenVenta::class.java) }
        findViewById<View>(R.id.venta22).setOnClickListener { abrir(ResumenVenta::class.java) }
        findViewById<View>(R.id.venta21).setOnClickListener { abrir(ResumenVenta::class.java) }
        findViewById<View>(R.id.venta20).setOnClickListener { abrir(ResumenVenta::class.java) }
    }
}
