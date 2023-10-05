/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        this.con = Conexion.getConexion();
    }

    public void guardarProducto(Producto p) {
        String sql = "INSERT INTO producto (nombreProducto,descripcion,precioActual,stock,estado)"
                + " VALUES (?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getNomreProducto());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecioActual());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, p.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "se pudo cargar el producto");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void modificarProducto(Producto p) {
        String sql = "UPDATE producto SET nombreProducto=?, descripcion=?, precioActual=?,stock=?"
                + "WHERE idproducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNomreProducto());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecioActual());
            ps.setInt(4, p.getStock());
            ps.setInt(6, p.getIdProducto());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void eliminarProducto(int id) {
        try {
            String sql = "UPDATE producto set estado=0 where idproducto=?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }
    
    public Producto buscarProducto(int id){
        Producto p = new Producto();
        try {
            String sql = "SELECT nombreProducto,descripcion,precioActual,stock FROM producto where idproducto=? and estado=1";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                p.setIdProducto(id);
                p.setDescripcion(rs.getString("descripcion"));
                p.setNomreProducto(rs.getString("nombreProducto"));
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
                    
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return p;
    }

}
