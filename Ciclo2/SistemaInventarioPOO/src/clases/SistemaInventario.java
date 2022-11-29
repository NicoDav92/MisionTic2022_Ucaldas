/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class SistemaInventario {
    
    // Metodo logica del negocio
    public void controlInventario(int[] codigo, int[] cantidad, int[] cantidadMinima){
        
        System.out.println("Códigos de productos que son necesario pedir:"); 
        System.out.println("Longitud del array: " + codigo.length);
        // i contador inicia 0;   hasta       ; de uno en uno           
        for (int i = 0; i < cantidadMinima.length; i++) {
            if(cantidad[i] < cantidadMinima[i]){
                System.out.println(codigo[i]);
            }            
        }          
        
        int mayor = cantidad[0], codMayor = codigo[0];
        int menor = cantidad[0], codMenor = codigo[0];
        
        for (int i = 1; i < cantidad.length; i++) {
            // Mayor
            if(mayor < cantidad[i]){
                mayor = cantidad[i];
                codMayor = codigo[i];
            }
            // Menor
            if(menor > cantidad[i]){
                menor = cantidad[i];
                codMenor = codigo[i];
            }
        }
        
        System.out.println("Código con mayor número unidades: " + codMayor);
        System.out.println("Código con menor número unidades: " + codMenor);
    }
}

