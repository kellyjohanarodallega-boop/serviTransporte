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
    private boolean refrigerado;
    private double capacidadC;

    public Furgon() {
        super();
    }

    public Furgon(int id, String placa, String marca, String modelo, String estado,
                  boolean refrigerado, double capacidadC) {
        super(id, placa, marca, modelo, estado);
        this.refrigerado = refrigerado;
        this.capacidadC = capacidadC;
    }

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
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Refrigerado: " + (refrigerado ? "Sí" : "No"));
        System.out.println("Capacidad de carga: " + capacidadC + " toneladas");
    }
}