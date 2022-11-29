/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PasajeAvion;

import clases.PasajeAvionClases;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PasajeAvion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int identificacion,Pasajeros = 100; //Definimos un numero max de pasajeros 
        String Destino ;
       
        
        
        //Ingrese la identificacion el num debe ser entero
        System.out.println("Ingrese la identificacion : ");
        identificacion = teclado.nextInt();
        
        // Ingrese el destino debe ser de tipo string 
        
        System.out.println("Ingrese el destino  : ");
        teclado.nextLine(); //Genera un salto de linea para cuando ingresamos un int y despues un String
        Destino = teclado.nextLine(); 
   
        
        PasajeAvionClases a = new PasajeAvionClases(identificacion,Destino,Pasajeros);
        
        
        // Se lee el valor de la ocupacion
        System.out.println("Ingrese el valor de la ocupacion : ");
        int valor = teclado.nextInt();
        a.verificarOcupacion(valor);
        
        
    }
    
}
