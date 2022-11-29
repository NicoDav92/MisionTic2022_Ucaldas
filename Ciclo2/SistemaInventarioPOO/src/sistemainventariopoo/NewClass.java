/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventariopoo;

import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Lea el numero de productos");
        int n = leer.nextInt();
        
        int codigos[] = new int[n];
        int cantidad[] = new int[n];
        int cantidadMinimas[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el codigo del producto: ");
            codigos[i] = leer.nextInt();
            System.out.println("Ingrese la cantidad del producto: ");
            cantidad[i] = leer.nextInt();
            System.out.println("Ingrese la  minima requerida del producto: ");
            cantidadMinimas[i] = leer.nextInt();
        }
        
        
        //Códigos de productos que son necesario pedir:
        for (int i = 0; i < n; i++) {
            if(cantidad[i]<=cantidadMinimas[i]){
                System.out.println(codigos[i]); 
            }
        }
        
        //Código con mayor y menor número unidades
        int mayor = cantidad[0], codMayor = codigos[0];
        int menor = cantidad[0], codMenor = codigos[0];;
        
        for (int i = 1; i < n; i++) {
            
            if(mayor < cantidad[i]){
                mayor = cantidad[i];
                codMayor = codigos[i];
            }
            
            if(menor > cantidad[i]){
                menor = cantidad[i];
                codMenor = codigos[i];
            }
            
            
        }
        
        System.out.println("Código con mayor número unidades:"+ codMayor);
        System.out.println("Código con menor número unidades:"+ codMenor);
       
    
    }
    
}

