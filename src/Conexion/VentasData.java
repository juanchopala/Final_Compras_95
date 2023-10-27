package Conexion;

import Entidades.Compra;
import Entidades.Producto;
import Entidades.Ventas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class VentasData {

    private Connection con = null;

    public VentasData() {
        con = Conexion.getConexion();
    }

//    public void guardarVentas(Ventas ventas) { HACER HASH
//        String sql = "INSERT INTO ventas(idProducto,fecha,cantidad,PrecioTotal)"
//                + "VALUES(?,?,?,?)";
//        try {
//            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
//                ps.setObject(1, ventas.getIdProducto());
//                ps.setDate(2, Date.valueOf(ventas.getFecha()));
//                ps.setInt(3, ventas.getCantidad());
//                ps.setDouble(4, ventas.getPrecioTotal());
//                ps.executeUpdate();
//
//                ResultSet rs = ps.getGeneratedKeys();
//                if (rs.next()) {
//
//                    ventas.setIdVentas(rs.getInt(1));
//                    JOptionPane.showMessageDialog(null, "ventas realizadas");
//
//                }
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ventas");
//        }
//
//    }
         //HASH
//    public void modificarVentas(Ventas ventas) {
//
//        String sql = "UPDATE ventas SET idProducto= ?,fecha= ?, cantidad= ?, PrecioTotal= ?"
//                + "WHERE idVentas= ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setObject(1, ventas.getIdProducto());
//            ps.setDate(2, Date.valueOf(ventas.getFecha()));
//            ps.setInt(3, ventas.getCantidad());
//            ps.setDouble(4, ventas.getPrecioTotal());
//            ps.setInt(5, ventas.getIdVentas());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//
//            }
//
//        } catch (SQLException ex) {
//
//        }
//        {
//            JOptionPane.showMessageDialog(null, "ventas modificadas");
//
//        }
//    }

    public void eliminarVentas(int id) {

        String sql = "UPDATE ventas Set cantidad = 0 WHERE idVentas = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ventas eliminadas");
        }
    }
}
