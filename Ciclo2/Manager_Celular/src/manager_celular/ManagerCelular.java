/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager_celular;

import clases.Celular;

public class ManagerCelular {


    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(cel1);
        //System.out.println(cel2);        
        // Instancias de la clase Celular
        Celular cel1 = new Celular("G59 - R1 ", 20, "Negro", "SAMSUNG");
        Celular cel2 = new Celular("G59 - R2 ", 15, "Blanco", "NOKIA");
        
        cel1.comunicar("3003162985");
        cel2.comunicar("3022243805");
        
        cel1.setNombre("IVAN");
        System.out.println("Nombre cel1: "+ cel1.getNombre());
        
        
        
        
    }
    
}
