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
public class Venta {

    private int idVentas;
    private int idProducto;
    private LocalDate fecha;
    private int Cantidad;
    private double PrecioTotal;
    private int idMetodoPago;

    public Venta() {
    }

    public Venta(int idVentas, int idProducto, LocalDate fecha, int Cantidad, double PrecioTotal, int idMetodoPago) {
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
        this.idMetodoPago = idMetodoPago;
    }

    public Venta(int idProducto, LocalDate fecha, int Cantidad, double PrecioTotal, int idMetodoPago) {
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
        this.idMetodoPago = idMetodoPago;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
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

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    
    @Override
    public String toString() {
        return "Venta{" + "idVentas=" + idVentas + ", idProducto=" + idProducto + ", fecha=" + fecha + ", Cantidad=" + Cantidad + ", PrecioTotal=" + PrecioTotal + ", idMetodoPago=" + idMetodoPago + '}';
    }

  }  