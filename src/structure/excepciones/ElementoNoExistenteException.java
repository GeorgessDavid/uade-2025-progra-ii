package structure.excepciones;

public class ElementoNoExistenteException extends RuntimeException {
    public ElementoNoExistenteException(String message) {
        super(message);
    }

    public ElementoNoExistenteException(int elemento){
        super("El elemento " + elemento + " no existe");
    }
}
