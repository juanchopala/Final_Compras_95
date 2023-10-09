
package Entidades;

import java.time.LocalDate;

public class Compra {
    private int idCompra;
    private Proveedor idProveedor;
    private LocalDate fecha;
    private boolean estado;
    private String Reporte;
    
    public Compra(){
    }

    public Compra(int idCompra, Proveedor idProveedor, LocalDate fecha, boolean estado, String Reporte) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.estado = estado;
        this.Reporte = Reporte;
    }

    public Compra(Proveedor idProveedor, LocalDate fecha, boolean estado, String Reporte) {
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.estado = estado;
        this.Reporte = Reporte;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getReporte() {
        return Reporte;
    }

    public void setReporte(String Reporte) {
        this.Reporte = Reporte;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProveedor=" + idProveedor + ", fecha=" + fecha + ", estado=" + estado + ", Reporte=" + Reporte + '}';
    }


    


    
}
