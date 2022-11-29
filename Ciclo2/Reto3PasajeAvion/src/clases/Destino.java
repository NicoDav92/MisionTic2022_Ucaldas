/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Personal
 */
public class Destino {
    
    //Atributos 
    private int idDestino;
    private String nombre_destino;
    private String region;
    
   //Constructor 

    public Destino(int idDestino, String nombre_destino, String region) {
        this.idDestino = idDestino;
        this.nombre_destino = nombre_destino;
        this.region = region;
    }
    
   //Set y get 

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre_destino() {
        return nombre_destino;
    }

    public void setNombre_destino(String nombre_destino) {
        this.nombre_destino = nombre_destino;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
    
}
