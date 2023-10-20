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

import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author gonza
 */
public class CategoriasData {

    private Connection con = null;
    Variables variables = new Variables();

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
}
