/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package totalpagar;
import clases.Cliente;
import java.util.Scanner;

public class pruebaTotalPagar {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
               
        Cliente cli1 = new Cliente("001", "Ivan Castro", 5, 25000);
        Cliente cli2 = new Cliente("002", "Juan Perez", 2, 5000);
        Cliente cli3 = new Cliente("003", "Ashlee Castro", 1, 26500);
        
        /*String nombre = cli3.getNombreCliente();
        System.out.println("Nombre: " + nombre);
        
        cli3.setNombreCliente("Ashlee Castro");
        nombre = cli3.getNombreCliente();
        System.out.println("Nombre: " + nombre);*/
        
        System.out.println("**************************************");
        System.out.println("Antes: "+ cli1.getTotalApagar());
        System.out.println("ID Cliente: " + cli1.getIdCliente() );
        System.out.println("Nombre Cliente: " + cli1.getNombreCliente());
        System.out.println("Dia compra: "+ cli1.getDiaCompra());    
        System.out.println("SubTotal: " + cli1.getSubTotal());
        System.out.println("Total a pagar es: "+ cli1.calculoTotal(cli1.getDiaCompra(), cli1.getSubTotal()));
        cli1.setTotalApagar(cli1.calculoTotal(cli1.getDiaCompra(), cli1.getSubTotal()));        
        System.out.println("Despues: "+ cli1.getTotalApagar());
        System.out.println("**************************************");
        System.out.println("Antes: "+ cli2.getTotalApagar());
        System.out.println("ID Cliente: " + cli2.getIdCliente() );
        System.out.println("Nombre Cliente: " + cli2.getNombreCliente());
        System.out.println("Dia compra: "+ cli2.getDiaCompra());    
        System.out.println("SubTotal: " + cli2.getSubTotal());
        System.out.println("Total a pagar es: "+ cli2.calculoTotal(cli2.getDiaCompra(), cli2.getSubTotal()));
        cli2.setTotalApagar(cli2.calculoTotal(cli2.getDiaCompra(), cli2.getSubTotal()));        
        System.out.println("Despues: "+ cli2.getTotalApagar());
        System.out.println("**************************************");
        System.out.println("Antes: "+ cli3.getTotalApagar());
        System.out.println("ID Cliente: " + cli3.getIdCliente() );
        System.out.println("Nombre Cliente: " + cli3.getNombreCliente());
        System.out.println("Dia compra: "+ cli3.getDiaCompra());    
        System.out.println("SubTotal: " + cli3.getSubTotal());
        System.out.println("Total a pagar es: "+ cli3.calculoTotal(cli3.getDiaCompra(), cli3.getSubTotal()));
        cli3.setTotalApagar(cli3.calculoTotal(cli3.getDiaCompra(), cli3.getSubTotal()));        
        System.out.println("Despues: "+ cli3.getTotalApagar());
    }
    
}

