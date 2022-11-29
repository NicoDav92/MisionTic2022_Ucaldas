/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.HashMap;

public class Estacion {
    // Atributo
    private String ubicacion; 
    // Relacion 1 Estacion tiene 1..* Bicicletas
    private Bicicleta[] bicicletas;
    private int cantidadPrestamos;
    
    // Constructor

    public Estacion(String ubicacion, Bicicleta[] bicicletas, int cantidadPrestamos) {
        this.ubicacion = ubicacion;
        this.bicicletas = bicicletas;
        this.cantidadPrestamos = cantidadPrestamos;
    }    
    
    public Estacion() {
    } 

    public Estacion(Bicicleta[] bicicletas) {
        this.bicicletas = bicicletas;
    }
    
    
    
    //get

    public String getUbicacion() {
        return ubicacion;
    }

    public Bicicleta[] getBicicletas() {
        return bicicletas;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }
    
    // Metodos logicas del negocio
    
    public static void burbuja(Estacion[] estaciones){
        Estacion temp = new Estacion();
        for (int i = 1; i < estaciones.length; i++) {
            for (int j = 0; j < estaciones.length - 1; j++) {
                //Se comparan las cantidades de los prestamos entre los elementos del 
                //vector para realizar el oredenamiento de las posiciones del mismo
                //importante tener presente el signo para ordenar de > mayor a menor o de < menor
                // a mayor 
                if(estaciones[j].getCantidadPrestamos()<estaciones[j+1].getCantidadPrestamos()){
                   temp = estaciones[j];
                   estaciones[j] = estaciones[j+1];
                   estaciones[j+1] = temp;
                }   
            }            
        }
    }
    
    
    public static Estacion[] consultarEstacionesMasUsadas(Estacion[] estaciones){
        // 1) Oredenar la lista de estaciones
        burbuja(estaciones);
        Estacion[] estacionesMasUsadas = { estaciones[0], estaciones[1], estaciones[2] };
        return estacionesMasUsadas;
    }
    
    public HashMap<String, Integer> getBalanceBicicletas(){
        HashMap<String, Integer> diccionario = new HashMap<String, Integer>();
        
        int contPre = 0, contSta = 0;
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getModelo().equals("Premium")) {
                contPre += 1;
            } else if (bicicleta.getModelo().equals("Standard")) {
                contSta += 1;
            }
        }
        // HashMap metodo .put agrega valores al diccionario
        diccionario.put("Standard",contSta);
        diccionario.put("Premium",contPre);
        System.out.println("********************************");
        System.out.println("Datos del diccionario: "+ diccionario);
        return diccionario;
    }
    
    
    
}

