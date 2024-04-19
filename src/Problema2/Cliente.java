package Problema2;

public class Cliente {
    public static void main(String[] args) {
        IServicioWeb proxy = new ProxyServicioWeb();
        proxy.solicitarRecurso("http://sitio1.com/recurso");
        proxy.solicitarRecurso("http://sitio3.com/recurso");
    }
}