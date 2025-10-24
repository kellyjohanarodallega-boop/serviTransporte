/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author acer
 */
public class Empleado {

    // Atributos
    private String usuario;
    private String clave;
    private String nombre;
    private String cargo;

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con parámetros
    public Empleado(String usuario, String clave, String nombre, String cargo) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método para mostrar información del empleado
    public void mostrarInfo() {
        System.out.println("===== Información del Empleado =====");
        System.out.println("Usuario: " + usuario);
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
    }
}

