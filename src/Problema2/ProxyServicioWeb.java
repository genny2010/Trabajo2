package Problema2;

public class ProxyServicioWeb implements IServicioWeb {
    private ServicioWebReal servicioReal;
    private String[] sitiosRestringidos = {"sitio1.com", "sitio2.com"};

    public ProxyServicioWeb() {
        this.servicioReal = new ServicioWebReal();
    }

    @Override
    public void solicitarRecurso(String url) {
        for (String sitio : sitiosRestringidos) {
            if (url.contains(sitio)) {
                System.out.println("Acceso denegado a " + url);
                return;
            }
        }
        servicioReal.solicitarRecurso(url);
    }
}