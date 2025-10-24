/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */


public class VehiculoLiviano extends Vehiculo {
    private String zona;
    private double capacidad;

    public VehiculoLiviano() {
        super();
    }

    public VehiculoLiviano(int id, String placa, String marca, String modelo, String estado,
                           String zona, double capacidad) {
        super(id, placa, marca, modelo, estado);
        this.zona = zona;
        this.capacidad = capacidad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Zona: " + zona);
        System.out.println("Capacidad: " + capacidad + " toneladas");
    }
}