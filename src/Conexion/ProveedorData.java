package Conexion;

import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProveedorData {

    private Connection con = null;

    public ProveedorData() {
        this.con = Conexion.getConexion();
    }

    public void guardarProveedor(Proveedor p) {

        String sql = "INSERT INTO `proveedor`(`razonSocial`, `domicilio`, `telefono`, `email`, `pagina`) "
                + "VALUES (?,?,?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, p.getRazonSocial());
            ps.setString(2, p.getDomicilio());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getPagina());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdProveedor(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "proveedor guardado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }

    }

    public void modificarProveedor(Proveedor p) {

        String sql = "UPDATE proveedor set razonSocial=?,domicilio=?,telefono=?,email=?,pagina=? WHERE idproveedor=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getRazonSocial());
            ps.setString(2, p.getDomicilio());
            ps.setInt(3, p.getTelefono());
            ps.setString(4, p.getEmail());
            ps.setString(5, p.getPagina());
            ps.setInt(6, p.getIdProveedor());
            int exito = ps.executeUpdate();
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
            ps.setInt(1, i);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "proveedor eliminado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }
    }

    public List <Proveedor>  buscarProveedor(int id) {
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        String sql = "SELECT idProveedor, razonSocial, domicilio, telefono, email, pagina FROM proveedor WHERE idProveedor = ? ";
        
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Proveedor p = new Proveedor();
                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setRazonSocial(rs.getString("razonSocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getInt("telefono"));
                p.setEmail(rs.getString("email"));
                p.setPagina(rs.getString("pagina"));
                proveedores.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }
        return proveedores;
    }

    public List<Proveedor> listarProveedores() {
       
        String sql= "SELECT * FROM proveedor";
         ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Proveedor p = new Proveedor();
                p.setIdProveedor(rs.getInt("idProveedor"));
                p.setRazonSocial(rs.getString("razonsocial"));
                p.setDomicilio(rs.getString("domicilio"));
                p.setTelefono(rs.getInt("telefono"));
                p.setEmail(rs.getString("email"));
                p.setPagina(rs.getString("pagina"));
                proveedores.add(p);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al aceder a la tabla proveedor");
        }
        
        
        return proveedores;
    }

}
