/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package totalpagar;
import java.util.Scanner;

public class suma3Numeros {
    // Funciones 
    public static int sumar(int n1, int n2, int n3){
        int resultado = (n1 + n2 + n3);
        return resultado;
    }
    
    public static void main(String[] args) {
        // Import
        Scanner leer = new Scanner(System.in);
        // Variables y constantes
        int n1, n2, n3;               
        
        // Programa Principal
        System.out.println("Escriba 3 numero enteros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        
        int resul = sumar(n1, n2, n3);
        
        System.out.println("El resultado es: " + resul); 
    }
    
}
