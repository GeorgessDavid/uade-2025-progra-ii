package structure.excepciones;

public class EstructuraLlenaException extends RuntimeException {

    public EstructuraLlenaException(){
        super("La estructura de datos ha alcanzado su capacidad maxima");
    }
    public EstructuraLlenaException(String message) {
        super(message);
    }
}
