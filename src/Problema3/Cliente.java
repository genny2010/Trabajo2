package Problema3;

public class Cliente {
    public static void main(String[] args) {
        // Simulacion estructura del sistema de archivos
        Carpeta raiz = new Carpeta("Raíz");
        Carpeta documentos = new Carpeta("Documentos");
        Carpeta imagenes = new Carpeta("Imágenes");
        Archivo archivo1 = new Archivo("Archivo1.txt");
        Archivo archivo2 = new Archivo("Archivo2.jpg");

        raiz.agregarElemento(documentos);
        raiz.agregarElemento(imagenes);
        documentos.agregarElemento(archivo1);
        imagenes.agregarElemento(archivo2);

        raiz.mostrarInfo();
    }
}