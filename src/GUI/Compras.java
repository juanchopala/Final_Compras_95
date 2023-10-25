/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Conexion.CategoriasData;
import Conexion.ProveedorData;
import Conexion.Proveedor_ProductoData;
import Entidades.Proveedor;
import Entidades.Variable2;
import java.util.Map;

/**
 *
 * @author gonza
 */
public class Compras extends javax.swing.JInternalFrame {

    private ProveedorData provD = new ProveedorData();
    private Proveedor_ProductoData propro = new Proveedor_ProductoData();
    private Productos producto = new Productos();
    private CategoriasData categoriasData = new CategoriasData();
    /**
     * Creates new form Compras
     */
    public Compras() {
        initComponents();
        listaProveedor();
        cargarMetodos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProveedores = new javax.swing.JComboBox<>();
        jProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jMetodo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jcantidad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Compras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 14, 183, -1));

        jLabel2.setText("Proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 91, -1));

        jProveedores.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jProveedoresMouseMoved(evt);
            }
        });
        jProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jProveedoresMousePressed(evt);
            }
        });
        jProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(jProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 83, 241, -1));

        jProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductoMouseClicked(evt);
            }
        });
        jProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 117, 241, -1));

        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, -1));

        jMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMetodoActionPerformed(evt);
            }
        });
        jPanel1.add(jMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 157, 241, -1));

        jLabel5.setText("Metodo de pago");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 91, -1));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 83, 20));

        jButton1.setText("Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 140, 32));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 326, 132, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 583, 151));

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jLabel4.setText("Fecha ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 71, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 90, -1));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 580, -1, -1));

        jButton4.setText("eliminar seleccionado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        jcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 90, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, -1));

        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMetodoActionPerformed

    private void jProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProveedoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductoActionPerformed
        ///aqui va algo
    }//GEN-LAST:event_jProductoActionPerformed

    private void jcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcantidadActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMouseClicked
        int id = Integer.parseInt(jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[0]);
        for (Map<String, Object> productos : propro.ProductoProveedor(id)) {
            jProducto.addItem(productos.get("idProducto") + " - " + productos.get("nombreProducto"));
            
          }       
    }//GEN-LAST:event_jProductoMouseClicked

    private void jProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMousePressed
        jProducto.removeAllItems();
        int id = Integer.parseInt(jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[0]);
        for (Map<String, Object> productos : propro.ProductoProveedor(id)) {
            jProducto.addItem(productos.get("idProducto") + " - " + productos.get("nombreProducto"));
          }    
    }//GEN-LAST:event_jProveedoresMousePressed

    private void jProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMouseExited
   // TODO add your handling code here:
    }//GEN-LAST:event_jProveedoresMouseExited

    private void jProveedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMouseMoved
  // TODO add your handling code here:
    }//GEN-LAST:event_jProveedoresMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMetodo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jProducto;
    private javax.swing.JComboBox<String> jProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jcantidad;
    // End of variables declaration//GEN-END:variables
    private void listaProveedor() {

        for (Proveedor prove : provD.listarProveedores()) {
            jProveedores.addItem(prove.getIdProveedor() + " - " + prove.getRazonSocial());
        }
    }
 private void cargarMetodos(){
        for (Variable2 var : categoriasData.listarMetodos()){
            jMetodo.addItem(var.getIdMetodoPago() + " - " + var.getNombreMetodo());
        }
     }
}
