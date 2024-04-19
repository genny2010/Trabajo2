package Problema3;
import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ElementoFileSystem {
    private String nombre;
    private List<ElementoFileSystem> elementos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(ElementoFileSystem elemento) {
        elementos.add(elemento);
    }

    public void mostrarInfo() {
        System.out.println("Carpeta: " + nombre);
        for (ElementoFileSystem elemento : elementos) {
            elemento.mostrarInfo();
        }
    }
}
