package com.example.vistasapp

import android.os.Bundle

class Productos : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_productos)
        configurarBarra(getString(R.string.m_productos))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnElegirImagen to "Elegir imagen",
            R.id.btnQuitarImagen to "Quitar imagen",
            R.id.btnGuardar to "Guardar",
            R.id.btnEditar1 to "Editar",
            R.id.btnEliminar1 to "Eliminar",
            R.id.btnEditar2 to "Editar",
            R.id.btnEliminar2 to "Eliminar",
            R.id.btnEditar3 to "Editar",
            R.id.btnEliminar3 to "Eliminar",
            R.id.btnEditar4 to "Editar",
            R.id.btnEliminar4 to "Eliminar",
        )
    }
}
