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
private ProveedorData ps = new ProveedorData();
private ProductoData pd = new ProductoData();

    public Proveedor_ProductoData() {
        this.con = Conexion.getConexion();
    }
    
    public void añadirProductoaProveedor(Proveedor_Producto pp){
        String sql = "INSERT INTO PROVEEDOR_PRODUCTO (idProveedor,idProducto,costo) VALUES (?,?,?)";
        
    try {
        PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,pp.getIdProvedor().getIdProveedor());
        ps.setInt(2,pp.getIdProducto().getIdProducto());
        ps.setDouble(3, pp.getCosto());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            pp.setIdProveedorproducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido a proveedor");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedor_Producto");
    }  
    }
    
    public void borrarProductoaProveedor(int idProveedor, int idProducto){
        String sql = "DELETE FROM proveedor_producto WHERE idProveedor=? AND idProducto=?";
        
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,idProveedor);
        ps.setInt(2, idProducto);
        int exito = ps.executeUpdate();
        if(exito==1){
            JOptionPane.showMessageDialog(null, "producto borrado a proveedor");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedor_Producto");
    }
    }
    
    
    public List<Producto> ProductosdeProveedor(int idProveedor){
        ArrayList<Producto> productos = new ArrayList<Producto>();
        String sql = "SELECT * FROM proveedor_producto WHERE idProvedor=?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idProveedor);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Producto p = new Producto();
            p.setIdProducto(rs.getInt("idProducto"));
            p.setCategoriaProducto(rs.getString("categoriaProducto"));
            p.setNombreProducto(rs.getString("nombreProducto"));
            p.setImportadonacional(rs.getString(4));
            p.setDescripcion(rs.getString("descripcion"));
            p.setFechalimite(rs.getDate("fechaLimite").toLocalDate());
            p.setPrecioActual(rs.getDouble("precioActual"));
            p.setStock(rs.getInt("stock"));
            p.setEstado(rs.getBoolean("estado"));
            productos.add(p);
            //TERMINAR ESTO DESPUÉS HACER UN LISTAR ALL Y UN TODOS LOS PROVEEDORES DE UN PRODUCTO
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedor_Producto");
    }
        
        
        return productos;
    }
    
    public List<Proveedor> ProveedoresdeProducto(int idproducto){
        ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
        String sql = "SELECT * FROM proveedor_producto WHERE idProducto=?";
        
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setInt(1, idproducto);
        ResultSet rs = ps .executeQuery();
        
        while(rs.next()){
            Proveedor p = new Proveedor();
            p.setIdProveedor(rs.getInt("idProveedor"));
            p.setRazonSocial(rs.getString("razonSocial"));
            p.setDomicilio(rs.getString("domiciolio"));
            p.setTelefono(rs.getString("telefono"));
            p.setEmail(rs.getString("email"));
            p.setPagina(rs.getString("pagina"));
            proveedores.add(p);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedor_Producto");
    }
        
        
        return proveedores;
    }
    
    
    public List<Map<String,Object>> ProductosConPrecio(int idprovedor){
        ArrayList<Map<String,Object>> productosconprecio= new ArrayList<>();
        String sql = "SELECT p.*,u.costo FROM proveedor_producto u LEFT JOIN producto p on u.idProducto=p.idProducto WHERE IdProvedor=?";
    try {
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, idprovedor);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            Map<String,Object> mapita = new HashMap<>();
            mapita.put("idProducto",rs.getString("idProducto"));
            mapita.put("categoriaProducto",rs.getString("categoriaProducto"));
            mapita.put("importado/nacional", rs.getString(4));
            mapita.put("descripcion", rs.getString("descripcion"));
            mapita.put("fechaLimite", rs.getDate("fechaLimite").toLocalDate());
            mapita.put("precioActual", rs.getDouble("precioActual"));
            mapita.put("stock",rs.getInt("stock"));
            mapita.put("estado", rs.getBoolean("estado"));
            mapita.put("costo",rs.getDouble("costo"));
            productosconprecio.add(mapita);
            ps.close();
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"error al acceder a la tabla proveedor_Producto");
        //AQUI HICE ALGO QUE TENGO QUE PROBAR QUE ES EL * EN EL APODO DE producto TIENE SENTIDO PERO NO ESTA COMPROBADO CUALQUIER COSA LO HAGO BIEN SI NO ANDA
        
        //aqui elegi la opcion del map por que es similar a lo que ya trabajo gonza en inscripcion en la anterior de manera que
        //se le haga mas facil sin embargo me gustaria discutir en algun momento por que no uso la clase Pair que es una colección
        //que almacena dos elementos de cualquier tipo de modo que se almacenen 2 objetos por lista (creo que seria mas amigable con el modelo de capas
        
    }   
        return productosconprecio;   
    }
}
