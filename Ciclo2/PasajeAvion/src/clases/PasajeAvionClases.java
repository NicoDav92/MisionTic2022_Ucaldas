/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Personal
 */
public class PasajeAvionClases {
    
    //Atributos
    private int id_pasajero;
    private String nombre_destino;
    private int ocupacion_destino;
    
    //Constructor 

    public PasajeAvionClases(int id_pasajero, String nombre_destino, int ocupacion_destino) {
        this.id_pasajero = id_pasajero;
        this.nombre_destino = nombre_destino;
        this.ocupacion_destino = ocupacion_destino;
    }
    
    //Set(Asignar valores a los atributos) y get(Obtener valor de los atributos)

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public String getNombre_destino() {
        return nombre_destino;
    }

    public void setNombre_destino(String nombre_destino) {
        this.nombre_destino = nombre_destino;
    }

    public int getOcupacion_destino() {
        return ocupacion_destino;
    }

    public void setOcupacion_destino(int ocupacion_destino) {
        this.ocupacion_destino = ocupacion_destino;
    }
    
    //Metodos 
    
     public void Ocupacion(){
        System.out.println("Identificacion: "+ getId_pasajero() +
                "\nDestino: "+ getNombre_destino()+
                "\nDescuento porcentaje %: "+ getOcupacion_destino());
     }
     
      public void verificarOcupacion(int valor){
       
        if(valor <=(getOcupacion_destino()*0.30)){
            int nuevoOcupacion = 40; 
            setOcupacion_destino(nuevoOcupacion); 
            Ocupacion();
            
        }else if(valor > (getOcupacion_destino()*0.30) && valor <= (getOcupacion_destino()*0.60)){
            int nuevoOcupacion = 20; 
            setOcupacion_destino(nuevoOcupacion); 
            Ocupacion();
        } else if(valor > (getOcupacion_destino()*0.60)){
            int nuevoOcupacion = 10; 
            setOcupacion_destino(nuevoOcupacion); 
            Ocupacion();
        }
      }
         
}
