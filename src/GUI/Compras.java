/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Conexion.CategoriasData;
import Conexion.CompraData;
import Conexion.DetalleCompraData;
import Conexion.ProductoData;
import Conexion.ProveedorData;
import Conexion.Proveedor_ProductoData;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Variable2;
import GUI.Productos;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gonza
 */
public class Compras extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private ProveedorData provD = new ProveedorData();
    private Proveedor_ProductoData propro = new Proveedor_ProductoData();
    private ProductoData prov = new ProductoData();
    private Productos producto = new Productos();
    private CategoriasData categoriasData = new CategoriasData();
    private CompraData cp = new CompraData();
    private DetalleCompraData dcp = new DetalleCompraData();
    List<DetalleCompra> carrito = new ArrayList<>();

    //esto lo cambie a un treeSet
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
        jMetodoPago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BtnComprar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jcarro = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jprecioTotal = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BtnAñadirCarrito = new javax.swing.JButton();
        jcantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jprecio = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Compras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 14, 183, -1));

        jLabel2.setText("Proveedor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 91, -1));

        jProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(jProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 241, -1));

        jProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProductoActionPerformed(evt);
            }
        });
        jPanel1.add(jProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 241, -1));

        jLabel3.setText("Producto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        jMetodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMetodoPagoActionPerformed(evt);
            }
        });
        jPanel1.add(jMetodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 150, -1));

        jLabel5.setText("Metodo de pago");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 91, -1));

        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 83, 20));

        BtnComprar.setText("Comprar");
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 130, -1));
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
        jcarro.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jcarro);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 583, 151));

        jLabel4.setText("Fecha ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 71, -1));
        jPanel1.add(jDfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 150, -1));

        jprecioTotal.setEditable(false);
        jPanel1.add(jprecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 90, 30));

        BtnEliminar.setText("eliminar seleccionado");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 130, -1));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, -1));

        jLabel9.setText("Cantidad");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, -1));

        BtnAñadirCarrito.setText("Añadir al carrito");
        BtnAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAñadirCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAñadirCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 140, 40));

        jcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcantidadKeyTyped(evt);
            }
        });
        jPanel1.add(jcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 90, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Solo una compra  por proveedor");
        jLabel10.setToolTipText("");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 210, 30));

        jprecio.setEditable(false);
        jPanel1.add(jprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMetodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMetodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMetodoPagoActionPerformed

    private void jProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProveedoresActionPerformed
        jProducto.removeAllItems();
        int id = Integer.parseInt(jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[0]);
        for (Map<String, Object> productos : propro.ProductoProveedor(id)) {
            jProducto.addItem(productos.get("idProducto") + " - " + productos.get("nombreProducto") + " -  " + productos.get("precioActual"));
        }
        carrito.clear();
        carroCompra();
        actualizarPrecioTotal();
    }//GEN-LAST:event_jProveedoresActionPerformed

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed

        if (jcarro.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No HayProductos en el carro");
        }

        if (jDfecha.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Tienes que especificar la fecha de la compra");
        }
        Compra p = new Compra();
        try {
            int IdProveedor = Integer.parseInt(jProveedores.getItemAt(jProveedores.getSelectedIndex()).split(" - ")[0]);
            int IdMetodoPago = Integer.parseInt(jMetodoPago.getItemAt(jMetodoPago.getSelectedIndex()).split(" - ")[0]);
            java.util.Date fecha = jDfecha.getDate();
            LocalDate fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Double PrecioCosto = Double.parseDouble(jprecioTotal.getText());
            p.setIdProveedor(provD.buscarProveedor(IdProveedor));
            p.setFecha(fechaN);
            p.setIdMetodoPago(categoriasData.buscarMetodo(IdMetodoPago));
            p.setPrecioCosto(PrecioCosto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error en ejecutar la compra");
        }
           
        
        cp.guardarCompra(p);
        int id = p.getIdCompra();
        for (DetalleCompra dp : carrito) {
            dp.setIdCompra(cp.buscarCompra(id));
            dcp.guardarDetalle(dp);
        }
        carrito.clear();
        modelo.setRowCount(0);
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        int fila = jcarro.getSelectedRow();
        modelo.removeRow(fila);
        carrito.remove(fila);
        actualizarPrecioTotal();
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void jProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProductoActionPerformed
        ///aqui va algo
    }//GEN-LAST:event_jProductoActionPerformed

    private void BtnAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirCarritoActionPerformed
        int cantidad = Integer.parseInt(jcantidad.getText());
        if (!(cantidad == 0)){
            int idProducto = Integer.parseInt(jProducto.getItemAt(jProducto.getSelectedIndex()).split(" - ")[0]);
            Producto p = new Producto();
            p = prov.buscarProducto(idProducto);
            String nombre = jProducto.getItemAt(jProducto.getSelectedIndex()).split(" - ")[1];
            double precioCosto = Double.parseDouble(jprecio.getText());
            DetalleCompra d = new DetalleCompra(cantidad, precioCosto, p);
            boolean nuevo = true;
            for (DetalleCompra dp : carrito) {
                if (p.equals(dp.getIdProducto())) {
                    dp.setCantidad(cantidad);
                    dp.setPrecioCosto(precioCosto);
                    nuevo = false;
                }
            }
            if (nuevo) {
                carrito.add(d);
            }
            actualizarPrecioTotal();
            carroCompra();
        }else{
            JOptionPane.showMessageDialog(null, "no puedes hacer una compra de 0 productos");
        }

    }//GEN-LAST:event_BtnAñadirCarritoActionPerformed

    private void jcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcantidadKeyReleased
        int Cantidad = Integer.parseInt(jcantidad.getText());
        double precio = Double.parseDouble(jProducto.getItemAt(jProducto.getSelectedIndex()).split(" - ")[2]);
        double result = precio * Cantidad;
        jprecio.setText(String.valueOf(result));
    }//GEN-LAST:event_jcantidadKeyReleased

    private void jcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcantidadKeyTyped
        int Key = evt.getKeyChar();
        boolean numero = Key >= 48 && Key <= 57;
        if (!numero) {
            evt.consume();
        }
        if (jcantidad.getText().trim().length() == 11) {
            evt.consume();
        }

        if (jcantidad.getText().equals("-")) {
            evt.consume();
        }
    }//GEN-LAST:event_jcantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAñadirCarrito;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnEliminar;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jMetodoPago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jProducto;
    private javax.swing.JComboBox<String> jProveedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcantidad;
    private javax.swing.JTable jcarro;
    private javax.swing.JTextField jprecio;
    private javax.swing.JTextField jprecioTotal;
    // End of variables declaration//GEN-END:variables
    private void listaProveedor() {

        for (Proveedor prove : provD.listarProveedores()) {
            jProveedores.addItem(prove.getIdProveedor() + " - " + prove.getRazonSocial());
        }
    }

    private void cargarMetodos() {
        for (Variable2 var : categoriasData.listarMetodos()) {
            jMetodoPago.addItem(var.getIdMetodoPago() + " - " + var.getNombreMetodo());
        }
    }

    private void costo() {
        int Cantidad = Integer.parseInt(jcantidad.getText());
        double precio = Double.parseDouble(jProducto.getItemAt(jProducto.getSelectedIndex()).split(" - ")[2]);
        double result = precio * Cantidad;

    }

    private void carroCompra() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("idProducto");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("PrecioTotal");
        jcarro.setModel(modelo);
        for (DetalleCompra dp : carrito) {
            int id = dp.getIdProducto().getIdProducto();
            String nom = dp.getIdProducto().getNombreProducto();
            int cantidad = dp.getCantidad();
            double precioCosto = dp.getPrecioCosto();
            modelo.addRow(new Object[]{id, nom, cantidad, precioCosto});

        }
    }

    private void actualizarPrecioTotal() {
        double total = 0;
        for (DetalleCompra c : carrito) {
            total = total + c.getPrecioCosto();
        }
        jprecioTotal.setText(String.valueOf(total));
    }

}
