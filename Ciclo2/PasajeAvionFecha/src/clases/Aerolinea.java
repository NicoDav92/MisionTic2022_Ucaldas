/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;



/**
 *
 * @author Personal
 */
public class Aerolinea {
    
    //Atributos 
    private  int id_aerolinea;
    private PasajeAvion pasajeavion;

    public Aerolinea(int id_aerolinea, PasajeAvion pasajeavion) {
        this.id_aerolinea = id_aerolinea;
        this.pasajeavion = pasajeavion;
    }
    
    //set y get 

    public int getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(int id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }

    public PasajeAvion getPasajeavion() {
        return pasajeavion;
    }

    public void setPasajeavion(PasajeAvion pasajeavion) {
        this.pasajeavion = pasajeavion;
    }
    
    //Metodos del negocio 
     
     public void validarFecha() throws ParseException{
         
         //Caso general, arroja la resta de dos fechas mediante between y con el numdias evaluo los condicionales 
     
        System.out.println("La fecha de compra  y fecha actual  es  : ");
        LocalDate fini = LocalDate.parse("2021-03-12"); //Fecha de compra //Modifico este valor manualmente caso1 "2021-03-12", caso 2 "2021-06-12" , caso 3 "2021-07-17".
        System.out.println("La fecha compra es: "+ fini); 
        LocalDate ffin = LocalDate.parse("2021-08-12");  //Fecha actual es 
        System.out.println("La fecha actual es: " + ffin);
        
        Duration dd = Duration.between(fini.atStartOfDay(),ffin.atStartOfDay());
        
        System.out.println("Dias trascurridos: " + dd.toDays() + " Dias" );
        long numdias = dd.toDays(); //Almaceno el num de dias que resta las dos fechas 
      
        
        
     // Defino los condicionales basado en el num de dias obtenidos.  
     if(numdias > 120 ){ //   La validacion se hace segun el numero de dias (if > 4 meses)
           System.out.println("Señor usuario, su pasaje esta vencido y no puede ser usado en esta ocasión");
           //Fecha();
              
        }else if(numdias<= 120 && numdias >=30){ //numero de dias (if<= 4 meses && >=2 meses )
           System.out.println("Señor usuario, su pasaje es válido, pero está próximo a vencer. Debe ser usado antes de que caduque");
            //Fecha();
           
        } else if(numdias < 30) { //numero de dias (if < 2 meses)
           System.out.println("Señor usuario, su pasaje es válido y aún tiene más de dos meses para darle uso");
            //Fecha();
         
        } 
}
    
     
    
}
