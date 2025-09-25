/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
        this.setTitular(titular);
    }

    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }

    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuentaBancaria(this);
        }
    }
}