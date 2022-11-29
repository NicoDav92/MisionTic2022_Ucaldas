package modelo;

public class BdData {
    
    // Atributos
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/sistemadenomina";
    
    // get
    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }
}
