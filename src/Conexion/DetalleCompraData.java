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
import java.util.ArrayList;
import java.util.List;
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
    
    public void guardarDetalle (DetalleCompra dc){
        String sql = " INSERT INTO detallecompra(cantidad,precioCosto,idCompra,idProducto)"
                    + "VALUES (?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3,dc.getIdCompra());
            ps.setInt(4, dc.getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                dc.setIdDetalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Carga Completa");
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "error al acceder a la base detallecompra");
        }
            
        }
    
    public List<DetalleCompra> ListarDetalleCompra(int idCompra){
        String sql = " SELECT * FROM detallecompra where idCompra = ?";
        ArrayList<DetalleCompra> list = new ArrayList<DetalleCompra>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DetalleCompra d = new DetalleCompra();
                d.setIdDetalle(rs.getInt("idDetalle"));
                d.setCantidad(rs.getInt("cantidad"));
                d.setPrecioCosto(rs.getDouble("precioCosto"));
                d.setIdCompra(idCompra);
                d.setIdProducto(rs.getInt("idProducto"));
                list.add(d);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla detallecompra");
        }
        return list;
    }
}
