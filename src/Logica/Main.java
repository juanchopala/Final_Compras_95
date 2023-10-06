/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

import Conexion.Conexion;
import Conexion.ProductoData;
import Entidades.Producto;
import java.sql.Connection;

/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) {
        Producto p = new Producto("Rexona","no te abandona",200.0,30,true);
        ProductoData pd = new ProductoData();
        pd.guardarProducto(p);
        Producto p1 = new Producto (p.getIdProducto(),"Rexona","si te abandona",200.0,10,true);
        pd.modificarProducto(p);
        System.out.println(pd.buscarProducto(p.getIdProducto()).toString());
                
        
    }
   
}
