/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Personal
 */
public class Cuenta {
    //Atributos
    private String numeroCuenta;
    private String nombreCuenta;
    private int saldoCuenta;
    
    //Constructor 
    public Cuenta(String numeroCuenta, String nombreCuenta, int saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCuenta = nombreCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    

    public Cuenta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Set(Asignar valores a los atributos) y get(Obtener valor de los atributos)

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public int getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(int saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    
    //Metodos
    public void mostrarSaldo(){
        System.out.println("Cliente: "+ getNombreCuenta() +
                "\nCuenta: "+ getNumeroCuenta()+
                "\nSaldo: "+ getSaldoCuenta());
                
        
    }
    public void girar(int valor){
        if(valor > getSaldoCuenta()){
            System.out.println("Movimiento no permitido");
        }else{
            int nuevoSaldo = (getSaldoCuenta() - valor); //Aca resto el valor ingresado
            setSaldoCuenta(nuevoSaldo); 
            mostrarSaldo();
        }
        
        
    }
    
    public void depositar(int valor){
        int nuevoSaldo = (getSaldoCuenta() + valor);
               setSaldoCuenta(nuevoSaldo); 
            mostrarSaldo();
        }
    
     
}

