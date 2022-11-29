/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Conexion() {
        try {
            //Indica al interprete de java que en tiempo real mande a cargaar la libreria JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Variable de conexion obteniendo el servidor, usuario, password
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", ""); //Despues de root sigue el password
        } catch (ClassNotFoundException | SQLException e) {//alt + 124 --> 124
            System.out.println("No Conectado");
        }
    }

    public Connection getConnection() {
        return con;
    }
}
