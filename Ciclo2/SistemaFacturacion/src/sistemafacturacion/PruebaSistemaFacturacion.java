/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafacturacion;

import clases.*;
import java.util.Scanner;

public class PruebaSistemaFacturacion {

    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println(cliente.getApellidosCliente());
        cliente.mostrarDatos();
        cliente.setApellidosCliente("castro ruiz");
        System.out.println(cliente.getApellidosCliente());
        
        String texto = cliente.mostrarInfo();
        System.out.println(texto);
        cliente.setEdadCliente(cliente.edadCliente() - 10);
        
        System.out.println("Nueva Edad" + cliente.getEdadCliente());*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite el codigo: ");
        String codigo = leer.nextLine();
        System.out.println("Digite el nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Digite el apellido: ");
        String apellido = leer.nextLine();
        System.out.println("Digite el telefono: ");
        String telefono = leer.nextLine();
        
        
        // Instancia de la clase cliente
        Cliente cliente = new Cliente(codigo, nombre, apellido, telefono);
        // Instancia de Productos
        Producto prd1 = new Producto("1", "Cafe", 2450, 4);
        Producto prd2 = new Producto("2", "Arroz", 6540, 10);
        Producto prd3 = new Producto("3", "Azucar", 1050, 1);
        
        Producto productos[] = { prd1, prd2, prd3 };
        // Intanciar 1 factura
        Factura factura = new Factura("FC-001", "05-07-2022", cliente, productos);
        factura.totalFactura(productos);
        
    }
    
}

