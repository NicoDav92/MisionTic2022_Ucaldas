/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Computador {
    // Atributos
    String marca;
    String monitor;
    double precio;
    String tipoProcesador;
    int year;
    
    // Constructor

    public Computador(String marca, String monitor, double precio, String tipoProcesador, int year) {
        this.marca = marca;
        this.monitor = monitor;
        this.precio = precio;
        this.tipoProcesador = tipoProcesador;
        this.year = year;
        
        mostrarDatos(marca, monitor);
        mostrarDatos(marca, monitor, tipoProcesador);
        mostrarDatos(marca, monitor, precio);
    }
    
    // Sobre Carga todo
    public void mostrarDatos(String marca, String monitor, double precio){
        System.out.println();
        System.out.println("*****************************\n");
        System.out.println(
                           """
                           
                           DATOS DEL COMPUTADOR
                           
                           Marca: """ + marca +
                           "\nMonitor: " + monitor +         
                           "\nPrecio: " + precio
                          );
        
    }
    
    public void mostrarDatos(String marca, String monitor){
        System.out.println();
        System.out.println("*****************************\n");
        System.out.println(
                           """
              
                                                    
                           DATOS DEL COMPUTADOR
                           
                           Marca: """ + marca +
                           "\nMonitor: " + monitor 
                          );
        
    }
    
    public void mostrarDatos(String marca, String monitor, String tipoProcesador){
        System.out.println();
        System.out.println("*****************************\n");
        System.out.println(
                           """
              
                                                    
                           DATOS DEL COMPUTADOR
                           
                           Marca: """ + marca +
                           "\nMonitor: " + monitor +
                           "\nTipo Procesador: " + tipoProcesador        
                          );
        
    }
    
}
