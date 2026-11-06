package com.example.vistasapp

import android.os.Bundle

class Inventario : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_inventario)
        configurarBarra(getString(R.string.m_inventario))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnGuardarStock to "Guardar stock",
        )
    }
}
