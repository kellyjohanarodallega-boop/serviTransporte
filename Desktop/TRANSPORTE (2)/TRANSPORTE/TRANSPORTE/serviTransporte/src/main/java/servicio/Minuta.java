/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

/**
 *
 * @author hp
 */
public class Minuta {
        private String hora;
    private String fecha;
    private String asunto;
    private String nota;

    
    public Minuta() {
    }

    
    public Minuta(String hora, String fecha, String asunto, String nota) {
        this.hora = hora;
        this.fecha = fecha;
        this.asunto = asunto;
        this.nota = nota;
    }

    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    
    public void mostrarInfo() {
        System.out.println(" Minuta");
        System.out.println("Hora: " + hora);
        System.out.println("Fecha: " + fecha);
        System.out.println("Asunto: " + asunto);
        System.out.println("Nota: " + nota);
    }

    String getObservacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
