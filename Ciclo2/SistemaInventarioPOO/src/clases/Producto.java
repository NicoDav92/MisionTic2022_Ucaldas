/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Producto {
    // Atributos
    private int codigo;
    private int cantidad;
    private int cantidadMinima;
    
    // Constructor (instanciarlas)
    public Producto(int codigo, int cantidad, int cantidadMinima) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.cantidadMinima = cantidadMinima;
    }

    //set y get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }
}

