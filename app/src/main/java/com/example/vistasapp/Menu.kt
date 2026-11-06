package com.example.vistasapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // Cargar la interfaz del menú (sidebar del panel web)
        setContentView(R.layout.activity_menu)
        ajustarBordes()

        // Cada opción del menú abre su pantalla
        val opciones = mapOf(
            // Principal
            R.id.opDashboard to Dashboard::class.java,
            R.id.opNotificaciones to Notificaciones::class.java,
            // Operatividad
            R.id.opVentas to Ventas::class.java,
            R.id.opPedidosClientes to PedidosClientes::class.java,
            R.id.opPedidosProveedores to PedidosProveedores::class.java,
            R.id.opProveedores to Proveedores::class.java,
            R.id.opValidacionPago to ValidacionPago::class.java,
            R.id.opCotizaciones to Cotizaciones::class.java,
            // Catálogos
            R.id.opClientes to Clientes::class.java,
            R.id.opPrendas to Prendas::class.java,
            R.id.opProductos to Productos::class.java,
            R.id.opInventario to Inventario::class.java,
            R.id.opUsuarios to Usuarios::class.java,
            // Sistema
            R.id.opRespaldar to RespaldarBD::class.java,
            R.id.opRestaurar to RestaurarBD::class.java,
            R.id.opReportes to Reportes::class.java,
            R.id.opReportePdf to ReportePdf::class.java,
            R.id.opBitacora to Bitacora::class.java,
        )

        for ((id, pantalla) in opciones) {

            // Obtener la opción
            val opcion = findViewById<TextView>(id)

            // Evento al hacer clic: abrir la pantalla
            opcion.setOnClickListener {
                startActivity(Intent(this, pantalla))
            }
        }

        // Obtener el botón de cerrar sesión
        val botonsalir = findViewById<Button>(R.id.btnCerrarSesion)

        // Evento al hacer clic: regresar al login
        botonsalir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}
