/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class PasajeAvion {
    //Atributos 
   
    private  int id_pasaje;
    private  String nombre_persona;
    private  Date fecha_compra;
    
    //Constructor 

    public PasajeAvion(int id_pasaje, String nombre_persona, Date fecha_compra) {
        this.id_pasaje = id_pasaje;
        this.nombre_persona = nombre_persona;
        this.fecha_compra = fecha_compra;
    }
 
    
    //Encapsulamiento set y get 

    public int getId_pasaje() {
        return id_pasaje;
    }

    public void setId_pasaje(int id_pasaje) {
        this.id_pasaje = id_pasaje;
    }

    public String getNombre_persona() {
        return nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
      //Metodos 
     public void mostrarDatos(){
        System.out.println("Identificacion: "+ getId_pasaje()+
                "\nDestino: "+ getNombre_persona()+
                "\nDescuento porcentaje %: "+ getFecha_compra());
     }
    
}
