/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Cliente {
    // Atributos
    private String idCliente;
    private String nombresCliente;
    private String apellidosCliente;
    private String telefonoCliente;
    //private int edadCliente;    
    
    // Contructor

    public Cliente(String idCliente, String nombresCliente, String apellidosCliente, String telefonoCliente) {
        this.idCliente = idCliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.telefonoCliente = telefonoCliente;
    }
      
    // set y get

    public String getIdCliente() {
        return idCliente; 
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
    /*public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }*/
    
    // metodos logica del negocio
    /*public void mostrarDatos(){
        System.out.println(
                           "Id Cliente: " + getIdCliente() +
                           "\nNombre: " + getNombresCliente() +
                           "\nApellido: "+ getApellidosCliente() +
                           "\nTelefono: " + getTelefonoCliente()
                           );
    }
    
    public String mostrarInfo(){
        return  "Id Cliente: " + getIdCliente() +
                "\nNombre: " + getNombresCliente() +
                "\nApellido: "+ getApellidosCliente() +
                "\nTelefono: " + getTelefonoCliente();
    }
    
    public int edadCliente(){
        return 43;
    }*/
    
    
    
}
