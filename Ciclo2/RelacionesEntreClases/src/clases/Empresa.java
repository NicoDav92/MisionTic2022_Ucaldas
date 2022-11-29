/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

public class Empresa {
    // Atributos
    // Relaciones entre clases
    // Agregacion (1..* Empresa tiene 0..* Clientes)
    ArrayList<Cliente> clientes = new ArrayList<>();
    // Composicion (1 Empresa tiene 1..* empleados)
    ArrayList<Empleado> empleados = new ArrayList<>();

    
    // Metodo
    public void addCliente(Cliente cliente){
        clientes.add(cliente);        
    }
}
