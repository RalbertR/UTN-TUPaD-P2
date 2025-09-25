
package Ejercicio1;

class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;

    }

    public String getNumero() {
        return numero; 
    }
    public void setNumero(String numero) {
        this.numero = numero; 
    }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision; 
    }

    public Foto getFoto() {
        return foto; 
    }
    public void setFoto(Foto foto) {
        this.foto = foto; 
    }

    public Titular getTitular() {
        return titular; 
    }
    public void setTitular(Titular titular) { 
        this.titular = titular;
    }
}