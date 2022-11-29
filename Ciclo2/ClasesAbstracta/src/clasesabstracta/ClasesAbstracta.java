/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesabstracta;

import clases.*;

public class ClasesAbstracta {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrado miCuadrado = new Cuadrado(8, "Soy Cuadrado");
        System.out.println("Me llamo: " + miCuadrado.getNombreFigura() + " mi area es de: " + miCuadrado.getArea() + " con permetro de: " + miCuadrado.getPerimetro() );
        
        Circulo miCirculo = new Circulo(5, "Soy Circulo");
        System.out.println("Me llamo: " + miCirculo.getNombreFigura() + " mi area es de: " + String.format("%.2f",miCirculo.getArea()) + " con permetro de: " + String.format("%.2f",miCirculo.getPerimetro()) );
         
    }
    
}
