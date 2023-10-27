package Conexion;

import Entidades.Producto;
import Entidades.Proveedor;
import Entidades.Proveedor_Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Proveedor_ProductoData {

    private Connection con;
    private ProveedorData prove = new ProveedorData();
    private ProductoData pd = new ProductoData();

    public Proveedor_ProductoData() {
        this.con = Conexion.getConexion();
    }

    public void añadirProductoaProveedor(Proveedor_Producto pp) {
        String sql = "INSERT INTO proveedor_producto (idProveedor,idProducto,costo) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pp.getIdProveedor());
            ps.setInt(2, pp.getIdProducto());
            ps.setDouble(3, pp.getCosto());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pp.setIdProveedorproducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido a proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla proveedor_Producto");
        }
    }

    public void borrarProductoaProveedor(int idProveedorproducto) {
        String sql = "DELETE FROM proveedor_producto WHERE idProveedorproducto = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedorproducto);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "producto borrado a proveedor");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla proveedor_Producto");
        }
    }


    public List<Proveedor> ProveedoresdeProducto(int idproducto) {
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        String sql = "SELECT * FROM proveedor_producto WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idproducto);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Proveedor p = prove.buscarProveedor(rs.getInt("idProveedor"));
                proveedores.add(p);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla proveedor_Producto");
        }

        return proveedores;
    }

    public List<Map<String, Object>> ProductosConPrecio() {
        ArrayList<Map<String, Object>> productosconprecio = new ArrayList<>();
        String sql = "SELECT u.idProveedorproducto, u.idProveedor, u.idProducto, p.nombreProducto,pro.razonSocial "
                + "FROM proveedor_producto u "
                + "JOIN producto p ON u.idProducto= p.idProducto "
                + "JOIN proveedor pro ON u.idProveedor = pro.IdProveedor ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, Object> mapita = new HashMap<>();
                mapita.put("idProveedorproducto", rs.getInt("idProveedorproducto"));
                mapita.put("idProducto", rs.getString("idProducto"));
                mapita.put("nombreProducto", rs.getString("nombreProducto"));
                mapita.put("idProveedor", rs.getInt("idProveedor"));
                mapita.put("razonSocial", rs.getString("razonSocial"));

                productosconprecio.add(mapita);
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla proveedor_Producto");

        }
        return productosconprecio;
    }

    public List<Map<String, Object>> ProductoProveedor(int idProveedor) {
        ArrayList<Map<String, Object>> productos = new ArrayList<>();
        String sql = "SELECT u.idProveedorproducto,u.idProveedor, u.idProducto,p.precioActual, p.nombreProducto,pro.razonSocial "
                + "FROM proveedor_producto u "
                + "JOIN producto p ON u.idProducto= p.idProducto "
                + "JOIN proveedor pro ON u.idProveedor = pro.IdProveedor "
                + "WHERE u.idProveedor = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProveedor);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Map<String, Object> mapita = new HashMap<>();
                mapita.put("idProveedorproducto", rs.getInt("idProveedorproducto"));
                mapita.put("idProducto", rs.getString("idProducto"));
                mapita.put("nombreProducto", rs.getString("nombreProducto"));
                mapita.put("idProveedor", rs.getInt("idProveedor"));
                mapita.put("razonSocial", rs.getString("razonSocial"));
                mapita.put("precioActual", rs.getDouble("precioActual"));

                productos.add(mapita);
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la base de datos");

        }
        return productos;
    }
}
