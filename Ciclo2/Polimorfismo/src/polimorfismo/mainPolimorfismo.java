/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package polimorfismo;

import clases.*;

public class mainPolimorfismo {

    public static void main(String[] args) {
        // TODO code application logic here
        // Creamos un arrays para guardar 4 instncia de la clase vehiculo y sus hijas
        Vehiculo misVehiculos[] = new Vehiculo[4];
        //Instancia clase padre
        misVehiculos[0] = new Vehiculo("HFE-12", "Mazda", "2020");
        //Instancias clases hijas (3) 
        misVehiculos[1] = new VehiculoDeportivo(500, "RRA-01", "Toyota", "2021");
        misVehiculos[2] = new VehiculoFurgoneta(2000, "EIR-08", "Audi", "2019");
        misVehiculos[3] = new VehiculoTurismo(5, "PJT-92", "Volwagens", "2022");
        
        //Ciclo ForLoop
        for (Vehiculo vehiculo : misVehiculos) {
            System.out.println("**********************");
            System.out.println(vehiculo.mostrarDatos());
        }
    }
    
}