/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class Prestamo {
    // Atributos
    private int idUsuario;
    private String idBicicleta;
    private String modeloBicleta;
    
    // Constructor
    public Prestamo(int idUsuario, String idBicicleta, String modeloBicleta) {
        this.idUsuario = idUsuario;
        this.idBicicleta = idBicicleta;
        this.modeloBicleta = modeloBicleta;
    }
    
    // get

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getIdBicicleta() {
        return idBicicleta;
    }

    public String getModeloBicleta() {
        return modeloBicleta;
    }
    
    // Medotos logicas del negocio
    
    public int consultarDescuento(Prestamo[] historialPrestamo, Prestamo nuevoPrestamo){
        int contadora = 0;
        int descuento = 0;
        
        //1) Recorrer la estructura de datos (historialPrestamo)
        for (Prestamo prestamo : historialPrestamo) {
            if(prestamo.getIdUsuario() == nuevoPrestamo.getIdUsuario()){
                contadora += 1;
            }
        }
        
        //2) Hallar el valor a descontar partiendo del numero de prestamo del usuario
        if(contadora < 3){
            descuento = 0; 
        }else{
            if(contadora >=3 && contadora <= 5){
                descuento = 4; 
            }else{
                
                if(nuevoPrestamo.getModeloBicleta().equals("Standard")){
                    descuento = 8; 
                }else{
                    descuento = 9; 
                }
            }
        }

        return descuento;
    }
    
}

