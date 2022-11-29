/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package relacionesentreclases;
import clases.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//import javax.imageio.ImageIO;

public class RelacionesEntreClases {
    // Bloque de funciones
    
    
    public static void main(String[] args) throws ParseException  {
        // TODO code application logic here
        
        // Bloque importar 
        Scanner leer = new Scanner(System.in);
        
        // Declare variables y definir de que tipo son
        /*String idCargo, nombCargo, numeroIdentificacion, nombre, apellido, telefono, direccion;
        double sueldo;
        // Variables para trabajar con fechas
        //String fechaI, fechaN; 
        //Date fechaIngreso, fechaNacimiento;
        
        // Bloque del programa principal
        // Capturar las entradas
        System.out.print("Ingrese el codigo del cargo: ");
        idCargo = leer.nextLine();
        System.out.print("Ingrese el nombre del cargo: ");
        nombCargo = leer.nextLine();
        System.out.print("Ingrese el numero de identificacion: ");
        numeroIdentificacion = leer.nextLine();
        System.out.print("Nombre empleado: ");
        nombre = leer.nextLine();
        System.out.print("Apellido empleado: ");
        apellido = leer.nextLine();
        System.out.print("Telefono empleado: ");
        telefono = leer.nextLine();
        System.out.print("Dirreccion empleado: ");
        direccion = leer.nextLine();
        System.out.print("Sueldo empleado: ");
        sueldo = leer.nextDouble();
        //System.out.print("Fecha Ingreso MM/dd/yyyy : ");
        String fechaI = leer.nextLine();
        //System.out.print("Fecha Nacimiento mm/dd/yyyy : ");
        String fechaN = leer.nextLine();  // 07/07/2022
               
        
        // Formato a las variables de fecha
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
        Date fechaIngreso = date.parse(fechaI);
        Date fechaNacimiento = date.parse(fechaN);
        // Generar la instancia
        Empleado empleado = new Empleado(idCargo, nombCargo, fechaIngreso, sueldo, numeroIdentificacion, nombre, apellido, fechaNacimiento, telefono, direccion);
        
        
        System.out.println("Fecha de nacimiento: "+ empleado.getFechaNacimiento());*/
        
        String fechaComoTexto = leer.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        System.out.println("Fecha " + fecha);
        
        
    }
    
}
