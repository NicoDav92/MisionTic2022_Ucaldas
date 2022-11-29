/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Cliente {  
    // Atributos       //cl1      cl2
    private String idCliente; // 001  --- 002
    private String nombreCliente; // Juan --- Ivan
    private int diaCompra; // 3 --- 6
    private int subTotal; // 15000 --- 30000
    private double totalApagar; // Calculado
    
    // Constructor  (intanciar) 
    public Cliente(String idCliente, String nombreCliente, int diaCompra, int subTotal) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.diaCompra = diaCompra;
        this.subTotal = subTotal;
    }
    
    // set y get (encapsulamiento)
    
    public double getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(double totalApagar) {
        this.totalApagar = totalApagar;
    }
    
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDiaCompra() {
        return diaCompra;
    }

    public void setDiaCompra(int diaCompra) {
        this.diaCompra = diaCompra;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    
    // Metodos logica del negocio
    public double calculoTotal(int dia, int sub_total){
        double totalPagar = 0;
        switch (dia) {
            case 1 -> totalPagar += (sub_total * 0.95);
            case 2 -> totalPagar += (sub_total * 0.97);
            case 3 -> totalPagar += (sub_total * 0.90);
            case 4 -> totalPagar += (sub_total * 0.96);
            case 5 -> totalPagar += (sub_total * 0.94);
            case 6 -> totalPagar += (sub_total * 0.98);
            case 7 -> totalPagar += (sub_total * 0.99);
            default -> System.out.println("Dia incorrecto");
        }
        //totalPagar = (int)(totalPagar + (sub_total * 0.95));
        
        return totalPagar;
    }
    
}
