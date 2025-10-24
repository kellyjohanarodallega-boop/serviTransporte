/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */
public class Cliente {
    // Atributos
    private String nombre;
    private int cc;             
    private String natural;     
    private String juridica;    

    
    public Cliente() {
    }

    
    public Cliente(String nombre, int cc, String natural, String juridica) {
        this.nombre = nombre;
        this.cc = cc;
        this.natural = natural;
        this.juridica = juridica;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNatural() {
        return natural;
    }

    public void setNatural(String natural) {
        this.natural = natural;
    }

    public String getJuridica() {
        return juridica;
    }

    public void setJuridica(String juridica) {
        this.juridica = juridica;
    }

    
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Cédula: " + cc);
        System.out.println("Natural: " + natural);
        System.out.println("Jurídica: " + juridica);
    }

    public boolean equalsIgnoreCase(String otroNombre) {
        return this.nombre.equalsIgnoreCase(otroNombre);
    }
}

