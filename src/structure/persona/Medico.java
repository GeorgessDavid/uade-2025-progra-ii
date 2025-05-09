package structure.persona;

public class Medico extends Persona{

    private boolean disponible = true;

    public Medico(String nombre, String apellido, String fechaNacimiento, int id) {
        super(nombre, apellido, fechaNacimiento, id);
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

