package controlador;

public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private int horasExtra;
    private boolean auxilioTransporte;
    private int salario;
    
    // Constructor

    public Empleado(int id, String nombre, String apellidos, int horasExtra, boolean auxilioTransporte, int salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasExtra = horasExtra;
        this.auxilioTransporte = auxilioTransporte;
        this.salario = salario;
    }
    
    public Empleado() {
    }
        
    // set y get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public boolean isAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(boolean auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    
        
}