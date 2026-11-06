package com.example.vistasapp

import android.os.Bundle

class PedidosClientes : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_pedidos_clientes)
        configurarBarra(getString(R.string.m_pedidos_clientes))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnGuardar to "Guardar",
            R.id.btnEliminar3 to "Eliminar",
            R.id.btnEliminar2 to "Eliminar",
            R.id.btnEliminar1 to "Eliminar",
        )
    }
}
