package modelo;

import controlador.Empleado;
import java.sql.*;
import java.util.LinkedList;

public class modelEmpleado extends BdData{

    
    public Empleado consultarEmpleadoId(String id){
        Empleado empleado = null;
        
        try (Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String sql = "SELECT `id`, `nombre`, `apellido`, `horas_extra`, `aux_transp`, `salario` \n" +
                         "FROM `tb_empleado` \n" +
                         "WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next()){
                int empID = resultado.getInt(1);
                String nombre = resultado.getString(2);
                String apellido = resultado.getString(3);
                int vlrHorasExtras = resultado.getInt(4);
                String auxTransp = resultado.getString(5);
                int salario = resultado.getInt(6);
                
                switch (auxTransp) {
                    case "true" -> empleado = new Empleado(empID, nombre, apellido, vlrHorasExtras, true, salario);
                    case "false" -> empleado = new Empleado(empID, nombre, apellido, vlrHorasExtras, false, salario);
                    default -> throw new AssertionError();
                }
            }
            
            stmt.close();
            resultado.close();
            
            return empleado;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return empleado;
    }
    
    public boolean crearEmpleado(String nombre, String apellido, int horasExtras, boolean auxTransp, int salario){
        
        try (Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String aux_tranp;
            if(auxTransp){
                aux_tranp = "true";
            }else{
                aux_tranp = "false";
            }
            
            
            String sql = "INSERT INTO `tb_empleado`(`nombre`,  `apellido`,`horas_extra`, `aux_transp`, `salario`) \n" +
                         "VALUES (?,?,?,?,?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setInt(3, horasExtras);
            stmt.setString(4, aux_tranp);
            stmt.setInt(5, salario);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }
    
    public boolean editarEmpleado(String id, String nombre, String apellido, int horasExtras, boolean auxTransp, int salario){
        
        try (Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String aux_tranp;
            if(auxTransp){
                aux_tranp = "true";
            }else{
                aux_tranp = "false";
            }
            
            
            String sql = "UPDATE `tb_empleado` \n" +
                         "SET `nombre`=?,`apellido`=?,`horas_extra`=?,`aux_transp`=?,`salario`=? \n" +
                         "WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setInt(3, horasExtras);
            stmt.setString(4, aux_tranp);
            stmt.setInt(5, salario);
            stmt.setString(6, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }
    
    public boolean eliminarEmpleado(String id){
        
         try (Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
           
            
            String sql = "DELETE \n" +
                         "FROM `tb_empleado` \n" +
                         "WHERE id = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, id);
            
            stmt.executeUpdate();
            
            stmt.close();
            
            return true;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return false;
    }
    
    public LinkedList<Empleado> listaEmpleado(){
        LinkedList<Empleado> listaEmpleado = new LinkedList<>();
        Empleado empleado;
         
        try (Connection conn = DriverManager.getConnection(getUrl(), getUser(), getPassword())) {
            
            String sql = "SELECT `id`, `nombre`, `apellido`, `horas_extra`, `aux_transp`, `salario`\n" +
                     "FROM `tb_empleado` ";
            
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery(sql);
            
            while(resultado.next()){
                int empID = resultado.getInt(1);
                String nombre = resultado.getString(2);
                String apellido = resultado.getString(3);
                int vlrHorasExtras = resultado.getInt(4);
                String auxTransp = resultado.getString(5);
                int salario = resultado.getInt(6);
                
                switch (auxTransp) {
                    case "true" -> empleado = new Empleado(empID, nombre, apellido, vlrHorasExtras, true, salario);
                    case "false" -> empleado = new Empleado(empID, nombre, apellido, vlrHorasExtras, false, salario);
                    default -> throw new AssertionError();
                }
                
                listaEmpleado.add(empleado);
            }
            
            stmt.close();
            resultado.close();
            
            return listaEmpleado;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return listaEmpleado;        
    }
    
}

