/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Entidades.Variables;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Entidades.Variable2;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author gonza
 */
public class CategoriasData {

    private Connection con = null;
    Variables variables = new Variables();
    Variable2 variables2 = new Variable2();

    public CategoriasData() {
        this.con = (Connection) Conexion.getConexion();

    }

    public void guardarCategoria(Variables C) {
        String sql = "INSERT INTO categoria( nombreCategoria )"
                + " VALUES (?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, C.getnombreCategoria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                C.setIdCategoria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Carga Completada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
    }

    public void modificarCategoria(Variables C) {
        String sql = "UPDATE `categoria` SET `nombreCategoria`= ? " + " WHERE idCategoria = ? ";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, C.getnombreCategoria());
            ps.setInt(2,C.getIdCategoria());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Carga Completada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos ");
        }
    }
        
    public void borrarCategoria(int idCategoria) {
        String sql = " DELETE FROM `categoria`" + " WHERE idCategoria = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCategoria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
    }
    public List<Variables> listarCategoria() {
        ArrayList<Variables> variables = new ArrayList<>();
        String sql = "Select idCategoria, nombreCategoria From categoria";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Variables variable = new Variables();
                variable.setIdCategoria(rs.getInt("idCategoria"));
                variable.setnombreCategoria(rs.getString("nombreCategoria"));
                variables.add(variable);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
        return variables;
    }
    
    public void guardarMetodos(Variable2 C) {
        String sql = "INSERT INTO metodopago(NombreMetodo)" +  " VALUES (?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,C.getNombreMetodo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                C.setIdMetodoPago(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Carga Completada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
    }
    public void borrarMetodoPago(int idMetodoPago) {
        String sql = "DELETE FROM metodopago " + " WHERE  idMetodoPago = ? " ;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMetodoPago);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
        }
     public void modificarMetodo(Variable2 C) {
        String sql = "UPDATE metodopago SET NombreMetodo = ? " +  " WHERE idMetodoPago = ? ";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, C.getNombreMetodo());
            ps.setInt(2,C.getIdMetodoPago());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Carga Completada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos ");
        }
    }
  public List<Variable2> listarMetodos() {
        ArrayList<Variable2> variable2 = new ArrayList<>();
        String sql = "Select idMetodoPago, NombreMetodo From metodopago";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Variable2 variable = new Variable2();
                variable.setIdMetodoPago(rs.getInt("idMetodoPago"));
                variable.setNombreMetodo(rs.getString("NombreMetodo"));
                variable2.add(variable);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
        return variable2;
      }

}
