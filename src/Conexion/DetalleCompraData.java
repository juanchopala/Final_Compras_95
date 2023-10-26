/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Entidades.Compra;
import Entidades.DetalleCompra;
import Entidades.Producto;
import Entidades.Variable2;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author Administrador
 */
public class DetalleCompraData {
    private Connection con = null;
    
    public DetalleCompraData(){
        this.con = (Connection) Conexion.getConexion();
        
    }
    
    public void guardarDetalle (DetalleCompra dC, Variable2 var,Compra com,Producto pro){
        String sql = " INSERT INTO `detallecompra`(`idDetalle`, `idMetodoPago`, `cantidad`, `precioCosto`, `idCompra`, `idProducto`, `fechaEntrega`)"
                    + "VALUES (?,?,?,?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
         
            ps.setInt(1, var.getIdMetodoPago());
            ps.setInt(2, dC.getCantidad());
            ps.setDouble(3, dC.getPrecioCosto());
            ps.setInt(4, com.getIdCompra());
            ps.setInt(5, pro.getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                dC.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Carga Completa");
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "error al acceder a la base de datos 1");
        }
            
        }
}
