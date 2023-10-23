package Entidades;



public class Proveedor_Producto {
    private int idProveedorproducto;
    private int idProveedor;
    private int idProducto;
    private double costo;
   

    public Proveedor_Producto() {
    }

    public Proveedor_Producto(int idProveedor, int idProducto, double costo) {
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public Proveedor_Producto(int idProveedorproducto, int idProveedor, int idProducto, double costo) {
        this.idProveedorproducto = idProveedorproducto;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public int getIdProveedorproducto() {
        return idProveedorproducto;
    }

    public void setIdProveedorproducto(int idProveedorproducto) {
        this.idProveedorproducto = idProveedorproducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Proveedor_Producto{" + "idProveedorproducto=" + idProveedorproducto + ", idProveedor=" + idProveedor + ", idProducto=" + idProducto + ", costo=" + costo + '}';
    }

   }