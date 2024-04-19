package Problema3;

public class Archivo implements ElementoFileSystem {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Archivo: " + nombre);
    }
}
