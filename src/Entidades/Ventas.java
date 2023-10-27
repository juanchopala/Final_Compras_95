/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author gonza
 */
public class Ventas {

    private int idVentas;
    private Producto Producto;
    private LocalDate fecha;
    private int Cantidad;
    private double PrecioTotal;

    public Ventas() {
    }

    public Ventas(int idVentas, Producto Producto, LocalDate fecha, int Cantidad, double PrecioTotal) {
        this.idVentas = idVentas;
        this.Producto = Producto;
        this.fecha = fecha;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
    }

    public Ventas(Producto Producto, LocalDate fecha, int Cantidad, double PrecioTotal) {
        this.Producto = Producto;
        this.fecha = fecha;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto Producto) {
        this.Producto = Producto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    @Override
    public String toString() {
        return "Ventas{" + "idVentas=" + idVentas + ", Producto=" + Producto + ", fecha=" + fecha + ", Cantidad=" + Cantidad + ", PrecioTotal=" + PrecioTotal + '}';
    }

}
