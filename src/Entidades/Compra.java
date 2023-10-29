
package Entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor idProveedor;
    private LocalDate fecha;
    private Variable2 idMetodoPago;
    private Double precioCosto;

    public Compra() {
    }

    public Compra(int idCompra, Proveedor idProveedor, LocalDate fecha, Variable2 idMetodoPago, Double precioCosto) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.idMetodoPago = idMetodoPago;
        this.precioCosto = precioCosto;
    }

    public Compra(Proveedor idProveedor, LocalDate fecha, Variable2 idMetodoPago, Double precioCosto) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.idMetodoPago = idMetodoPago;
        this.precioCosto = precioCosto;
    }



    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Variable2 getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(Variable2 idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }



    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProveedor=" + idProveedor + ", fecha=" + fecha + ", idMetodoPago=" + idMetodoPago + ", precioCosto=" + precioCosto + '}';
    }




    
}
