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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonza
 */
public class Compras extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel();
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
        carroCompra();
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
        jcarro = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jprecio = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jcantidad = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Compras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 14, 183, -1));

        jLabel2.setText("Proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 91, -1));

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
        jPanel1.add(jProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 241, -1));

        jProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jProductoMousePressed(evt);
            }
        });
        jProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 241, -1));

        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        jMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMetodoActionPerformed(evt);
            }
        });
        jPanel1.add(jMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 150, -1));

        jLabel5.setText("Metodo de pago");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 91, -1));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 83, 20));

        jButton1.setText("Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 140, 32));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 326, 132, -1));

        jcarro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jcarro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 583, 151));

        jLabel4.setText("Fecha ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 71, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 150, -1));

        jprecio.setEditable(false);
        jprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprecioActionPerformed(evt);
            }
        });
        jPanel1.add(jprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, 30));

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
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, -1));

        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, -1));

        jButton2.setText("Añadir al carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 140, 40));

        jcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcantidadActionPerformed(evt);
            }
        });
        jcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcantidadKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcantidadKeyReleased(evt);
            }
        });
        jPanel1.add(jcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, Short.MAX_VALUE)
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
//      for (int i = 0 > jcarro.getRowCount();i++){
          
//      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductoActionPerformed
        ///aqui va algo
    }//GEN-LAST:event_jProductoActionPerformed

    private void jprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprecioActionPerformed

    private void jProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMouseClicked
      
    }//GEN-LAST:event_jProductoMouseClicked

    private void jProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMousePressed
        jProducto.removeAllItems();
        int id = Integer.parseInt(jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[0]);
        for (Map<String, Object> productos : propro.ProductoProveedor(id)) {
            jProducto.addItem(productos.get("idProducto") + " - " + productos.get("nombreProducto") + " -  " + productos.get("precioActual"));
          }    
    }//GEN-LAST:event_jProveedoresMousePressed

    private void jProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMouseExited
   // TODO add your handling code here:
    }//GEN-LAST:event_jProveedoresMouseExited

    private void jProveedoresMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProveedoresMouseMoved
  // TODO add your handling code here:
    }//GEN-LAST:event_jProveedoresMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int Cantidad = Integer.parseInt(jcantidad.getText());
         String proveedor = jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[1];
         String Producto =  jProducto.getItemAt(jProducto.getSelectedIndex()).split( " - ")[1];
         int idProducto = Integer.parseInt(jProducto.getItemAt(jProducto.getSelectedIndex()).split( " - ")[0]);
         double precio = Double.parseDouble(jprecio.getText());
         modelo.addRow(new Object[]{proveedor,idProducto, Producto, Cantidad, precio });
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductoMousePressed
       
    }//GEN-LAST:event_jProductoMousePressed

    private void jcantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcantidadKeyPressed
        
    }//GEN-LAST:event_jcantidadKeyPressed

    private void jcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcantidadKeyReleased
        int Cantidad = Integer.parseInt(jcantidad.getText());
        double precio =  Double.parseDouble(jProducto.getItemAt(jProducto.getSelectedIndex()).split( " - ")[2]);
        double result = precio * Cantidad ;
        jprecio.setText(String.valueOf(result)); 
    }//GEN-LAST:event_jcantidadKeyReleased

    private void jcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcantidadActionPerformed


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
    private javax.swing.JTextField jcantidad;
    private javax.swing.JTable jcarro;
    private javax.swing.JTextField jprecio;
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
 private void costo (){
        int Cantidad = Integer.parseInt(jcantidad.getText());
        double precio =  Double.parseDouble(jProducto.getItemAt(jProducto.getSelectedIndex()).split( " - ")[2]);
        double result = precio * Cantidad ;
        
 }
 private void carroCompra(){
     modelo.addColumn("Proveedor");
     modelo.addColumn("idProducto");
     modelo.addColumn("Producto");
     modelo.addColumn("Cantidad");
     modelo.addColumn("Precio");
     jcarro.setModel(modelo);
 }
 

}
