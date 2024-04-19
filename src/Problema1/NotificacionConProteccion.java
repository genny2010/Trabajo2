package Problema1;

public class NotificacionConProteccion extends DecoradorNotificacion {
    public NotificacionConProteccion(INotificacion deoratednotificacion) {
        super(deoratednotificacion);
    }

    @Override
    public void enviar() {
    	protegerNotificacion();
        super.enviar();
    }
    
    public void protegerNotificacion() {
        System.out.println("Protegiendo notificación...");
    }
}
