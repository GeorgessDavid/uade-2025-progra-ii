package structure.excepciones;

public class EstructuraVaciaException extends RuntimeException {
    public EstructuraVaciaException(){
        super("La estructura de datos esta vacia");
    }

    public EstructuraVaciaException(String mensaje){ super(mensaje);}
}
