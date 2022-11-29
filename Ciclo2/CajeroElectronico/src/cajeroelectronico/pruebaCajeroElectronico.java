/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajeroelectronico;

import clases.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class pruebaCajeroElectronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Cuenta a = new Cuenta("1234","Juan",350000);
        Cuenta b = new Cuenta("9876","Maria",450600);
        
        // Se lee el valor a retirar 
        System.out.println("Ingrese el valor a retirar: ");
        int valor = leer.nextInt();
        
        a.girar(valor);
        
         // Se lee el valor a depositar 
        System.out.println("Ingrese el valor a Depositar: ");
         valor = leer.nextInt();
        
        a.depositar(valor);
        
        //Consultar Saldo despues de retirar y depositat 
        System.out.println("Su saldo actual es : ");
        a.mostrarSaldo();
        
        //System.out.println(a.getNombreCuenta());
        //System.out.println(b.getNombreCuenta());
    }
    
}
