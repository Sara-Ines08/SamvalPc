/*
 * Clase Usuarios adaptada por Sara Inés
 * Basada en el proyecto del profesor: TallerConexionMVC
 * Proyecto: SAMVAL – Evidencia GA7-220501096-AA2-EV01
 */

package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Conexion_DB;
import javax.swing.JOptionPane;

public class Usuarios {

    private Integer id;
    private String nombre;
    private String username;
    private String password;
    private String rol;
    private String phone;

    public Usuarios() {
    }

    public Usuarios(Integer id, String username, String password, String nombre, String phone, String rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.phone = phone;
        this.rol = rol;
    }

    // Getters
    public Integer getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getNombre() { return nombre; }
    public String getPhone() { return phone; }
    public String getRol() { return rol; }

    // Método para validar login
    public static boolean validarLogin(String email, String passwordIngresada) {
        boolean accesoConcedido = false;

        try {
            Connection con = Conexion_DB.getConnection();
            String sql = "SELECT * FROM usuarios WHERE Email_Usuario = ? AND Contraseña_Usuario = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, passwordIngresada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Usuario válido: " + rs.getString("Nombre_Usuario"));
                accesoConcedido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }

            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        return accesoConcedido;
    }
}
