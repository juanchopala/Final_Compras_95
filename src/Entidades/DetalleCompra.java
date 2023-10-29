/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Conexion.ProductoData;

/**
 *
 * @author Administrador
 */
public class DetalleCompra {

    private int idDetalle;
    private int cantidad;
    private double precioCosto;
    private int idCompra;
    private int idProducto;
    private String nombreProducto;

    public DetalleCompra(int idDetalle, int cantidad, double precioCosto, int idCompra, int idProducto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public DetalleCompra(int cantidad, double precioCosto, int idCompra, int idProducto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idCompra = idCompra;
        this.idProducto = idProducto;
    }

    public DetalleCompra(int cantidad, double precioCosto, int idProducto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProducto = idProducto;
    }

    public DetalleCompra(int cantidad, double precioCosto, int idProducto, String nombreProducto) {
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }
    
    
    
    

    public DetalleCompra() {
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleCompra other = (DetalleCompra) obj;
        return this.idProducto == other.idProducto;
    }
    
    


    

    @Override
    public String toString() {
        return "DetalleCompra{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", idCompra=" + idCompra + ", idProducto=" + idProducto + '}';
    }

}