/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto3pasajeavion;


import clases.Destino;
import clases.PasajeAvion;
import clases.Pasajero;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Personal
 */
public class PruebaReto3PasajeAvion {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        
       //Variables  
        String fecha_compra;
  
         // Fecha compra   
        fecha_compra = "7/21/2021" ; //Fecha de compra 
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = date.parse(fecha_compra);
        //System.out.println("La fecha de compra es: "+ fecha);
        
              
        
       //----------------------------------------------------------//
       //---------------------Instancia 1--------------------//
        System.out.println("********************************\n");
        System.out.println("Los datos para la instancia 1 son\n");
        Pasajero a =new Pasajero(0,"Juan sebastian Zuluaga",29);
        Pasajero a1 =new Pasajero(1,"Helena Gonzalez",27);
        Pasajero a2 =new Pasajero(2,"Johan Hernandez",7);
        Destino b =new Destino(0,"Santa Marta","Caribe");
        Pasajero pasajeros [] ={a,a1,a2};
        PasajeAvion c =new PasajeAvion(0,b,pasajeros,fecha);
        c.MostrarDatos();
        System.out.println("El total por el plan familiar es :"+c.calcularTotal());
        System.out.println("********************************\n");
 
        
      
      //----------------------------------------------------//
       //---------------------Instancia 2--------------------//
        System.out.println("********************************\n");
        System.out.println("Los datos para la instancia 2 son\n");
        Pasajero a0 =new Pasajero(0,"Juan sebastian Zuluaga",22);
        Pasajero a11 =new Pasajero(1,"Helena Gonzalez",11);
        Pasajero a22 =new Pasajero(2,"Johan Hernandez",7);
        Destino b1 =new Destino(1,"Armenia","Eje Cafetero");
        Pasajero pasajeros1[] ={a0,a11,a22};
        PasajeAvion c1 =new PasajeAvion(1,b1,pasajeros1,fecha);
        c1.MostrarDatos();
        System.out.println("El total por el plan familiar es :"+c1.calcularTotal());
        System.out.println("********************************\n");
        
      
        
         //----------------------------------------------------//
         //--------------Instancia 3---------------------------//
        System.out.println("********************************\n");
        Pasajero a00 =new Pasajero(0,"Juan sebastian Zuluaga",24);
        Pasajero a111 =new Pasajero(1,"Helena Gonzalez",30);
        Pasajero a222 =new Pasajero(2,"Johan Hernandez",12);
        Destino b11 =new Destino(2,"Nuqui","Pacifico");
        Pasajero pasajeros2[ ] ={a00,a111,a222};
        PasajeAvion c11 =new PasajeAvion(2,b11,pasajeros2,fecha);
        c11.MostrarDatos();
        System.out.println("El total por el plan familiar es :"+c11.calcularTotal());
        System.out.println("********************************\n");
        
         
      
      
              
    }
    
}
