
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante
 */
public class Empleado implements Serializable {
    private String nombre, apellido, sexo;
    private int edad;
    private double sueldo;
    private ListaDobleAmbiente ambiente = new ListaDobleAmbiente();
    public Empleado(){
        ambiente = new ListaDobleAmbiente();
    }
    public Empleado(String nombre, String apellido, String sexo, int edad, double sueldo, ListaDobleAmbiente ambiente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.sueldo = sueldo;
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
    public void mostrar(){
        System.out.println(toString());
        ambiente.mostrar();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public ListaDobleAmbiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(ListaDobleAmbiente ambiente) {
        this.ambiente = ambiente;
    }
    

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
