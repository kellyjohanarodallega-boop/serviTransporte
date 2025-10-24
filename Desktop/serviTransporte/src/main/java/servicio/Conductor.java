/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */
public class Conductor {
    
    private int id;
    private String nombre;
    private String licencia;
    private int telefono;
    private String direccion;

   
    public Conductor() {
    }

    
    public Conductor(int id, String nombre, String licencia, int telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.licencia = licencia;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    
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

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public void mostrarInfo() {
        System.out.println("Conductor ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Licencia: " + licencia);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
    }
    
}
