/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.setConductor(conductor);
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public Motor getMotor() { return motor; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
}