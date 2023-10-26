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
    private Variable2 Variable2;
    private int cantidad;
    private double precioCosto;
    private Compra compra;
    private ProductoData ProductoData;

    public DetalleCompra() {
    }

    public DetalleCompra(Variable2 Variable2, int cantidad, double precioCosto, Compra compra, ProductoData ProductoData) {
        this.Variable2 = Variable2;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.ProductoData = ProductoData;
    }

    public DetalleCompra(int idDetalle, Variable2 Variable2, int cantidad, double precioCosto, Compra compra, ProductoData ProductoData) {
        this.idDetalle = idDetalle;
        this.Variable2 = Variable2;
        this.cantidad = cantidad;
        this.precioCosto = precioCosto;
        this.compra = compra;
        this.ProductoData = ProductoData;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Variable2 getVariable2() {
        return Variable2;
    }

    public void setVariable2(Variable2 Variable2) {
        this.Variable2 = Variable2;
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

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public ProductoData getProductoData() {
        return ProductoData;
    }

    public void setProductoData(ProductoData ProductoData) {
        this.ProductoData = ProductoData;
    }

    @Override
    public String toString() {
        return "DetalleCompra{" + "idDetalle=" + idDetalle + ", Variable2=" + Variable2 + ", cantidad=" + cantidad + ", precioCosto=" + precioCosto + ", compra=" + compra + ", ProductoData=" + ProductoData + '}';
    }

   
    
    
    
}
