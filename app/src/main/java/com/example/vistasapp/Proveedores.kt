package com.example.vistasapp

import android.os.Bundle

class Proveedores : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_proveedores)
        configurarBarra(getString(R.string.m_proveedores))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnGuardar to "Guardar",
            R.id.btnEditar2 to "Editar",
            R.id.btnEliminar2 to "Eliminar",
            R.id.btnEditar1 to "Editar",
            R.id.btnEliminar1 to "Eliminar",
        )
    }
}
