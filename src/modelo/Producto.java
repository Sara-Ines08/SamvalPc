/*
 * Clase Producto actualizada por Sara Inés
 * Proyecto: SAMVAL
 * Evidencia: GA7-220501096-AA2-EV01
 */

package modelo;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private String fechaIngreso;
    private String estado;
    private String unidad;
    private String fechaUltimaVenta;
    private int totalVendido;
    private int idProveedor;
    private int idCategoria;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con todos los campos
    public Producto(int id, String nombre, String descripcion, double precioCompra, double precioVenta,
                    int stock, String fechaIngreso, String estado, String unidad,
                    String fechaUltimaVenta, int totalVendido, int idProveedor, int idCategoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
        this.unidad = unidad;
        this.fechaUltimaVenta = fechaUltimaVenta;
        this.totalVendido = totalVendido;
        this.idProveedor = idProveedor;
        this.idCategoria = idCategoria;
    }

    // Getters y Setters personalizados por Sara Inés
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getFechaUltimaVenta() {
        return fechaUltimaVenta;
    }

    public void setFechaUltimaVenta(String fechaUltimaVenta) {
        this.fechaUltimaVenta = fechaUltimaVenta;
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
}
