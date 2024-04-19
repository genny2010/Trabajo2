package Problema1;

public class CorreoNotificacion implements INotificacion {
    private String mensaje;
	
	public CorreoNotificacion(String mensaje) {
		this.mensaje = mensaje;
	}
    
	@Override
	public void enviar() {
        System.out.println("Enviando notificación por correo: " + mensaje);
    }
}
