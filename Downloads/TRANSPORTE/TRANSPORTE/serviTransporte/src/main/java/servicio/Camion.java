/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

public class Camion extends Vehiculo {

    // Atributos propios
    private int numeroEjes;
    private double capacidadC;

    // Constructor vacío
    public Camion(int par, String ccC333, String mercedes, String actros, String disponible, int par1, double par2) {
        super();
    }

    // Constructor con parámetros
    public Camion(int numeroEjes, double capacidadC, int id, String placa, String marca, String modelo, String estado) {
        super(id, placa, marca, modelo, estado);
        this.numeroEjes = numeroEjes;
        this.capacidadC = capacidadC;
    }

    // Getters y Setters
    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
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
        System.out.println("===== Información del Camión =====");
        System.out.println("ID: " + id);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + estado);
        System.out.println("Número de ejes: " + numeroEjes);
        System.out.println("Capacidad de carga: " + capacidadC + " toneladas");
    }
}
