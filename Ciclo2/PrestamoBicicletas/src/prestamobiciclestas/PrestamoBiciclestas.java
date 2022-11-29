/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prestamobiciclestas;

import controlador.Bicicleta;
import controlador.Estacion;
import controlador.Prestamo;

public class PrestamoBiciclestas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Caso de Prueba # 1
        
        // Crear instancias de Prestamos Historicos
        Prestamo p1 = new Prestamo(2163, "B33", "Premium");
        Prestamo p2 = new Prestamo(6347, "B34", "Standard");
        Prestamo p3 = new Prestamo(8564, "D45", "Standard");
        Prestamo p4 = new Prestamo(1244, "B22", "Premium");
        Prestamo p5 = new Prestamo(2163, "B33", "Premium");
        Prestamo p6 = new Prestamo(2163, "B45", "Standard");
        Prestamo p7 = new Prestamo(1244, "B11", "Standard");
        Prestamo p8 = new Prestamo(2163, "B07", "Premium");
        Prestamo p9 = new Prestamo(1244, "D12", "Standard");
        Prestamo p10 = new Prestamo(2163, "D45", "Standard");
        Prestamo p11 = new Prestamo(2163, "C12", "Premium");
        
        // Guardamos las 11 instancias en el array de Prestamo
        Prestamo[] historalPrestamo = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11};
        
        // Nuevo prestamos
        Prestamo nuevoPrestamo = new Prestamo(2163, "B34", "Premium");
        
        System.out.println("Reto Prestamo Bicicleta 1 Parte");        
        System.out.println("Id: " + nuevoPrestamo.getIdUsuario()+
                           "\nBicicleta: " + nuevoPrestamo.getIdBicicleta() +
                           "\nModelo: " + nuevoPrestamo.getModeloBicleta()+
                           "\nDescuento: " + nuevoPrestamo.consultarDescuento(historalPrestamo, nuevoPrestamo));
        
        

        System.out.println("Reto Prestamo Bicicleta 2 Parte");   
        System.out.println("TOP 3 Estaciones con mas prestamos");
        
        // Crear instancias de Bicicletas por cada estacion
        
        Bicicleta b1 = new Bicicleta("B33", "Premium");
        Bicicleta b2 = new Bicicleta("B34", "Standard");
        Bicicleta b3 = new Bicicleta("D45", "Standard");
        Bicicleta b4 = new Bicicleta("B22", "Premium");
        Bicicleta b5 = new Bicicleta("B33", "Premium");
        Bicicleta b6 = new Bicicleta("B45", "Standard");
        Bicicleta b7 = new Bicicleta("B11", "Standard");
        Bicicleta b8 = new Bicicleta("B07", "Premium");
        Bicicleta b9 = new Bicicleta("D12", "Standard");
        Bicicleta b10 = new Bicicleta("D45", "Standard");
        Bicicleta b11 = new Bicicleta("C12", "Premium");
        Bicicleta bicicletas[] = {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11};
        
        Estacion e1 = new Estacion("Pies Descalsos", bicicletas, 250);
        Estacion e2 = new Estacion("Rosales",bicicletas, 800);
        Estacion e3 = new Estacion("MiraFlores",bicicletas, 220);
        Estacion e4 = new Estacion("Campo amor",bicicletas, 220);
        Estacion e5 = new Estacion("San Cristobal",bicicletas, 300);
        
        Estacion estaciones[] = {e1,e2,e3,e4,e5};
        
        Estacion estacionesMasUsadas[] = Estacion.consultarEstacionesMasUsadas(estaciones);
        for (int i = 0; i < estacionesMasUsadas.length; i++) {
            System.out.println("Ubicaciones: "+estacionesMasUsadas[i].getUbicacion());
            System.out.println("Cantidad de prestamos: "+estacionesMasUsadas[i].getCantidadPrestamos());
            System.out.println("******************************");
        }
        
        System.out.println("Reto Prestamo Bicicleta 2 Parte");   
        System.out.println("Balance Bicicletas");
        
        Estacion BalanceBicicletas = new Estacion(bicicletas);
        BalanceBicicletas.getBalanceBicicletas();
        
    }
    
}

