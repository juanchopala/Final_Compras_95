package Conexion;

import Conexion.Conexion;
import Conexion.ProveedorData;
import Entidades.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CompraData {

    private Connection con = null;
    private ProveedorData pd = new ProveedorData();
    private CategoriasData cd = new CategoriasData();

    public CompraData() {
        this.con = Conexion.getConexion();
    }

    public void guardarCompra(Compra p) {

        String sql = "INSERT INTO Compra (idProveedor,fecha,idMetodoPago,precioCosto) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, p.getIdProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(p.getFecha()));
            ps.setInt(3, p.getIdMetodoPago().getIdMetodoPago());
            ps.setDouble(4, p.getPrecioCosto());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                p.setIdCompra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "compra guardada con exito");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }
    }

//    public void modigicarCompra(Compra p){
//        String sql ="UPDATE compra set idProvedor=?,fecha=?,estado=?,reporte=?  where idCompra=?";
//        
//        try {
//            PreparedStatement ps =con.prepareStatement(sql);
//            ps.setInt(1,p.getIdProveedor().getIdProveedor());
//            ps.setDate(2,Date.valueOf(p.getFecha()));
//            ps.setBoolean(3, p.isEstado());
//            ps.setString(4, p.getReporte());
//            ps.setInt(5, p.getIdCompra());
//            int exito = ps.executeUpdate();
//            
//            if(exito == 1){
//                JOptionPane.showMessageDialog(null, "compra modificada con exito");
//            }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
//        }
//    
//    }
    public void suprimirCompra(int idCompra) {
        String sql = "DELETE FROM compra where idCompra=? and estado=0";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Compra eliminada de la base de datos con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }

    }

    public Compra buscarCompra(int idCompra){
        Compra c = new Compra();
        String sql = "SELECT * FROM compra where idCompra=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCompra);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                c.setIdCompra(rs.getInt("idCompra"));
                c.setIdProveedor(pd.buscarProveedor(rs.getInt("idProveedor")));
                JOptionPane.showMessageDialog(null,"Falopa");
                c.setFecha(rs.getDate("fecha").toLocalDate());
                c.setIdMetodoPago(cd.buscarMetodo(rs.getInt("idMetodoPago")));
                JOptionPane.showMessageDialog(null,"Falopa");
                c.setPrecioCosto(rs.getDouble("precioCosto"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }
        return c;
    } 
    
    public List<Compra> listarCompras() {
        ArrayList<Compra> lista = new ArrayList<Compra>();

        String sql = "SELECT * FROM compra where estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compra c = new Compra();
                c.setIdCompra(rs.getInt("idCompra"));
                c.setIdProveedor(pd.buscarProveedor(rs.getInt("idProveedor")));
                c.setFecha(rs.getDate("fecha").toLocalDate());
                c.setIdMetodoPago(cd.buscarMetodo(rs.getInt("idMetodoPago")));
                lista.add(c);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
        }

        return lista;
    }

//        public List<Compra> listarComprasInactivas(){
//        ArrayList<Compra> lista = new ArrayList<Compra>();
//        
//        String sql = "SELECT * FROM compra where estado=1";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                Compra c = new Compra();
//                c.setIdCompra(rs.getInt("idCompra"));
//                c.setIdProveedor(pd.buscarProveedor(rs.getInt("idProvedor")));
//                c.setFecha(rs.getDate("fecha").toLocalDate());
//                c.setEstado(false);
//                c.setReporte(rs.getString("Reporte"));
//                lista.add(c);
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla compra");
//        }
//        
//        return lista;
//    }
}
