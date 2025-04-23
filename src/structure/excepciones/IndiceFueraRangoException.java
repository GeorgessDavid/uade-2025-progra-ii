package structure.excepciones;

public class IndiceFueraRangoException extends RuntimeException {
    public IndiceFueraRangoException(String message) {
        super(message);
    }

    public IndiceFueraRangoException(int index) {
        super("El indice "+index+" se encuentra fuera de rango.");
    }
}
