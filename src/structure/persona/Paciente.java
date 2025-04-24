package structure.persona;

public class Paciente extends Persona {

    Medico medicoAsignado;

    public Paciente(String nombre, String apellido, String fechaNacimiento, int id) {
        super(nombre, apellido, fechaNacimiento, id);
    }

    public void setMedicoAsignado(Medico medico) {
        medicoAsignado = medico;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }
}
