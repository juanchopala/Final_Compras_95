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
import java.time.LocalDate;
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
        String sql = " INSERT INTO producto ( idCategoria , `nombreProducto`,`importadoNacional`,`descripcion`,`fechaLimite`,`precioActual`, stock , `estado`)"
                + " VALUES (?,?,?,?,?,?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getidCategoria());
            ps.setString(2, p.getNombreProducto());
            ps.setString(3, p.getImportadonacional());
            ps.setString(4, p.getDescripcion());
            ps.setDate(5, Date.valueOf(p.getFechalimite()));
            ps.setDouble(6, p.getPrecioActual());
            ps.setInt(7, p.getStock());
            ps.setBoolean(8, p.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto cargado");
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void modificarProducto(Producto p) {
        String sql = " UPDATE producto SET   idCategoria = ? , nombreProducto = ? , importadoNacional = ? , descripcion = ? , fechaLimite = ? , precioActual = ?, stock = ? , estado = ? "
                + " WHERE idProducto = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, p.getidCategoria());
            ps.setString(2, p.getNombreProducto());
            ps.setString(3, p.getImportadonacional());
            ps.setString(4, p.getDescripcion());
            ps.setDate(5, Date.valueOf(p.getFechalimite()));
            ps.setDouble(6, p.getPrecioActual());
            ps.setInt(7, p.getStock());
            ps.setBoolean(8, p.isEstado());
            ps.setInt(9, p.getIdProducto());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void eliminarProductoEstado(int id) {
        String sql = " UPDATE `producto` SET `estado`='0' WHERE idProducto = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto eliminado con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
    }

    public void eliminarProducto(int id) {
        String sql = "DELETE FROM `producto` WHERE  idProducto = ?";
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

    public List<Producto> listarProductosActivos(int idCategoria) {
        String sql = "SELECT * FROM producto WHERE estado = 1 AND idCategoria = ? ";
        ArrayList<Producto> Productos = new ArrayList<Producto>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setidCategoria(rs.getInt("idCategoria"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString("importadoNacional"));
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
                p.setidCategoria(rs.getInt("categoriaProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString("importadoNacional"));
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

    public List<Producto> listarProductos() {
        String sql = "SELECT * FROM producto ";
        ArrayList<Producto> Productos = new ArrayList<Producto>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setidCategoria(rs.getInt("idCategoria"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setImportadonacional(rs.getString("importadoNacional"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setFechalimite(rs.getDate("fechaLimite").toLocalDate());
                p.setPrecioActual(rs.getDouble("precioActual"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(true);
                p.setEstado(false);

                Productos.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return Productos;
    }

    public void modificarStockProducto(Producto producto) {
        String sql = " UPDATE producto SET   stock = ? "
                + " WHERE idProducto = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, producto.getStock());
            ps.setInt(2, producto.getIdProducto());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto modificado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto1");
        }
    }

    public List<Producto> buscarStockProducto(int idProducto) {
        String sql = "SELECT idProducto, stock FROM producto WHERE idProducto = ?";
        ArrayList<Producto> Productos = new ArrayList<Producto>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto p = new Producto();
                p.setIdProducto(idProducto);
                p.setStock(rs.getInt("stock"));
                Productos.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla producto");
        }
        return Productos;
    }
 }