/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Logica;

import Conexion.CategoriasData;
import Conexion.Conexion;
import Conexion.ProductoData;
import Entidades.Producto;
import Entidades.Variables;
import java.sql.Connection;
import java.time.LocalDate;
import javax.swing.SpringLayout;
import Conexion.CategoriasData;
import GUI.MainFrameGUI;
import java.io.File;
/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        
          MainFrameGUI mf = new MainFrameGUI();
          mf.setVisible(true);
          mf.setLocationRelativeTo(null);
          ProductoData prod = new ProductoData();
//        CategoriasData cat = new CategoriasData();
//        Producto p = new Producto("Desodorante", "Rexona Odorono", "IndustriaArgentina", "no te abandona", LocalDate.of(2023, 10, 7), 200.0, true);
//        ProductoData pd = new ProductoData();
//        pd.guardarProducto(p);
//        Producto p1 = new Producto(p.getIdProducto(), "Desodorante", "Rexona Odorono", "IndustriaArgentina", "Este si te abandona es una poronga", LocalDate.of(2023, 10, 7), 200.0, true);
//        pd.modificarProducto(p1);
//        System.out.println(p.toString());
//        System.out.println((pd.buscarProducto(p.getIdProducto()).toString()));
//        System.out.println(pd.buscarProducto(1).toString());
//        System.out.println(pd.buscarProducto(1).getImportadonacional());

//        for (Variables var : cat.listarCategoria()) {
//            System.out.println(var.getnombreCategoria());
//            System.out.println(var.getIdCategoria());
//        }
//      }
//        for (Producto pro : prod.buscarStockProducto(15)) {
//           int cantidad = 16;
//            int stock = pro.getStock();
//            int Resultado =  cantidad - stock;
//            Producto pp = new Producto(15,22);
//              prod.modificarStockProducto(pp);
//        }
 }
  
}
