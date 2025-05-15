/*
 * Clase Conexion_DB creada por Sara Inés
 * Proyecto: SAMVAL INVENTARIO
 * Evidencia: GA7-220501096-AA2-EV01
 */

package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_DB {

    private static final String URL = "jdbc:mysql://localhost:3306/samval";
    private static final String USER = "root";
    private static final String PASSWORD = "Root2020";

    public static Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos samval");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}
