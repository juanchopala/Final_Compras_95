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
        Connection con = Conexion.getConexion();
        Producto p = new Producto(25,"OlspiceLeña","desodoranteCorporal",250.0,100,true);
        ProductoData pd = new ProductoData();
        pd.modificarProducto(p);
        
    }
   
}
