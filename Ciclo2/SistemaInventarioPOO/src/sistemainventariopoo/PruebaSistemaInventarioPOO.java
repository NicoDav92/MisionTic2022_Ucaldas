/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemainventariopoo;
import clases.Producto;
import clases.SistemaInventario;

public class PruebaSistemaInventarioPOO {
    
    public static void main(String[] args) {
        // TODO code application logic here

        // Entradas
        // 7 Productos codigo - cantidad - cantidadMinima
        Producto prd1 = new Producto(354, 10, 17);
        Producto prd2 = new Producto(256, 150, 34);
        Producto prd3 = new Producto(127, 56, 60);        
        Producto prd4 = new Producto(390, 24, 56);        
        Producto prd5 = new Producto(35, 36, 32);                
        Producto prd6 = new Producto(562, 90, 16);                
        Producto prd7 = new Producto(236, 15, 5);                
        
        // Declaracion Arreglos
        int codigo[] = new int[7];
        int cantidad[] = new int[7]; 
        int cantidadMinima[] = new int[7];
        
        // Asignar los valores a los arreglos
        
        // Codigo
        codigo[0] = prd1.getCodigo();
        codigo[1] = prd2.getCodigo();
        codigo[2] = prd3.getCodigo();
        codigo[3] = prd4.getCodigo();
        codigo[4] = prd5.getCodigo();
        codigo[5] = prd6.getCodigo();
        codigo[6] = prd7.getCodigo();
        
        // Cantidad
        cantidad[0] = prd1.getCantidad();
        cantidad[1] = prd2.getCantidad();
        cantidad[2] = prd3.getCantidad();
        cantidad[3] = prd4.getCantidad();
        cantidad[4] = prd5.getCantidad();
        cantidad[5] = prd6.getCantidad();
        cantidad[6] = prd7.getCantidad();
        
        // Cantidad Minima
        cantidadMinima[0] = prd1.getCantidadMinima();
        cantidadMinima[1] = prd2.getCantidadMinima();
        cantidadMinima[2] = prd3.getCantidadMinima();
        cantidadMinima[3] = prd4.getCantidadMinima();
        cantidadMinima[4] = prd5.getCantidadMinima();
        cantidadMinima[5] = prd6.getCantidadMinima();
        cantidadMinima[6] = prd7.getCantidadMinima();
        
        // Clase Sistema inventario.
        // Salidad Esperada
        SistemaInventario control =  new SistemaInventario();
        
        control.controlInventario(codigo, cantidad, cantidadMinima);
        
    }
    
}

