package Entidades;



public class Proveedor_Producto {
    private int idProveedorproducto;
    private Proveedor idProvedor;
    private Producto idProducto;
    private double costo;

    public Proveedor_Producto() {
    }

    public Proveedor_Producto(int idProveedorproducto, Proveedor idProvedor, Producto idProducto, double costo) {
        this.idProveedorproducto = idProveedorproducto;
        this.idProvedor = idProvedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public Proveedor_Producto(Proveedor idProvedor, Producto idProducto, double costo) {
        this.idProvedor = idProvedor;
        this.idProducto = idProducto;
        this.costo = costo;
    }

    public Proveedor getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Proveedor idProvedor) {
        this.idProvedor = idProvedor;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
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
