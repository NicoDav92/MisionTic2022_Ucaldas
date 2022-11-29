/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class VehiculoTurismo extends Vehiculo {
    // Atributos
    private int numeroPuertas;
    
    // Constructor

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    // set y get
    
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    // Metodos logicas del negocio
    // sobreescribiendo el metodo
    @Override 
    public String mostrarDatos(){
        return super.mostrarDatos() +
               "\nNumero Puertas: "+ getNumeroPuertas();
    }
}
