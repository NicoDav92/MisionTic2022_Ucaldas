/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public abstract class Figura {
    // Atributos
    private String nombreFigura;

    // Constructor
    public Figura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
        
    // set y get

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    
    // Metodos logicas del negocio
    
    public abstract double getArea();
    
    public abstract double getPerimetro();

    
}