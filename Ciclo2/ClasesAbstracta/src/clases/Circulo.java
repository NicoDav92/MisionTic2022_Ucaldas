/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Circulo extends Figura {
    // Atributo
    private double radio;
    
    // Constructor

    public Circulo(double radio, String nombreFigura) {
        super(nombreFigura);
        this.radio = radio;
    }
    
    // set y get

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Metodos logicas del negocio

    @Override
    public double getArea() {
        return Math.PI * this.radio * this.radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }    
    
}

