/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Cuadrado extends Figura {
    // Atributos
    private double lado;
    
    // Constructor
    public Cuadrado(double lado, String nombreFigura) {
        super(nombreFigura);
        this.lado = lado;
    }
   
    // set y get
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    // Metodos logicas del negocio
    // Sobre escribir metodo
    @Override
    public double getArea() {
        return this.lado * this.lado;
        //return getLado() * getLado();
    }

    @Override
    public double getPerimetro() {
        return this.lado * 4; 
    }
}
