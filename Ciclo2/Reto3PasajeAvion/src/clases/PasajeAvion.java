/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author Personal
 */
public class PasajeAvion {

    //Atributos
    private int idPasaje;
    private Destino destino;
    private Pasajero[] pasajeros;
    private Date fecha_compra;

    //Constructor 
    public PasajeAvion(int idPasaje, Destino destino, Pasajero[] pasajeros, Date fecha_compra) {
        this.idPasaje = idPasaje;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.fecha_compra = fecha_compra;
    
    }

    //Set y get 
    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    //Metodos logica del negocio
    
    public void MostrarDatos() {
        System.out.println("Identificacion: " + getIdPasaje()
                + "\nDestino: " + destino.getRegion()+
                
                 "\nFecha Compra: " + getFecha_compra());
         for (Pasajero pasajero : pasajeros){
             System.out.println("Idpasajero: " +pasajero.getIdPasajero()+
                    "\nNombre pasajero: "+pasajero.getNombre_pasajero()+
                     "\nEdad: "+pasajero.getEdad_pasajero());
         }
    }
    

    public double calcularTotal() {
        double Total = 0;
        for (Pasajero pasajero : pasajeros) {

            //Primer destino 
            if ("Caribe".equals(destino.getRegion())) {
                if (pasajero.getEdad_pasajero() > 15) {
                    Total = Total + 500000;
                } else {
                    Total = Total + 420000;

                }

            } //Segundo destino
            else if ("Eje Cafetero".equals(destino.getRegion())) {
                if (pasajero.getEdad_pasajero() > 13) {
                    Total = Total + 340000;
                } else {
                    Total = Total + 250000;

                }

            } // Tercer  destino
            else if ("Pacifico".equals(destino.getRegion())) {
                if (pasajero.getEdad_pasajero() > 17) {
                    Total = Total + 720000;
                } else {
                    Total = Total + 620000;

                }

            } // Si el usuario ingresa alguna otra region.
            else {
                Total = Total + 400000;

            }

        }

        return Total;

    }
}
