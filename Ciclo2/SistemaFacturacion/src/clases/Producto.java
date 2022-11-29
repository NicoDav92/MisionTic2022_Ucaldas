/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Producto {
    // Atributos
    private String idProducto;
    private String nombreProducto;
    private double valorUnitario;
    private double cantidad;
    
    // Constructor

    public Producto(String idProducto, String nombreProducto, double valorUnitario, double cantidad) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }
    
    // set y get

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    } 
}
