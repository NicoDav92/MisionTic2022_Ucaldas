package retocallcenter;

import controlador.CallCenter;
import controlador.Empleado;
import java.util.ArrayList;
//import modelo.modelEmpleado;

public class RetoCallCenter {

    public static void main(String[] args) {
        // TODO code application logic here
        CallCenter liquidacion = new CallCenter();
        
        ArrayList<Double> nominas = new ArrayList<>();
        ArrayList<Double> prestaciones = new ArrayList<>();
        ArrayList<Empleado> listEmpleado = new ArrayList<>();
        
        // Instancias de Empleados --  null 
        Empleado empleado0 = new Empleado();
        listEmpleado.add(empleado0);
        
        Empleado empleado1 = new Empleado(1,"Carmen", "Perez", 40000, true, 1500000);
        listEmpleado.add(empleado1);
        
        Empleado empleado2 = new Empleado(2,"Pablo", "Castro", 25000, true, 1200000);
        listEmpleado.add(empleado2);
        
        Empleado empleado3 = new Empleado(3,"Laura", "Ortiz",50000, false, 2000000);
        listEmpleado.add(empleado3);
        
        /*modelEmpleado empleado4 = new modelEmpleado();
        if(empleado4.consultaEmpleadoId("5") != null){
            listEmpleado.add(empleado4.consultaEmpleadoId("5"));
        }*/                
        
        System.out.println("Liquidacion Nomina");
        nominas = liquidacion.liquidarNominaEmp(listEmpleado);
        for (int i = 0; i < nominas.size(); i++) {
            System.out.println("Nombre: "+ listEmpleado.get(i).getNombre() +" Total a pagar: " + Math.round(nominas.get(i)));
        }
        System.out.println("Prestaciones Sociales");
        prestaciones = liquidacion.liquidarPrestacionesEmp(listEmpleado);
        for (int i = 0; i < prestaciones.size(); i++) {
            System.out.println("Nombre: "+ listEmpleado.get(i).getNombre() +" Total a pagar: " + Math.round(prestaciones.get(i)));
        }
        
    }
    
}
