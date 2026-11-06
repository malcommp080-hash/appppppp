package com.example.vistasapp

import android.os.Bundle

class ValidacionPago : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_validacion_pago)
        configurarBarra(getString(R.string.m_validacion_pago))

        // Botones de acción: en las vistas de ejemplo sólo muestran un aviso
        avisoEnBotones(
            R.id.btnAprobar to "Aprobar",
            R.id.btnRechazar to "Rechazar",
            R.id.btnConfirmarRechazo to "Confirmar rechazo",
        )
    }
}
