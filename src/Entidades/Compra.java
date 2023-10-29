
package Entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private int idProveedor;
    private LocalDate fecha;
    private int idMetodoPago;
    private Double precioCosto;

    public Compra() {
    }

    public Compra(int idCompra, int idProveedor, LocalDate fecha, int idMetodoPago, Double precioCosto) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.idMetodoPago = idMetodoPago;
        this.precioCosto = precioCosto;
    }

    public Compra(int idProveedor, LocalDate fecha, int idMetodoPago, Double precioCosto) {
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

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
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
