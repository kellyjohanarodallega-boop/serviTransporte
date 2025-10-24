/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */

public class Furgon extends Vehiculo {

    // Atributos propios
    private boolean refrigerado;
    private double capacidadC;

    // Constructor vacío
    public Furgon(int par, String ddD444, String ford, String transit, String mantenimiento, boolean par1, double par2) {
        super();
    }

    // Constructor con parámetros
    public Furgon(boolean refrigerado, double capacidadC, int id, String placa, String marca, String modelo, String estado) {
        super(id, placa, marca, modelo, estado);
        this.refrigerado = refrigerado;
        this.capacidadC = capacidadC;
    }

    // Getters y Setters
    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public double getCapacidadC() {
        return capacidadC;
    }

    public void setCapacidadC(double capacidadC) {
        this.capacidadC = capacidadC;
    }

    // Implementación del método mostrarInfo()
    @Override
    public void mostrarInfo() {
        System.out.println("===== Información del Furgón =====");
        System.out.println("ID: " + id);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("Refrigerado: " + (refrigerado ? "Sí" : "No"));
        System.out.println("Capacidad de carga: " + capacidadC + " toneladas");
    }
}
