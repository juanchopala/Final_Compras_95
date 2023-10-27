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
        private Producto idProducto;
        private LocalDate fecha;
        private int cantidad;
        private Double PrecioTotal;

        public Ventas() {
        }

        public Ventas(Producto idProducto, LocalDate fecha, int cantidad, Double PrecioTotal) {
            this.idProducto = idProducto;
            this.fecha = fecha;
            this.cantidad = cantidad;
            this.PrecioTotal = PrecioTotal;
        }

        public Ventas(int idVentas, Producto idProducto, LocalDate fecha, int cantidad, Double PrecioTotal) {
            this.idVentas = idVentas;
            this.idProducto = idProducto;
            this.fecha = fecha;
            this.cantidad = cantidad;
            this.PrecioTotal = PrecioTotal;
        }

        public int getIdVentas() {
            return idVentas;
        }

        public void setIdVentas(int idVentas) {
            this.idVentas = idVentas;
        }

        public Producto getIdProducto() {
            return idProducto;
        }

        public void setIdProducto(Producto idProducto) {
            this.idProducto = idProducto;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public Double getPrecioTotal() {
            return PrecioTotal;
        }

        public void setPrecioTotal(Double PrecioTotal) {
            this.PrecioTotal = PrecioTotal;
        }

        @Override
        public String toString() {
            return "Ventas{" + "idVentas=" + idVentas + ", idProducto=" + idProducto + ", fecha=" + fecha + ", cantidad=" + cantidad + ", PrecioTotal=" + PrecioTotal + '}';
        }

    }
