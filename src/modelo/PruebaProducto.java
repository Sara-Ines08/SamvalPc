/*
 * Clase de prueba actualizada por Sara Inés
 * Proyecto: SAMVAL
 * Evidencia: GA7-220501096-AA2-EV01
 */

package modelo;

public class PruebaProducto {

    public static void main(String[] args) {
        // Crear un nuevo producto con datos de ejemplo
        Producto nuevoProducto = new Producto(
            0,                         // ID (autogenerado en la BD)
            "Plato #8",               // Nombre
            "Plato desechable resistente", // Descripción
            120.5,                    // Precio de compra
            200.0,                    // Precio de venta
            50,                       // Stock
            "Disponible",             // Estado
            "Unidad",                 // Unidad
            "2024-06-01",             // Fecha de ingreso
            "2024-06-10",             // Fecha última venta
            10,                       // Total vendido
            1,                        // ✅ ID proveedor corregido (de 2 a 1)
            1                         // ID categoría
        );

        // Usar la clase ProductoOAD para insertar en la base de datos
        ProductoOAD acceso = new ProductoOAD();
        boolean exito = acceso.insertarProducto(nuevoProducto);

        if (exito) {
            System.out.println("🟢 Prueba exitosa: producto guardado.");
        } else {
            System.out.println("🔴 Prueba fallida: no se pudo guardar el producto.");
        }
    }
}
