/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class VehiculoDeportivo extends Vehiculo {
    // Atributos
    private int cilindrada;
    
    // Constructor
    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    // set y get 
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // Metodos logicas del negocio
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() +
               "\nCilindradas: "+ getCilindrada();
    }    
    
}

