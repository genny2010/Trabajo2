package Problema1;

public class NotificacionConArchivo extends DecoradorNotificacion {
    private String archivo;
    
    public NotificacionConArchivo(INotificacion deoratednotificacion, String archivo) {
        super(deoratednotificacion);
        this.archivo = archivo;
    }

    @Override
    public void enviar() {
        super.enviar();
        addArchivo();
    }
    
    public void addArchivo() {
        System.out.println("Added archivo: " + archivo);
    }
}
