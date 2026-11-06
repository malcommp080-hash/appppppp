# VistasApp — vistas de DISTRIBUIDORA DAVID (Android Studio)

Maquetado de **solo vistas** del panel de administración: las mismas pantallas, la misma imagen y los mismos
colores que el admin web, hecho con la misma estructura que el proyecto Formularios (Kotlin con layouts XML).
No se conecta a nada: los datos que se ven son de ejemplo y los botones de guardar, eliminar, etc. sólo
muestran un aviso.

## Cómo abrirlo

En Android Studio: **File → Open…** y elige esta carpeta (`aplicaciones\VistasApp`). Después ▶ Run en el
emulador. En el login, «Iniciar sesión» entra directo al menú.

## Dónde está cada cosa

- `app/src/main/res/layout/`: una vista por pantalla (`activity_*.xml`). Ábrelas con la pestaña **Design**
  para editarlas.
- `app/src/main/java/com/example/vistasapp/`: una Activity por pantalla. Sólo abren la pantalla y conectan
  la navegación.
  - `Pantalla.kt` es la base que configura la barra superior.
- `res/layout/barra_superior.xml`: la barra de arriba que se repite en cada pantalla (☰, título, 🔔 y Salir).
- `res/values/colors.xml`: la paleta oscura del panel web.
- `res/values/styles.xml`: estilos reutilizables (Tarjeta, Campo, Boton, Badge, Chip…). Si cambias un
  estilo, cambia en todas las pantallas.
- `res/values/strings.xml`: textos.
- `res/drawable/`: fondos de tarjetas, campos, botones y badges. Las fotos de productos están en
  `res/drawable-nodpi/`.

## Pantallas

| Activity | Layout |
| --- | --- |
| MainActivity (login) | activity_main.xml |
| Menu (menú lateral) | activity_menu.xml |
| Dashboard | activity_dashboard.xml |
| Notificaciones | activity_notificaciones.xml |
| Ventas / NuevaVenta / ResumenVenta | activity_ventas.xml, activity_nueva_venta.xml, activity_resumen_venta.xml |
| PedidosClientes / PedidosProveedores | activity_pedidos_clientes.xml, activity_pedidos_proveedores.xml |
| Proveedores | activity_proveedores.xml |
| ValidacionPago | activity_validacion_pago.xml |
| Cotizaciones / DetalleCotizacion | activity_cotizaciones.xml, activity_detalle_cotizacion.xml |
| Clientes / Prendas / Productos / Inventario / Usuarios | activity_clientes.xml … activity_usuarios.xml |
| RespaldarBD / RestaurarBD | activity_respaldar_bd.xml, activity_restaurar_bd.xml |
| Reportes / ReportePdf / Bitacora | activity_reportes.xml, activity_reporte_pdf.xml, activity_bitacora.xml |
