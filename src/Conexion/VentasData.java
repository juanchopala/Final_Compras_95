package Conexion;

import Entidades.Compra;
import Entidades.Producto;
import Entidades.Variable2;
import Entidades.Variables;
import Entidades.Venta;

import GUI.Variables1;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class VentasData {

    private Connection con = null;

    public VentasData() {
        con = Conexion.getConexion();
    }

    public void guardarVentas(Venta ventas) { 
        String sql = "INSERT INTO ventas( idProducto, fecha, cantidad, PrecioTotal, idMetodoPago) "
                    + "VALUES (?,?,?,?,?)";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                
                ps.setInt(1, ventas.getIdProducto());
                
                ps.setDate(2, Date.valueOf(ventas.getFecha()));
                ps.setInt(3, ventas.getCantidad());
                ps.setDouble(4, ventas.getPrecioTotal());
                ps.setInt(5,ventas.getIdMetodoPago());
                ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {

                    ventas.setIdVentas(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "ventas completada");

                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ventas");
        }

    }


    public void eliminarVentas(int id) {

        String sql = "UPDATE ventas Set cantidad = 0 WHERE idVentas = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Ventas eliminadas");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla ventas");
        }
    }
    public List<Venta> ListaVenta (){
        ArrayList <Venta> lista = new ArrayList<>();
        String sql = "SELECT * FROM `ventas`";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Venta venta = new Venta();
                venta.setIdVentas(rs.getInt("idVentas"));
                venta.setIdProducto(rs.getInt("idProducto"));
                venta.setFecha(rs.getDate("fecha").toLocalDate());
                venta.setCantidad(rs.getInt("cantidad"));
                venta.setPrecioTotal(rs.getDouble("PrecioTotal"));
                venta.setIdMetodoPago(rs.getInt("idMetodoPago"));
                lista.add(venta);   
            }
           ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla ventas");
        }
        return lista;
    }
    
}
