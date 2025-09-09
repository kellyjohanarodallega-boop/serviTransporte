/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package servicio;

/**
 *
 * @author hp
 */

public class Servicio {
    private int idServicio;
    private String fecha;
    private String origen;
    private String destino;
    private Cliente cliente;
    private Conductor conductorAsignado;
    private Vehiculo vehiculoAsignado;
    private Minuta minuta;
    private String empleado;

    public Servicio(int idServicio, String fecha, String origen, String destino,
                    Cliente cliente, Conductor conductorAsignado, 
                    Vehiculo vehiculoAsignado, Minuta minuta, String empleado) {
        this.idServicio = idServicio;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cliente = cliente;
        this.conductorAsignado = conductorAsignado;
        this.vehiculoAsignado = vehiculoAsignado;
        this.minuta = minuta;
        this.empleado = empleado;
    }

    
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

    public Minuta getMinuta() {
        return minuta;
    }

    public void setMinuta(Minuta minuta) {
        this.minuta = minuta;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void mostrarInfo() {
        System.out.println("Servicio ID: " + idServicio);
        System.out.println("Fecha: " + fecha);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Empleado: " + empleado);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombre());
        }
        if (conductorAsignado != null) {
            System.out.println("Conductor: " + conductorAsignado.getNombre());
        }
        if (vehiculoAsignado != null) {
            System.out.println("Vehiculo: " + vehiculoAsignado.getPlaca());
        }
        if (minuta != null) {
            System.out.println("Minuta: " + minuta.getAsunto());
        }
    }
}