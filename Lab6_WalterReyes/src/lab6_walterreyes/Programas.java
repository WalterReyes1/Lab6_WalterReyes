
package lab6_walterreyes;

import java.util.Date;


public class Programas {
private String nombre;
private int puntuación;
private String fecha;
private String tipo;
private String genero;

    public Programas() {
    }

    public Programas(int puntuación) {
        this.puntuación = puntuación;
    }

    public Programas(String nombre) {
        this.nombre = nombre;
    }

    public Programas(String nombre, int puntuación, String fecha, String tipo, String genero) {
        this.nombre = nombre;
        this.puntuación = puntuación;
        this.fecha = fecha;
        this.tipo = tipo;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre + ", puntuación: " + puntuación + ", fecha: " + fecha + ", tipo: " + tipo + ", genero: " + genero + '}';
    }


    
}
