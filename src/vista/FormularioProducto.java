/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author sainpibi
 */
public class FormularioProducto extends javax.swing.JFrame {

    /**
     * Creates new form FormularioProducto
     */
    public FormularioProducto() {
        initComponents();
        
        
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Validar que el campo de ID no esté vacío
                if (txtID.getText().isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor, ingresa el ID del producto.");
                    return;
                }

                try {
                    int id = Integer.parseInt(txtID.getText());

                    modelo.ProductoOAD productoOAD = new modelo.ProductoOAD();
                    modelo.Producto producto = productoOAD.consultarProductoPorID(id);

                    if (producto != null) {
                        txtNombre.setText(producto.getNombre());
                        txtDescripcion.setText(producto.getDescripcion());
                        txtPrecioCompra.setText(String.valueOf(producto.getPrecioCompra()));
                        txtPrecio.setText(String.valueOf(producto.getPrecioVenta()));
                        txtCantidad.setText(String.valueOf(producto.getStock()));
                        txtFechaIngreso.setText(producto.getFechaIngreso());
                        ComboEstado.setSelectedItem(producto.getEstado());
                        txtUnidad.setText(producto.getUnidad());
                        txtFechaUltimaVenta.setText(producto.getFechaUltimaVenta());
                        txtTotalVendido.setText(String.valueOf(producto.getTotalVendido()));
                        txtID_Proveedor.setText(String.valueOf(producto.getIdProveedor()));
                        txtCategoria.setText(String.valueOf(producto.getIdCategoria()));

                        javax.swing.JOptionPane.showMessageDialog(null, "Producto encontrado.");
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    }

                } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(null, "El ID debe ser un número.");
                } catch (Exception e) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Error al consultar el producto: " + e.getMessage());
                }
            } 
        }); 
     }
        
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        panelContenido = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        JNombre = new javax.swing.JLabel();
        JPrecio = new javax.swing.JLabel();
        JCantidad = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        JID_Proveedor = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtID_Proveedor = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        JDescripción = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jPrecioCompra = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        jUnidad = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        jFechaUltimaVenta = new javax.swing.JLabel();
        txtFechaUltimaVenta = new javax.swing.JTextField();
        jTotalVendido = new javax.swing.JLabel();
        txtTotalVendido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 41, 77));
        getContentPane().setLayout(null);

        panelContenido.setBackground(new java.awt.Color(0, 119, 182));
        panelContenido.setMinimumSize(new java.awt.Dimension(450, 300));
        panelContenido.setPreferredSize(new java.awt.Dimension(450, 500));
        panelContenido.setLayout(null);

        ID.setText("ID");
        panelContenido.add(ID);
        ID.setBounds(30, 20, 17, 20);

        JNombre.setText("Nombre");
        panelContenido.add(JNombre);
        JNombre.setBounds(240, 30, 70, 20);

        JPrecio.setText("Precio");
        panelContenido.add(JPrecio);
        JPrecio.setBounds(240, 80, 43, 20);

        JCantidad.setText("Cantidad");
        panelContenido.add(JCantidad);
        JCantidad.setBounds(130, 440, 90, 20);
        panelContenido.add(txtNombre);
        txtNombre.setBounds(340, 20, 100, 26);

        JID_Proveedor.setText("ID_Proveedor");
        panelContenido.add(JID_Proveedor);
        JID_Proveedor.setBounds(20, 500, 110, 20);
        panelContenido.add(txtCantidad);
        txtCantidad.setBounds(220, 440, 90, 26);
        panelContenido.add(txtID);
        txtID.setBounds(60, 20, 110, 30);

        txtID_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_ProveedorActionPerformed(evt);
            }
        });
        panelContenido.add(txtID_Proveedor);
        txtID_Proveedor.setBounds(150, 500, 80, 26);

        btnAgregar.setBackground(new java.awt.Color(0, 41, 77));
        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 41, 77));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelContenido.add(btnAgregar);
        btnAgregar.setBounds(20, 590, 89, 29);
        panelContenido.add(txtPrecio);
        txtPrecio.setBounds(330, 80, 90, 26);

        btnConsultar.setBackground(new java.awt.Color(0, 41, 77));
        btnConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(0, 41, 77));
        btnConsultar.setText("Consultar");
        panelContenido.add(btnConsultar);
        btnConsultar.setBounds(120, 590, 100, 30);

        JDescripción.setText("Descripción");
        panelContenido.add(JDescripción);
        JDescripción.setBounds(30, 70, 100, 20);

        btnActualizar.setBackground(new java.awt.Color(0, 41, 77));
        btnActualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 41, 77));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panelContenido.add(btnActualizar);
        btnActualizar.setBounds(230, 590, 110, 30);

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        panelContenido.add(txtDescripcion);
        txtDescripcion.setBounds(120, 70, 84, 50);

        btnEliminar.setBackground(new java.awt.Color(0, 41, 77));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 41, 77));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelContenido.add(btnEliminar);
        btnEliminar.setBounds(360, 590, 89, 25);

        jPrecioCompra.setText("Precio Compra");
        panelContenido.add(jPrecioCompra);
        jPrecioCompra.setBounds(20, 130, 110, 30);
        panelContenido.add(txtPrecioCompra);
        txtPrecioCompra.setBounds(150, 140, 90, 26);

        jLabel1.setText("Estado");
        panelContenido.add(jLabel1);
        jLabel1.setBounds(310, 140, 100, 20);

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "No disponible" }));
        ComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEstadoActionPerformed(evt);
            }
        });
        panelContenido.add(ComboEstado);
        ComboEstado.setBounds(310, 170, 110, 30);

        jUnidad.setText("Unidad");
        panelContenido.add(jUnidad);
        jUnidad.setBounds(30, 210, 50, 20);
        panelContenido.add(txtUnidad);
        txtUnidad.setBounds(110, 210, 120, 26);

        jFechaIngreso.setText("Fecha Ingreso");
        panelContenido.add(jFechaIngreso);
        jFechaIngreso.setBounds(220, 260, 120, 20);

        txtFechaIngreso.setText("YYYY-MM-DD");
        panelContenido.add(txtFechaIngreso);
        txtFechaIngreso.setBounds(340, 260, 110, 26);

        jFechaUltimaVenta.setText("Fecha Última Venta");
        panelContenido.add(jFechaUltimaVenta);
        jFechaUltimaVenta.setBounds(50, 290, 150, 20);

        txtFechaUltimaVenta.setText("YYYY-MM-DD");
        panelContenido.add(txtFechaUltimaVenta);
        txtFechaUltimaVenta.setBounds(220, 310, 140, 26);

        jTotalVendido.setText("Total Vendido");
        panelContenido.add(jTotalVendido);
        jTotalVendido.setBounds(190, 360, 120, 20);
        panelContenido.add(txtTotalVendido);
        txtTotalVendido.setBounds(340, 360, 110, 26);

        jLabel2.setText("ID Categoría");
        panelContenido.add(jLabel2);
        jLabel2.setBounds(30, 340, 120, 20);
        panelContenido.add(txtCategoria);
        txtCategoria.setBounds(20, 370, 100, 26);

        getContentPane().add(panelContenido);
        panelContenido.setBounds(0, 0, 480, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtID_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_ProveedorActionPerformed
       
    }//GEN-LAST:event_txtID_ProveedorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
                                            
    try {
        modelo.Producto producto = new modelo.Producto();

        producto.setId(Integer.parseInt(txtID.getText()));
        producto.setNombre(txtNombre.getText());
        producto.setDescripcion(txtDescripcion.getText());
        producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText()));
        producto.setPrecioVenta(Double.parseDouble(txtPrecio.getText()));
        producto.setStock(Integer.parseInt(txtCantidad.getText()));
        producto.setFechaIngreso(txtFechaIngreso.getText());
        producto.setEstado(ComboEstado.getSelectedItem().toString());
        producto.setUnidad(txtUnidad.getText());
        producto.setFechaUltimaVenta(txtFechaUltimaVenta.getText());
        producto.setTotalVendido(Integer.parseInt(txtTotalVendido.getText()));
        producto.setIdProveedor(Integer.parseInt(txtID_Proveedor.getText()));
        producto.setIdCategoria(Integer.parseInt(txtCategoria.getText()));

        modelo.ProductoOAD acceso = new modelo.ProductoOAD();
        boolean resultado = acceso.insertarProducto(producto);

        if (resultado) {
            javax.swing.JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo agregar el producto.");
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al agregar producto: " + e.getMessage());
    


  }  
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void ComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstadoActionPerformed
       
    }//GEN-LAST:event_ComboEstadoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                
        try {
            modelo.Producto producto = new modelo.Producto();

            producto.setId(Integer.parseInt(txtID.getText()));
            producto.setNombre(txtNombre.getText());
            producto.setDescripcion(txtDescripcion.getText());
            producto.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText()));
            producto.setPrecioVenta(Double.parseDouble(txtPrecio.getText()));
            producto.setStock(Integer.parseInt(txtCantidad.getText()));
            producto.setFechaIngreso(txtFechaIngreso.getText());
            producto.setEstado(ComboEstado.getSelectedItem().toString());
            producto.setUnidad(txtUnidad.getText());
            producto.setFechaUltimaVenta(txtFechaUltimaVenta.getText());
            producto.setTotalVendido(Integer.parseInt(txtTotalVendido.getText()));
            producto.setIdProveedor(Integer.parseInt(txtID_Proveedor.getText()));
            producto.setIdCategoria(Integer.parseInt(txtCategoria.getText()));

            modelo.ProductoOAD acceso = new modelo.ProductoOAD();
            boolean actualizado = acceso.actualizarProducto(producto);

            if (actualizado) {
                javax.swing.JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo actualizar el producto.");
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar producto: " + e.getMessage());
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Código implementado por Sara Inés para eliminar un producto por su ID
    try {
        // Validar que el campo de ID no esté vacío
        if (txtID.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingresa el ID del producto que deseas eliminar.");
            return;
        }

        int confirmacion = javax.swing.JOptionPane.showConfirmDialog(this, "¿Estás segura de eliminar este producto?", "Confirmar eliminación", javax.swing.JOptionPane.YES_NO_OPTION);
        if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {

            int idProducto = Integer.parseInt(txtID.getText());

            modelo.ProductoOAD productoOAD = new modelo.ProductoOAD();
            boolean eliminado = productoOAD.eliminarProducto(idProducto);

            if (eliminado) {
                javax.swing.JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");

                // Limpiar los campos después de eliminar
                txtNombre.setText("");
                txtDescripcion.setText("");
                txtPrecioCompra.setText("");
                txtPrecio.setText("");
                txtCantidad.setText("");
                txtFechaIngreso.setText("");
                ComboEstado.setSelectedIndex(0);
                txtUnidad.setText("");
                txtFechaUltimaVenta.setText("");
                txtTotalVendido.setText("");
                txtID_Proveedor.setText("");
                txtCategoria.setText("");
                txtID.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo eliminar el producto.");
            }

        }

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar el producto: " + e.getMessage());
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel JCantidad;
    private javax.swing.JLabel JDescripción;
    private javax.swing.JLabel JID_Proveedor;
    private javax.swing.JLabel JNombre;
    private javax.swing.JLabel JPrecio;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jFechaIngreso;
    private javax.swing.JLabel jFechaUltimaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jPrecioCompra;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel jTotalVendido;
    private javax.swing.JLabel jUnidad;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaUltimaVenta;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID_Proveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtTotalVendido;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}
