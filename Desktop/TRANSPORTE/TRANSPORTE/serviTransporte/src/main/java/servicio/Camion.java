/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package servicio;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private double capacidadC;

    public Camion() {
        super();
    }

    public Camion(int id, String placa, String marca, String modelo, String estado,
                  int numeroEjes, double capacidadC) {
        super(id, placa, marca, modelo, estado);
        this.numeroEjes = numeroEjes;
        this.capacidadC = capacidadC;
    }

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

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Número de ejes: " + numeroEjes);
        System.out.println("Capacidad de carga: " + capacidadC + " toneladas");
    }
}
