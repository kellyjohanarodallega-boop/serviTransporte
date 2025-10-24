/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package servicio;

/**
 *
 * @author hp
 */

import java.util.ArrayList;

public class Servicio implements MostrarInformacion {
    // Atributos
    private int idServicio;
    private String fecha;
    private String origen;
    private String destino;
    private Cliente cliente;
    private Conductor conductorAsignado;
    private Vehiculo vehiculoAsignado;
    private ArrayList<Minuta> minuta;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Servicio(int idServicio, String fecha, String origen, String destino,
                    Cliente cliente, Conductor conductorAsignado, Vehiculo vehiculoAsignado,
                    ArrayList<Minuta> minuta, ArrayList<Empleado> empleados) {
        this.idServicio = idServicio;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cliente = cliente;
        this.conductorAsignado = conductorAsignado;
        this.vehiculoAsignado = vehiculoAsignado;
        this.minuta = minuta;
        this.empleados = empleados;
    }

    Servicio(int id, String fecha, String origen, String destino, Cliente cliente, Conductor conductor, Vehiculo vehiculo, Minuta minuta, String empleadoActual) {
        
    }

    // Getters y Setters
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conductor getConductorAsignado() {
        return conductorAsignado;
    }

    public void setConductorAsignado(Conductor conductorAsignado) {
        this.conductorAsignado = conductorAsignado;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }

    public ArrayList<Minuta> getMinuta() {
        return minuta;
    }

    public void setMinuta(ArrayList<Minuta> minuta) {
        this.minuta = minuta;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    // Implementación del método de la interfaz
    @Override
    public void mostrarInformacion() {
        System.out.println("=== Detalle del Servicio ===");
        System.out.println("ID Servicio: " + idServicio);
        System.out.println("Fecha: " + fecha);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Cliente: " + (cliente != null ? cliente.getNombre() : "Sin asignar"));
        System.out.println("Conductor: " + (conductorAsignado != null ? conductorAsignado.getNombre() : "Sin asignar"));
        System.out.println("Vehículo: " + (vehiculoAsignado != null ? vehiculoAsignado.getPlaca() : "Sin asignar"));

        System.out.println("\n--- Minutas registradas ---");
        if (minuta != null && !minuta.isEmpty()) {
            for (Minuta m : minuta) {
                System.out.println("Hora: " + m.getHora() + " | Observación: " + m.getObservacion());
            }
        } else {
            System.out.println("No hay minutas registradas.");
        }

        System.out.println("\n--- Empleados asociados ---");
        if (empleados != null && !empleados.isEmpty()) {
            for (Empleado e : empleados) {
                System.out.println("Empleado: " + e.getNombre());
            }
        } else {
            System.out.println("No hay empleados asociados.");
        }
    }

    String getEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
