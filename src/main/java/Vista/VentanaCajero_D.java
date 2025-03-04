/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorCliente;
import Controlador.ControladorEmpleados;
import Controlador.ControladorFactura;
import Controlador.ControladorProducto;
import Controlador.ControladorVenta;
import Modelo.Cliente;
import Modelo.Empleados;
import Modelo.Factura;
import Modelo.Producto;
import Modelo.Venta;
import excepciones.CantidadDeProductosExcepciones;
import excepciones.IdVentaDuplicadoException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDRES FELIPE
 */
public class VentanaCajero_D extends javax.swing.JFrame {

    ControladorFactura controladorFactura;
    ControladorEmpleados controladorEmpleado;
    ControladorCliente controladorCliente;
    ControladorProducto controladorProducto;
    ControladorVenta controladorVenta;
    ArrayList<Venta> listaVenta;
    ArrayList<Producto> listaProducto;

    /**
     * Creates new form VentanaCajero
     */
    public VentanaCajero_D() {
        controladorFactura = new ControladorFactura();
        controladorCliente = new ControladorCliente();
        controladorProducto = new ControladorProducto();
        controladorEmpleado = new ControladorEmpleados();
        controladorVenta = new ControladorVenta();
        initComponents();
        cargarProducto();
        cargaCajero();
        cargarCliente();
        llenarTabla();
        setLocationRelativeTo(this);
    }

    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"IdVenta", "Fecha", "Cajero", "Cliente", "Producto", "Cantidad de Producto", "Puntos Del cliente"});

        for (int i = 0; i < controladorVenta.getVenta().size(); i++) {
            Venta venta = controladorVenta.getVenta().get(i);
            model.addRow(new Object[]{
                venta.getIdVenta(),
                venta.getFecha(),
                venta.getEmpleado(),
                venta.getCliente(),
                venta.getProducto(),
                venta.getCantidadProducto(),
                venta.getPuntosRedimidos()

            });
        }

        tbCajero.setModel(model);
    }

    private void cargaCajero() {
        cbCajero.removeAllItems();

        ArrayList<Empleados> laboratorios = controladorEmpleado.getListaEmpleados();

        if (laboratorios != null) {
            for (Empleados laboratorio : laboratorios) {
                if (laboratorio.getRol().equals("Cajero")) {
                    cbCajero.addItem(laboratorio);
                }

            }
        }
    }

    private void cargarCliente() {
        cbCliente.removeAllItems();

        ArrayList<Cliente> laboratorios = controladorCliente.getCliente();

        if (laboratorios != null) {
            for (Cliente laboratorio : laboratorios) {

                cbCliente.addItem(laboratorio);
            }
        }
    }

    private void cargarProducto() {
        cbProducto.removeAllItems();

        ArrayList<Producto> laboratorios = controladorProducto.getProducto();

        if (laboratorios != null) {
            for (Producto laboratorio : laboratorios) {

                cbProducto.addItem(laboratorio);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCajero = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIDventa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuntos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbCajero = new javax.swing.JComboBox<>();
        cbCliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCantidadProductos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Regreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbCajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbCajero);

        jButton2.setText("Agregar al Carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Comprar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("IdVenta");

        jLabel2.setText("Empleado Cajero");

        jLabel3.setText("Puntos a Gastar");

        jLabel4.setText("Cliente");

        jLabel5.setText("Producto");

        jLabel6.setText("Cantidad De Productos");

        jLabel7.setText("Fecha De Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(103, 103, 103))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIDventa)
                            .addComponent(cbCajero, 0, 94, Short.MAX_VALUE)
                            .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadProductos)
                            .addComponent(txtFecha))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(90, 90, 90)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(50, 50, 50)
                        .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cbCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidadProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Login vc = new Login();
        vc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int idVenta;
        try {
            idVenta = Integer.parseInt(txtIDventa.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID de venta válido.", "ID de Venta Inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String fecha = txtFecha.getText();
        Empleados empleado = (Empleados) cbCajero.getSelectedItem();
        Cliente cliente = (Cliente) cbCliente.getSelectedItem();
        Producto producto = (Producto) cbProducto.getSelectedItem();
        int cantidadProducto;
        try {
            cantidadProducto = Integer.parseInt(txtCantidadProductos.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese una cantidad de productos válida.", "Cantidad de Productos Inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int puntos = 0;
        try {
            puntos = Integer.parseInt(txtPuntos.getText());
        } catch (NumberFormatException e) {
            // Si no se ingresan puntos, se asume que son 0.
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento;
        try {
            fechaNacimiento = LocalDate.parse(txtFecha.getText(), formatter);
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese una fecha válida.", "Fecha Inválida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Factura factura = new Factura(idVenta, fechaNacimiento, empleado, cliente, producto, puntos, cantidadProducto);
        Venta venta = new Venta(idVenta, fechaNacimiento, empleado, cliente, producto, puntos, cantidadProducto);

        try {
            boolean respuestaVenta = controladorVenta.GuardarVenta(venta);
            boolean respuestaFactura = controladorFactura.GuardarHistorial(factura);
            if (respuestaVenta) {
                JOptionPane.showMessageDialog(null, "Se guardó correctamente la venta.");
                llenarTabla(); // Actualiza la tabla de facturas mostradas
            }
        } catch (IdVentaDuplicadoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ID de Venta Duplicado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int idVenta;
        int puntos;

        try {
            idVenta = Integer.parseInt(txtIDventa.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un ID de venta válido.", "ID de Venta Inválido", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            puntos = Integer.parseInt(txtPuntos.getText());
        } catch (NumberFormatException e) {
            puntos = 0; // Si no se ingresan puntos, se asume que son 0
        }

        try {
            // Calcular el precio total de la compra asociada al idVenta
            double precioTotal = controladorVenta.calcularPrecioTotalCompra(idVenta, puntos);

            // Eliminar la venta
            boolean respuestaEliminarVenta = controladorVenta.EliminarVenta(idVenta);

            if (respuestaEliminarVenta) {

                String factura = generarFactura(idVenta, precioTotal, puntos);
                JOptionPane.showMessageDialog(null, factura, "Factura", JOptionPane.INFORMATION_MESSAGE);
                llenarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la venta con el ID especificado", "Venta no Encontrada", JOptionPane.WARNING_MESSAGE);
            }
        } catch (CantidadDeProductosExcepciones ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private String generarFactura(int idVenta, double precioTotal, int puntos) {
        StringBuilder factura = new StringBuilder();
        factura.append("Factura de Venta\n");
        factura.append("=================\n");
        factura.append("ID de Venta: ").append(idVenta).append("\n");

        if (listaVenta == null) {
            listaVenta = new ArrayList<>();
        }

        for (Venta venta : listaVenta) {
            if (venta.getIdVenta() == idVenta) {
                Producto producto = venta.getProducto();
                if (producto != null) {
                    double precioUnitario = producto.getPrecioUnitario();
                    int cantidad = venta.getCantidadProducto();
                    double subtotal = precioUnitario * cantidad;
                    factura.append("Producto: ").append(producto.getNombreProducto()).append("\n");
                    factura.append("Cantidad: ").append(cantidad).append("\n");
                    factura.append("Precio Unitario: $").append(precioUnitario).append("\n");
                    factura.append("Subtotal: $").append(subtotal).append("\n");
                    factura.append("-----------------\n");
                }
            }
        }

        if (puntos >= 100) {
            int cantidadDescuentos = puntos / 100;
            double descuento = cantidadDescuentos * 0.10 * precioTotal;
            factura.append("Descuento por puntos: $").append(descuento).append("\n");
        }

        factura.append("Total a Pagar: $").append(precioTotal).append("\n");

        return factura.toString();
    }

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
            java.util.logging.Logger.getLogger(VentanaCajero_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCajero_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCajero_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCajero_D.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCajero_D().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Empleados> cbCajero;
    private javax.swing.JComboBox<Cliente> cbCliente;
    private javax.swing.JComboBox<Producto> cbProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCajero;
    private javax.swing.JTextField txtCantidadProductos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDventa;
    private javax.swing.JTextField txtPuntos;
    // End of variables declaration//GEN-END:variables
}
