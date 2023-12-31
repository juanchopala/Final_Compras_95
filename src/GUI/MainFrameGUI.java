/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Conexion.CategoriasData;
import Conexion.CompraData;
import Conexion.DetalleCompraData;
import Conexion.ProductoData;
import Conexion.ProveedorData;
import Conexion.Proveedor_ProductoData;
import Conexion.VentasData;
import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Proveedor_Producto;
import Entidades.Variables;
import Entidades.Venta;
import GUI.Compras;
import GUI.Compras;
import GUI.Productos;
import GUI.Productos;
import GUI.ProveedorProducto;
import GUI.ProveedorProducto;
import GUI.Proveedores;
import GUI.Proveedores;
import GUI.Variables1;
import GUI.Variables1;
import GUI.Ventas;
import GUI.Ventas;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class MainFrameGUI extends javax.swing.JFrame {

    VentasData venD = new VentasData();
    ButtonGroup mi = new ButtonGroup();
    ProductoData prod = new ProductoData();
    CategoriasData cate = new CategoriasData();
    ProveedorData prove = new ProveedorData();
    Proveedor_ProductoData propro = new Proveedor_ProductoData();
    CompraData cd = new CompraData();
    DetalleCompraData dcd = new DetalleCompraData();
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna > 0) {
                return false;
            } else {
                return true;
            }
        }
    };
    DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            if (columna > 0) {
                return false;
            } else {
                return true;
            }
        }
    };

    class StockComparator1 implements Comparator<Producto> {

        @Override
        public int compare(Producto p1, Producto p2) {
            return p1.getStock() - p2.getStock();
        }
    }

    class StockComparator2 implements Comparator<Producto> {

        @Override
        public int compare(Producto p1, Producto p2) {
            return p2.getStock() - p1.getStock();
        }
    }
    int StockMinimo = 10;

    public MainFrameGUI() {
        initComponents();
        listaComboCatego();
        listaComboProduc();
        listaComboProveedores();
        CargarTabla1();
        mi.add(JrMinimo);
        mi.add(JrMaximo);
        JrMinimo.setEnabled(false);
        JrMaximo.setEnabled(false);

        JrStock.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (!JrStock.isSelected()) {
                    JrMinimo.setEnabled(false);
                    JrMaximo.setEnabled(false);

                } else {
                    JrMinimo.setEnabled(true);
                    JrMaximo.setEnabled(true);
                    JCListarProductos.setEnabled(true);
                    JCListarCategorias.setEnabled(true);
                    JCListarProveedores.setEnabled(true);

                    CargarTabla2Stock();
                }

            }
        });
        JrVentas.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (JrVentas.isSelected()) {
                    JCListarProductos.setEnabled(false);
                    JCListarCategorias.setEnabled(false);
                    JCListarProveedores.setEnabled(false);
                    tablaVenta();

                }

            }
        });

        JrMinimo.setEnabled(true);
        JrMaximo.setEnabled(true);

        // this.setExtendedState(MAXIMIZED_BOTH);
        // Escritorio.isMaximumSizeSet();
        // aqui lo saque para que se inicilize en el tamaño minimo y después se pueda agrandar
        //ahora si quieres usar algun elemento de l
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        MainTableGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JrCompras = new javax.swing.JRadioButton();
        JrVentas = new javax.swing.JRadioButton();
        JrMinimo = new javax.swing.JRadioButton();
        JrMaximo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        JDfechaespecifica1 = new com.toedter.calendar.JDateChooser();
        JDfechaespecifica2 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JrStock = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        JCListarProductos = new javax.swing.JComboBox<>();
        JCListarCategorias = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        JDfechaespecifica = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JCListarProveedores = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Proveedores = new javax.swing.JMenuItem();
        Productos = new javax.swing.JMenuItem();
        ProductoProveedor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Compras = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Variables = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDoubleBuffered(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 670, 90));

        MainTableGroup.add(JrCompras);
        JrCompras.setText("Compras");
        JrCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrComprasMouseClicked(evt);
            }
        });
        JrCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrComprasActionPerformed(evt);
            }
        });
        jPanel2.add(JrCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        MainTableGroup.add(JrVentas);
        JrVentas.setText("Ventas");
        JrVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrVentasMouseClicked(evt);
            }
        });
        JrVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrVentasActionPerformed(evt);
            }
        });
        jPanel2.add(JrVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        JrMinimo.setSelected(true);
        JrMinimo.setText("De Menor a Mayor");
        JrMinimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrMinimoMouseClicked(evt);
            }
        });
        JrMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrMinimoActionPerformed(evt);
            }
        });
        jPanel2.add(JrMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        JrMaximo.setText("De mayor a Menor");
        JrMaximo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrMaximoMouseClicked(evt);
            }
        });
        jPanel2.add(JrMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        jLabel2.setText("Stock");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 89, -1));
        jPanel2.add(JDfechaespecifica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, -1));
        jPanel2.add(JDfechaespecifica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 120, -1));

        jLabel3.setText("Entre fechas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 150, 20));

        jLabel5.setText("Hasta");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 20));

        MainTableGroup.add(JrStock);
        JrStock.setSelected(true);
        JrStock.setText("Stock");
        JrStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrStockMouseClicked(evt);
            }
        });
        jPanel2.add(JrStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, -1, -1));

        jLabel1.setText("Categorias de Productos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 270, -1));

        jLabel4.setText("Fecha especifica");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jButton5.setText("Filtrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 270, 70, -1));

        JCListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCListarProductosActionPerformed(evt);
            }
        });
        jPanel2.add(JCListarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, -1));

        JCListarCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCListarCategoriasActionPerformed(evt);
            }
        });
        jPanel2.add(JCListarCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, -1));

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 100, -1));
        jPanel2.add(JDfechaespecifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 130, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 670, 350));

        jLabel6.setText("Stock bajo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 150, 20));

        jLabel7.setText("Productos y su provedores");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 270, -1));

        jLabel8.setText("Proveedores");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 270, -1));

        JCListarProveedores.setSelectedItem(null);
        JCListarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCListarProveedoresActionPerformed(evt);
            }
        });
        jPanel2.add(JCListarProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 320, -1));

        Escritorio.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        Escritorio.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Administrar");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Proveedores.setText("Proveedores");
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        jMenu1.add(Proveedores);

        Productos.setText("Productos");
        Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductosActionPerformed(evt);
            }
        });
        jMenu1.add(Productos);

        ProductoProveedor.setText("Producto-proveedor");
        ProductoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoProveedorActionPerformed(evt);
            }
        });
        jMenu1.add(ProductoProveedor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ordenes");

        Compras.setText("Compras");
        Compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasActionPerformed(evt);
            }
        });
        jMenu2.add(Compras);

        Ventas.setText("Ventas");
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        jMenu2.add(Ventas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opciones");

        Variables.setText("Variables");
        Variables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariablesActionPerformed(evt);
            }
        });
        jMenu3.add(Variables);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasActionPerformed
        Compras compras = new Compras();
        compras.setVisible(true);
        Escritorio.add(compras);
        Escritorio.moveToFront(compras);
    }//GEN-LAST:event_ComprasActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
        Ventas ventas = new Ventas();
        ventas.setVisible(true);
        Escritorio.add(ventas);
        Escritorio.moveToFront(ventas);
    }//GEN-LAST:event_VentasActionPerformed

    private void ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosActionPerformed
        Productos productos = new Productos();
        productos.setVisible(true);
        Escritorio.add(productos);
        Escritorio.moveToFront(productos);
    }//GEN-LAST:event_ProductosActionPerformed

    private void VariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariablesActionPerformed
        Variables1 variables1 = new Variables1();
        variables1.setVisible(true);
        Escritorio.add(variables1);
        Escritorio.moveToFront(variables1);
    }//GEN-LAST:event_VariablesActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed

        Proveedores proveedores = new Proveedores();
        proveedores.setVisible(true);
        Escritorio.add(proveedores);
        Escritorio.moveToFront(proveedores);
    }//GEN-LAST:event_ProveedoresActionPerformed

    private void ProductoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoProveedorActionPerformed
        ProveedorProducto prodv = new ProveedorProducto();
        prodv.setVisible(true);
        Escritorio.add(prodv);
        Escritorio.moveToFront(prodv);
    }//GEN-LAST:event_ProductoProveedorActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int j = ColumnaConDate();
        int filas = modelo.getRowCount();
        Boolean b = true;
        java.util.Date fecha;
        LocalDate fechaN;
        String Sfecha = "";
        try {
            fecha = JDfechaespecifica.getDate();
            fechaN = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Sfecha = fechaN.toString();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna Fecha O una invalida");
            b = false;
        }

        if (j == 0 && b) {
            JOptionPane.showMessageDialog(null, "Esta tabla no tiene fecha para filtrar");
            b = false;
        }
        if (filas == 0 && b) {
            JOptionPane.showMessageDialog(null, "Esta tabla esta vacia");
            b = false;
        }
        if (b) {
            if (j == 5) {
                for (int i = 0; i < filas; i++) {

                    if (!(Sfecha.equals(modelo.getValueAt(i, j).toString()))) {
                        modelo.removeRow(i);
                        i--;
                    }

                }

            } else {
                for (int i = 0; i < filas; i++) {

                    if (!(Sfecha.equals(modelo.getValueAt(i, j).toString()))) {
                        do {
                            modelo.removeRow(i);
                        } while (modelo.getValueAt(i, j) != "");
                        modelo.removeRow(i);
                        i--;
                    } else {
                        do {
                            i++;
                        } while (modelo.getValueAt(i, j) != "");
                    }

                }
            }

        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int j = ColumnaConDate();
        int filas = modelo.getRowCount();
        Boolean b = true;
        java.util.Date fecha;
        LocalDate fecha1 = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();
        try {
            fecha = JDfechaespecifica1.getDate();
            fecha1 = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fecha = JDfechaespecifica2.getDate();
            fecha2 = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No seleccionaste ninguna Fecha O una invalida");
            b = false;
        }

        if (j == 0 && b) {
            JOptionPane.showMessageDialog(null, "Esta tabla no tiene fecha para filtrar");
            b = false;
        }
        if (filas == 0 && b) {
            JOptionPane.showMessageDialog(null, "Esta tabla esta vacia");
            b = false;
        }
        if (b) {
            if (j == 5) {
                for (int i = 0; i < filas; i++) {
                    LocalDate fech = LocalDate.parse(modelo.getValueAt(i, j).toString());
                    if (!((fech.isBefore(fecha2) && fech.isAfter(fecha1)))) {
                        modelo.removeRow(i);
                        i--;
                    }

                }

            } else {
                for (int i = 0; i < filas; i++) {
                    LocalDate fech = LocalDate.parse(modelo.getValueAt(i, j).toString());
                    if (!((fech.isBefore(fecha2) && fech.isAfter(fecha1)))) {
                        do {
                            modelo.removeRow(i);
                        } while (modelo.getValueAt(i, j) != "");
                        modelo.removeRow(i);
                        i--;
                    } else {
                        do {
                            i++;
                        } while (modelo.getValueAt(i, j) != "");
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void JCListarCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCListarCategoriasActionPerformed
        if (JrStock.isSelected()) {
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("idProducto");
            modelo.addColumn("nombreProducto");
            modelo.addColumn("importadoNacional");
            modelo.addColumn("descripcion");
            modelo.addColumn("fechaLimite");
            modelo.addColumn("precioActual");
            modelo.addColumn("stock");
            jTable2.setModel(modelo);
            int id = Integer.parseInt(JCListarCategorias.getItemAt(JCListarCategorias.getSelectedIndex()).split(" - ")[0]);
            modelo.setRowCount(0);
            List<Producto> productos = new ArrayList<Producto>();
            productos = prod.listarProductosActivos(id);
            if (JrMinimo.isSelected()) {
                Collections.sort(productos, new StockComparator1());
            } else {
                Collections.sort(productos, new StockComparator2());
            }
            for (Producto p : productos) {
                Object[] fila = new Object[7];

                fila[0] = p.getIdProducto();
                fila[1] = p.getNombreProducto();
                fila[2] = p.getImportadonacional();
                fila[3] = p.getDescripcion();
                fila[4] = p.getFechalimite().toString();
                fila[5] = p.getPrecioActual();
                fila[6] = p.getStock();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_JCListarCategoriasActionPerformed

    private void JCListarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCListarProveedoresActionPerformed
        if (JrStock.isSelected()) {
            int id = Integer.parseInt(JCListarProveedores.getItemAt(JCListarProveedores.getSelectedIndex()).split(" - ")[0]);
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("idProducto");
            modelo.addColumn("nombreProducto");
            modelo.addColumn("precioActual");
            for (Map<String, Object> p : propro.ProductoProveedor(id)) {
                Object[] fila = new Object[3];
                fila[0] = p.get("idProducto");
                fila[1] = p.get("nombreProducto");
                fila[2] = p.get("precioActual");
                modelo.addRow(fila);
//                mapita.put("idProducto", rs.getString("idProducto"));
//                mapita.put("nombreProducto", rs.getString("nombreProducto"));
//                mapita.put("razonSocial", rs.getString("razonSocial"));
//                mapita.put("precioActual", rs.getDouble("precioActual"));
            }
        }
    }//GEN-LAST:event_JCListarProveedoresActionPerformed

    private void JrStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrStockMouseClicked
        CargarTabla1();
        CargarTabla2Stock();

        for (Variables c : cate.listarCategoria()) {
            int id = c.getIdCategoria();
            String name = c.getnombreCategoria();
            List<Producto> productos = new ArrayList<Producto>();
            productos = prod.listarProductosActivos(id);
            if (JrMinimo.isSelected()) {
                Collections.sort(productos, new StockComparator1());
            } else {
                Collections.sort(productos, new StockComparator2());
            }
            for (Producto p : productos) {
                Object[] fila = new Object[8];
                fila[0] = p.getIdProducto();
                fila[1] = name;
                fila[2] = p.getNombreProducto();
                fila[3] = p.getImportadonacional();
                fila[4] = p.getDescripcion();
                fila[5] = p.getFechalimite();
                fila[6] = p.getPrecioActual();
                fila[7] = p.getStock();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_JrStockMouseClicked

    private void JCListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCListarProductosActionPerformed
        if (JrStock.isSelected()) {
            int id = Integer.parseInt(JCListarProductos.getItemAt(JCListarProductos.getSelectedIndex()).split(" - ")[0]);
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            modelo.addColumn("idProveedor");
            modelo.addColumn("NombreProve");
            modelo.addColumn("domicilio");
            modelo.addColumn("telefono");
            modelo.addColumn("email");
            modelo.addColumn("pagina");
            jTable2.setModel(modelo);
            for (Proveedor prove : propro.ProveedoresdeProducto(id)) {
                Object[] fila = new Object[6];
                fila[0] = prove.getIdProveedor();
                fila[1] = prove.getRazonSocial();
                fila[2] = prove.getDomicilio();
                fila[3] = prove.getTelefono();
                fila[4] = prove.getEmail();
                fila[5] = prove.getPagina();
                modelo.addRow(fila);
            }

        }

    }//GEN-LAST:event_JCListarProductosActionPerformed

    private void JrMinimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrMinimoMouseClicked
        JrStock.doClick();
    }//GEN-LAST:event_JrMinimoMouseClicked

    private void JrMaximoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrMaximoMouseClicked
        JrStock.doClick();
    }//GEN-LAST:event_JrMaximoMouseClicked

    private void JrVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrVentasMouseClicked
        if (JrVentas.isSelected()) {
            modelo.setRowCount(0);
            modelo.setColumnCount(0);
            tablaVenta();
        }
    }//GEN-LAST:event_JrVentasMouseClicked

    private void JrComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrComprasMouseClicked
        CargarTabla2Compras();
    }//GEN-LAST:event_JrComprasMouseClicked

    private void JrVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrVentasActionPerformed
        tablaVenta();
    }//GEN-LAST:event_JrVentasActionPerformed

    private void JrComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrComprasActionPerformed

    private void JrMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JrMinimoActionPerformed
    private void listaComboCatego() {
        for (Variables prod : cate.listarCategoria()) {
            JCListarCategorias.addItem(prod.getIdCategoria() + " - " + prod.getnombreCategoria());
        }
    }

    private void listaComboProduc() {
        for (Variables c : cate.listarCategoria()) {
            int id = c.getIdCategoria();
            for (Producto p : prod.listarProductosActivos(id)) {
                JCListarProductos.addItem(p.getIdProducto() + " - " + p.getNombreProducto() + " - " + p.getPrecioActual());
            }
        }
    }

    private void listaComboProveedores() {
        for (Proveedor p : prove.listarProveedores()) {
            JCListarProveedores.addItem(p.getIdProveedor() + " - " + p.getRazonSocial());
        }
    }

    private void tablaVenta() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("idVnetas");
        modelo.addColumn("idProducto");
        modelo.addColumn("fecha");
        modelo.addColumn("cantidad");
        modelo.addColumn("PrecioTotal");
        modelo.addColumn("idMetodoPago");
        jTable2.setModel(modelo);
        for (Venta venta : venD.ListaVenta()) {
            modelo.addRow(new Object[]{venta.getIdVentas(), venta.getIdProducto(), venta.getFecha(), venta.getCantidad(), venta.getPrecioTotal(), venta.getIdMetodoPago()});
        }
    }

    private void CargarTabla2Stock() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("idProducto");
        modelo.addColumn("Categoria");
        modelo.addColumn("nombreProducto");
        modelo.addColumn("importadoNacional");
        modelo.addColumn("descripcion");
        modelo.addColumn("fechaLimite");
        modelo.addColumn("precioActual");
        modelo.addColumn("stock");
        jTable2.setModel(modelo);

    }

    private void CargarTabla2Compras() {
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        modelo.addColumn("idCompra");
        modelo.addColumn("Proveedor");
        modelo.addColumn("fecha");
        modelo.addColumn("idMetodoPago");
        modelo.addColumn("PrecioTotal");
        jTable2.setModel(modelo);
        for (Compra c : cd.listarCompras()) {
            Object[] o = new Object[5];
            o[0] = c.getIdCompra();
            o[1] = c.getIdProveedor().getRazonSocial();
            o[2] = c.getFecha();
            o[3] = c.getIdMetodoPago().getNombreMetodo();
            o[4] = c.getPrecioCosto();

            modelo.addRow(o);

            for (DetalleCompra dc : dcd.ListarDetalleCompra(c.getIdCompra())) {
                o[0] = dc.getIdDetalle();
                o[1] = dc.getIdProducto().getNombreProducto();
                o[2] = dc.getCantidad();
                o[3] = "";
                o[4] = dc.getPrecioCosto();
                modelo.addRow(o);
            }
            modelo.addRow(new Object[]{"", "", "", "", ""});
        }
    }

    private void CargarTabla1() {
        modelo2.setRowCount(0);
        modelo2.setColumnCount(0);
        modelo2.addColumn("idProducto");
        modelo2.addColumn("Categoria");
        modelo2.addColumn("nombreProducto");
        modelo2.addColumn("importadoNacional");
        modelo2.addColumn("descripcion");
        modelo2.addColumn("fechaLiimte");
        modelo2.addColumn("precioActual");
        modelo2.addColumn("stock");

        CargarTabla2Stock();

        for (Variables c : cate.listarCategoria()) {
            int id = c.getIdCategoria();
            String name = c.getnombreCategoria();
            List<Producto> productos = new ArrayList<Producto>();
            productos = prod.listarProductosActivos(id);

            Collections.sort(productos, new StockComparator1());
            for (Producto p : productos) {
                if (p.getStock() < StockMinimo) {
                    Object[] fila = new Object[8];
                    fila[0] = p.getIdProducto();
                    fila[1] = name;
                    fila[2] = p.getNombreProducto();
                    fila[3] = p.getImportadonacional();
                    fila[4] = p.getDescripcion();
                    fila[5] = p.getFechalimite();
                    fila[6] = p.getPrecioActual();
                    fila[7] = p.getStock();
                    modelo2.addRow(fila);
                }

            }
        }
        jTable1.setModel(modelo2);
    }

    private void cargarFilaDetalle() {
        Object[] o = new Object[5];
        o[0] = "idDetalle";
        o[1] = "Producto";
        o[2] = "Cantidad";
        o[3] = "Precio";
        modelo.addRow(o);
    }

    private int ColumnaConDate() {
        int c = 0;
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            String ColumnName = modelo.getColumnName(i);
            if (ColumnName.equals("fechaLimite") || ColumnName.equals("fecha")) {
                c = i;
            }
        }
        return c;
    }

    // rellenar tabla segun categoria en producto carga segun categoria 
    // fecha especifica tiene que mapear los datos en la jtable segun esa fecha 
    // entre los 2 day choser 
    //ordenar 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Compras;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JComboBox<String> JCListarCategorias;
    private javax.swing.JComboBox<String> JCListarProductos;
    private javax.swing.JComboBox<String> JCListarProveedores;
    private com.toedter.calendar.JDateChooser JDfechaespecifica;
    private com.toedter.calendar.JDateChooser JDfechaespecifica1;
    private com.toedter.calendar.JDateChooser JDfechaespecifica2;
    private javax.swing.JRadioButton JrCompras;
    private javax.swing.JRadioButton JrMaximo;
    private javax.swing.JRadioButton JrMinimo;
    private javax.swing.JRadioButton JrStock;
    private javax.swing.JRadioButton JrVentas;
    private javax.swing.ButtonGroup MainTableGroup;
    private javax.swing.JMenuItem ProductoProveedor;
    private javax.swing.JMenuItem Productos;
    private javax.swing.JMenuItem Proveedores;
    private javax.swing.JMenuItem Variables;
    private javax.swing.JMenuItem Ventas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
