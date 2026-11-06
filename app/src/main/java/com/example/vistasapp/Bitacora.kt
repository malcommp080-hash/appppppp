package com.example.vistasapp

import android.os.Bundle

class Bitacora : Pantalla() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Cargar la interfaz
        setContentView(R.layout.activity_bitacora)
        configurarBarra(getString(R.string.m_bitacora))

    }
}
