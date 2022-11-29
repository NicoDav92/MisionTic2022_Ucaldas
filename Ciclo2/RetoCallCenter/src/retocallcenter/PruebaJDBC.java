package retocallcenter;
import java.sql.*;

public class PruebaJDBC {
    
    public static void main(String[] args) {
        
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/sistemadenomina";
        
        Connection conn;
        try {
            
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if(conn != null){
                System.out.println("Conexion exitosa");
            }else{
                System.out.println("Error en la conexion");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
