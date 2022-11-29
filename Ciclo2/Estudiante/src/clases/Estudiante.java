/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Estudiante {
    // Atributos
    private String nombreEstudiante;
    private float nota1;
    private float nota2;
    private float nota3;
    private float definitiva;

    // Constructor
    public Estudiante(String nombreEstudiante, float nota1, float nota2, float nota3) {
        this.nombreEstudiante = nombreEstudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    // set y get

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }
    
    // Metodo logica del negocio
    public void mostrarDefinitiva(){
        System.out.format("Estudiante: "+ getNombreEstudiante() + 
                           "\nNota 1: "+ getNota1() + 
                           "\nNota 2: "+ getNota2() + 
                           "\nNota 3: "+ getNota3() +
                           "\nDefinitiva: %.2f", getDefinitiva()
                           );
        System.out.println();
    }
    
    
    public void promedio(float nota1,float nota2, float nota3){
        float promedio = ((nota1 + nota2 + nota3) / 3);
        setDefinitiva(promedio);
        mostrarDefinitiva();
    }
    
    
}
