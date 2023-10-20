/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author gonza
 */
public class Variable2 {
    private int idMetodoPago;
    private String NombreMetodo;

    public Variable2() {
    }

    public Variable2(String NombreMetodo) {
        this.NombreMetodo = NombreMetodo;
    }

    public Variable2(int idMetodoPago, String NombreMetodo) {
        this.idMetodoPago = idMetodoPago;
        this.NombreMetodo = NombreMetodo;
    }

    public int getIdMetodoPago() {
        return idMetodoPago;
    }

    public void setIdMetodoPago(int idMetodoPago) {
        this.idMetodoPago = idMetodoPago;
    }

    public String getNombreMetodo() {
        return NombreMetodo;
    }

    public void setNombreMetodo(String NombreMetodo) {
        this.NombreMetodo = NombreMetodo;
    }


    @Override
    public String toString() {
        return " idMetodoPago = " + idMetodoPago + " / NombreMetodo = " + NombreMetodo ;
    }
    
    
}
