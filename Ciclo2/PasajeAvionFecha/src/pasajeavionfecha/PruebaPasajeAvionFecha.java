/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasajeavionfecha;

import clases.Aerolinea;
import clases.PasajeAvion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PruebaPasajeAvionFecha {
    
    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
       //Variables  
        int identificacion; 
        String Nombre,fecha_compra ;
               
        
        //Ingrese la identificacion el num debe ser entero
        System.out.println("Ingrese la identificacion : ");
        identificacion = teclado.nextInt();
        
        // Ingrese el Nombre debe ser de tipo string 
        System.out.println("Ingrese el Nombre  : ");
        teclado.nextLine(); //Genera un salto de linea para cuando ingresamos un int y despues un String
        Nombre = teclado.nextLine(); 
        
        // Intancia general  
        fecha_compra = "3/12/2021" ; //Modifico este valor de fecha caso 1 "3/12/2021", caso 2 "6/12/2021" , caso 3 "7/17/2021".
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = date.parse(fecha_compra);
        PasajeAvion b =new PasajeAvion(identificacion, Nombre,fecha);
        Aerolinea a = new Aerolinea(1,b);
        a.validarFecha();
              
     
    } 
    
    
}
