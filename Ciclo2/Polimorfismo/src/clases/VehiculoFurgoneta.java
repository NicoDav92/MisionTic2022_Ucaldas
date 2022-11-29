/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class VehiculoFurgoneta extends Vehiculo {
    // Atributos
    private int carga;
    
    // Constructor

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }
    
    // set y get

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    // Metodo logica del negocio
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() +
               "\nCapacidad de carga: "+ getCarga();
    }
    
    
    
}

