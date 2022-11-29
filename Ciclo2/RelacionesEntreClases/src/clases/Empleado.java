/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.util.Date;

public class Empleado extends Persona {
    // Atributos
    String idCargo;
    String nombCargo;
    Date fechaIngreso;
    double sueldo;
    
    // Contructor

    public Empleado(String idCargo, String nombCargo, Date fechaIngreso, double sueldo, String numeroIdentificacion, String nombre, String apellido, Date fechaNacimiento, String telefono, String direccion) {
        super(numeroIdentificacion, nombre, apellido, fechaNacimiento, telefono, direccion);
        this.idCargo = idCargo;
        this.nombCargo = nombCargo;
        this.fechaIngreso = fechaIngreso;
        this.sueldo = sueldo;
    }
    
    // set y get

    
    
    
    
    
}



















