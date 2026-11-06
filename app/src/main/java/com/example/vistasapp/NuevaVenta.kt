package com.example.vistasapp

import android.os.Bundle
import android.view.View

class NuevaVenta : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_nueva_venta)
        configurarBarra(getString(R.string.m_nueva_venta))

        // Abrir otras pantallas
        findViewById<View>(R.id.btnGuardarVenta).setOnClickListener { abrir(ResumenVenta::class.java) }

        // Cancelar: regresar a la lista de ventas
        findViewById<View>(R.id.btnCancelar).setOnClickListener { finish() }

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnQuitar1 to "Quitar",
            R.id.btnQuitar2 to "Quitar",
            R.id.btnAgregarProducto to "Agregar producto",
        )
    }
}
