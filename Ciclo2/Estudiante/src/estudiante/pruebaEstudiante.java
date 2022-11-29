/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiante;
import clases.Estudiante;
import java.util.Scanner;

public class pruebaEstudiante {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el nombre: ");
        String nombre = leer.next();
        
        System.out.println("Registre las 3 notas: ");
        float n1 = leer.nextFloat();
        float n2 = leer.nextFloat();
        float n3 = leer.nextFloat();        
        
        Estudiante est1 = new Estudiante(nombre, n1, n2, n3);
        est1.promedio(n1, n2, n3);       
        
    }
    
}