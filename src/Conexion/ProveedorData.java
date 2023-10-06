package Conexion;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {
        this.con = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor p) {

        String sql = "INSERT INTO provedor (razonSocial,domicilio,telefono) VALUES (?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(0, p.getRazonSocial());
            ps.setString(1, p.getDomicilio());
            ps.setString(2, p.getTelefono());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProveedor(rs.getInt(0));
                JOptionPane.showMessageDialog(null, "proveedor guardado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }

    }

    public void modigicarProveedor(Proveedor p) {

        String sql = "UPDATE proveedor set razonSocial=?,domicilio=?,telefono=? WHERE idproveedor=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(0,p.getRazonSocial());
            ps.setString(1,p.getDomicilio());
            ps.setString(2, p.getTelefono());
            ps.setInt(4, p.getIdProveedor());
            int exito=ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "proveedor eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }

    }

    public void eliminarProveedor(int i) {
        String sql = "DELETE FROM proveedor where idproveedor=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(0, i);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "proveedor eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }
    }
    
    public void buscarProveedor(int i){
        String sql = "SELECT FROM proveedor where idproveedor=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(0, i);
            ResultSet rs = ps.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Proveedor encontrado");
           }else{
           JOptionPane.showMessageDialog(null, "Este proveedor no esta en la base de datos");
           }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }
        
    }

}
