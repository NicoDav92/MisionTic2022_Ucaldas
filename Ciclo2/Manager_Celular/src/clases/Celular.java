/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Celular {
    // Atributos
    private String nombre;
    private int size;
    private String color;
    private String marca;
    
    // Constructor (Poder instanciar la Clase)
    public Celular(String nombre, int size, String color, String marca) {
        this.nombre = nombre;
        this.size = size;
        this.color = color;
        this.marca = marca;
    }    
    
    // set y get (encasulamiento)
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
     // Metodos logica del negocio
    public void comunicar(String num){
        System.out.println(nombre + "Estan llamando --> " + num);
    } 
    
    public String mensajeTexto(String num){
        return nombre + "Te envio un mensaje el " + num;
    }

   
}