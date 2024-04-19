package Problema2;

public class ServicioWebReal implements IServicioWeb {
    @Override
    public void solicitarRecurso(String url) {
        System.out.println("Solicitando recurso a la URL: " + url);
    }
}
