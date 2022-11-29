/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Personal
 */
public class Pasajero {
    // Atributos 
    private int idPasajero;
    private String nombre_pasajero;
    private int edad_pasajero;
    
    //Constructor

    public Pasajero(int idPasajero, String nombre_pasajero, int edad) {
        this.idPasajero = idPasajero;
        this.nombre_pasajero = nombre_pasajero;
        this.edad_pasajero = edad;
    }
    
    //Set y get 

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre_pasajero() {
        return nombre_pasajero;
    }

    public void setNombre_pasajero(String nombre_pasajero) {
        this.nombre_pasajero = nombre_pasajero;
    }

    public int getEdad_pasajero() {
        return edad_pasajero;
    }

    public void setEdad_pasajero(int edad_pasajero) {
        this.edad_pasajero = edad_pasajero;
    }

   
    
    
}

