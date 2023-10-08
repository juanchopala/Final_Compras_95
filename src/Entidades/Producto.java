//aqui en la base de datos cambie en la base de datos a stock como predeterminado en 0 
package Entidades;

import java.time.LocalDate;

public class Producto {
  private int idProducto;
  private String categoriaProducto;
  private String nombreProducto;
  private String importadonacional;
  private String descripcion;
  private LocalDate fechalimite;
  private double precioActual;
  private int stock;
  private boolean estado;

    public Producto() {
    }

    public Producto(String categoriaProducto, String nombreProducto, String importadonacional, String descripcion, LocalDate fechalimite, double precioActual, boolean estado) {
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.importadonacional = importadonacional;
        this.descripcion = descripcion;
        this.fechalimite = fechalimite;
        this.precioActual = precioActual;
        this.estado = estado;
    }

    public Producto(int idProducto, String categoriaProducto, String nombreProducto, String importadonacional, String descripcion, LocalDate fechalimite, double precioActual, boolean estado) {
        this.idProducto = idProducto;
        this.categoriaProducto = categoriaProducto;
        this.nombreProducto = nombreProducto;
        this.importadonacional = importadonacional;
        this.descripcion = descripcion;
        this.fechalimite = fechalimite;
        this.precioActual = precioActual;
        this.estado = estado;
    }
    
    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getImportadonacional() {
        return importadonacional;
    }

    public void setImportadonacional(String importadonacional) {
        this.importadonacional = importadonacional;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechalimite() {
        return fechalimite;
    }

    public void setFechalimite(LocalDate fechalimite) {
        this.fechalimite = fechalimite;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", categoriaProducto=" + categoriaProducto + ", nombreProducto=" + nombreProducto + ", importadonacional=" + importadonacional + ", descripcion=" + descripcion + ", fechalimite=" + fechalimite + ", precioActual=" + precioActual + ", stock=" + stock + ", estado=" + estado + '}';
    }   
}
