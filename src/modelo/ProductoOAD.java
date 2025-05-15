/*
 * Clase ProductoOAD actualizada por Sara Inés
 * Proyecto: SAMVAL
 * Evidencia: GA7-220501096-AA2-EV01
 */

package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProductoOAD {

    // Método para insertar un producto en la base de datos
    public boolean insertarProducto(Producto producto) {
        boolean resultado = false;

        try {
            Connection con = Conexion_DB.getConnection();

            String sql = "INSERT INTO productos (ID_Producto, Nombre_Producto, Descripción_Producto, PrecioCompra_Producto, PrecioVenta_Producto, Stock_Producto, FechaIngreso_Producto, Estado_Producto, Unidad_Producto, FechaÚltimaVenta_Producto, Total_Vendido, ID_Proveedor, ID_Categoría) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getId());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getDescripcion());
            ps.setDouble(4, producto.getPrecioCompra());
            ps.setDouble(5, producto.getPrecioVenta());
            ps.setInt(6, producto.getStock());
            ps.setString(7, producto.getFechaIngreso());
            ps.setString(8, producto.getEstado());
            ps.setString(9, producto.getUnidad());
            ps.setString(10, producto.getFechaUltimaVenta());
            ps.setInt(11, producto.getTotalVendido());
            ps.setInt(12, producto.getIdProveedor());
            ps.setInt(13, producto.getIdCategoria());

            ps.executeUpdate();
            resultado = true;

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al insertar producto: " + e.getMessage());
        }

        return resultado;
    }

    // Método para consultar un producto por su ID
    public Producto consultarProductoPorID(int idProducto) {
        Producto producto = null;

        try {
            Connection con = Conexion_DB.getConnection();

            String sql = "SELECT * FROM productos WHERE ID_Producto = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                producto = new Producto();

                producto.setId(rs.getInt("ID_Producto"));
                producto.setNombre(rs.getString("Nombre_Producto"));
                producto.setDescripcion(rs.getString("Descripción_Producto"));
                producto.setPrecioCompra(rs.getDouble("PrecioCompra_Producto"));
                producto.setPrecioVenta(rs.getDouble("PrecioVenta_Producto"));
                producto.setStock(rs.getInt("Stock_Producto"));
                producto.setFechaIngreso(rs.getString("FechaIngreso_Producto"));
                producto.setEstado(rs.getString("Estado_Producto"));
                producto.setUnidad(rs.getString("Unidad_Producto"));
                producto.setFechaUltimaVenta(rs.getString("FechaÚltimaVenta_Producto"));
                producto.setTotalVendido(rs.getInt("Total_Vendido"));
                producto.setIdProveedor(rs.getInt("ID_Proveedor"));
                producto.setIdCategoria(rs.getInt("ID_Categoría"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al consultar producto: " + e.getMessage());
        }

        return producto;
    }

    // Método para actualizar los datos de un producto
    public boolean actualizarProducto(Producto producto) {
        boolean actualizado = false;

        try {
            Connection con = Conexion_DB.getConnection();

            String sql = "UPDATE productos SET Nombre_Producto=?, Descripción_Producto=?, PrecioCompra_Producto=?, PrecioVenta_Producto=?, Stock_Producto=?, FechaIngreso_Producto=?, Estado_Producto=?, Unidad_Producto=?, FechaÚltimaVenta_Producto=?, Total_Vendido=?, ID_Proveedor=?, ID_Categoría=? WHERE ID_Producto=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setDouble(3, producto.getPrecioCompra());
            ps.setDouble(4, producto.getPrecioVenta());
            ps.setInt(5, producto.getStock());
            ps.setString(6, producto.getFechaIngreso());
            ps.setString(7, producto.getEstado());
            ps.setString(8, producto.getUnidad());
            ps.setString(9, producto.getFechaUltimaVenta());
            ps.setInt(10, producto.getTotalVendido());
            ps.setInt(11, producto.getIdProveedor());
            ps.setInt(12, producto.getIdCategoria());
            ps.setInt(13, producto.getId());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                actualizado = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al actualizar producto: " + e.getMessage());
        }

        return actualizado;
    }

    // Método para eliminar un producto por su ID
    public boolean eliminarProducto(int idProducto) {
        boolean eliminado = false;

        try {
            Connection con = Conexion_DB.getConnection();

            String sql = "DELETE FROM productos WHERE ID_Producto = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                eliminado = true;
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al eliminar producto: " + e.getMessage());
        }

        return eliminado;
    }

} // Fin de la clase ProductoOAD
