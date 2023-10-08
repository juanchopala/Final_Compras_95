package Entidades;



public class Proveedor_Producto {
    private int idProveedorproducto;
    private int idProvedor;
    private int idProducto;
    private double costo;

    public Proveedor_Producto() {
    }

    public Proveedor_Producto(int idProvedor, int idProducto, double costo) {
        this.idProvedor = idProvedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public Proveedor_Producto(int idProveedorproducto, int idProvedor, int idProducto, double costo) {
        this.idProveedorproducto = idProveedorproducto;
        this.idProvedor = idProvedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
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

    public int getIdProveedorproducto() {
        return idProveedorproducto;
    }

    public void setIdProveedorproducto(int idProveedorproducto) {
        this.idProveedorproducto = idProveedorproducto;
    }
    

    @Override
    public String toString() {
        return "Proveedor_Producto{" + "idProveedorproducto=" + idProveedorproducto + ", idProvedor=" + idProvedor + ", idProducto=" + idProducto + ", costo=" + costo + '}';
    }
     
}
