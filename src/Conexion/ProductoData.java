/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Entidades.Producto;
import Entidades.Variables;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String sql = "INSERT INTO producto (`nombreProducto`,`importado/nacional`,`descripcion`,`fechaLimite`,`precioActual`,`estado`)"
                + " VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
 
            ps.setString(2, p.getNombreProducto());
            ps.setString(3, p.getImportadonacional());
            ps.setString(4, p.getDescripcion());
            ps.setDate(5, Date.valueOf(p.getFechalimite()));
            ps.setDouble(6, p.getPrecioActual());
            ps.setBoolean(7, p.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProducto(rs.getInt(1));
                p.setStock(0);
                JOptionPane.showMessageDialog(null, "se pudo cargar el producto");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void modificarProducto(Producto p) {
        String sql = "UPDATE producto SET , nombreProducto=?, `importado/nacional`=?, descripcion=?,fechaLimite=?, precioActual=?"
                + "WHERE idproducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(0, p.getIdProducto());
            ps.setString(1, p.getNombreProducto());
            ps.setString(2, p.getImportadonacional());
            ps.setString(3, p.getDescripcion());
            ps.setDate(4, Date.valueOf(p.getFechalimite()));
            ps.setDouble(5, p.getPrecioActual());   
           

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void eliminarProducto(int id) {
        String sql = "UPDATE producto set estado=0 where idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void suprimirProducto(int id) {
        String sql = "DELETE * from producto where idProducto=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto suprimido con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public Producto buscarProducto(int id) {
        Producto p = new Producto();
       //categoriaProducto,nombreProducto,`importado/nacional`,descripcion,fechaLimite,precioActual,stock
        String sql = "SELECT * FROM producto where idproducto=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p.setIdProducto(id);
                p.setCategoriaProducto(rs.getString("categoriaProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString(4));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechalimite(rs.getDate("fechaLimite").toLocalDate());
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return p;
    }

    public List<Producto> listarProductosActivos() {
        String sql = "SELECT * FROM producto where estado=1";
        ArrayList<Producto> Productos = new ArrayList<Producto>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setCategoriaProducto(rs.getString("categoriaProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString(4));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechalimite(rs.getDate("fechaLimite").toLocalDate());
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
                Productos.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return Productos;
    }

    public List<Producto> listarProductosInactivos() {
        String sql = "SELECT * FROM producto where estado=0";
        ArrayList<Producto> Productos = new ArrayList<Producto>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setCategoriaProducto(rs.getString("categoriaProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString(4));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechalimite(rs.getDate("fechaLimite").toLocalDate());
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(false);
                Productos.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return Productos;
    }


    
}
    

