/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */
public class Cisterna extends Vehiculo {
    private String tipoLiquido;
    private double capacidadT;

    public Cisterna() {
        super();
    }

    public Cisterna(int id, String placa, String marca, String modelo, String estado,
                    String tipoLiquido, double capacidadT) {
        super(id, placa, marca, modelo, estado);
        this.tipoLiquido = tipoLiquido;
        this.capacidadT = capacidadT;
    }

public String getTipoLiquido() {
        return tipoLiquido;
    }

    public void setTipoLiquido(String tipoLiquido) {
        this.tipoLiquido = tipoLiquido;
    }

    public double getCapacidadT() {
        return capacidadT;
    }

    public void setCapacidadT(double capacidadT) {
        this.capacidadT = capacidadT;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de líquido: " + tipoLiquido);
        System.out.println("Capacidad del tanque: " + capacidadT + " litros");
    }
}