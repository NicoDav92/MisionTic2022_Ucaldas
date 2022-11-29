/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Vehiculo {
    // Atributos
    protected String matricula;
    protected String marca;
    protected String modelo;
    
    // Constructor

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    // set y get

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // logicas del negocio

    public String mostrarDatos(){
        return "Matricula: " + getMatricula() + 
               "\nMarca: " + getMarca() + 
               "\nModelo: " + getModelo();
    }   
    
    
}

