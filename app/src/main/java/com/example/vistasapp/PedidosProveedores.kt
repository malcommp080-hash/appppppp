package com.example.vistasapp

import android.os.Bundle

class PedidosProveedores : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_pedidos_proveedores)
        configurarBarra(getString(R.string.m_pedidos_proveedores))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnGuardar to "Guardar",
            R.id.btnEliminar31 to "Eliminar",
            R.id.btnEliminar30 to "Eliminar",
            R.id.btnEliminar29 to "Eliminar",
        )
    }
}
