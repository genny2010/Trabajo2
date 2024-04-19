package Problema1;

public class Main {
    public static void main(String[] args) {
        INotificacion Correo1 = new CorreoNotificacion("¡Hola! Esta es una notificación por correo.");
        INotificacion CorreoConArchivo = new NotificacionConArchivo (Correo1, "Libro.pdf");
        CorreoConArchivo.enviar();
        
        INotificacion Correo2 = new CorreoNotificacion("¡Hola! Esta es una notificación por correo.");
        INotificacion CorreoConArchivo2 = new NotificacionConArchivo (Correo2, "Captura.jpg");
        INotificacion CorreoConArchivoYProteccion = new NotificacionConProteccion(CorreoConArchivo2);
        
        CorreoConArchivoYProteccion.enviar();
    }
}
