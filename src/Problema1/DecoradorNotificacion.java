package Problema1;

public abstract class DecoradorNotificacion implements INotificacion {
    protected INotificacion deoratednotificacion;

    public DecoradorNotificacion(INotificacion deoratednotificacion) {
        this.deoratednotificacion = deoratednotificacion;
    }
    
@Override
    public void enviar() {
    	deoratednotificacion.enviar();
    }
}