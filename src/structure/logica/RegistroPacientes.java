package structure.logica;

import structure.implementacion.DynamicPriorityQueueADT;

import structure.persona.Paciente;
import structure.persona.Medico;
import structure.implementacion.DynamicLinkedList;

public class RegistroPacientes {

    private final String PRIORIDAD_ALTA = "ALTA";
    private final String PRIORIDAD_MEDIA = "MEDIA";
    private final String PRIORIDAD_BAJA = "BAJA";

    private DynamicPriorityQueueADT cola;
    private DynamicLinkedList pacientes;
    private DynamicLinkedList medicos;

    private int idActual;

    public RegistroPacientes() {
        cola = new DynamicPriorityQueueADT();
        pacientes = new DynamicLinkedList();
        medicos = new DynamicLinkedList();
        idActual = 0;
        siguienteIdMedico = 0;
    }


    public void registrarPaciente(String nombre, String apellido, String fechaNacimiento, String prioridad) {
        Paciente paciente = new Paciente(nombre, apellido, fechaNacimiento, idActual);
        pacientes.add(paciente.getId());

        int prioridadNumerica = asignarPrioridad(prioridad);
        if(prioridadNumerica != -1){
            cola.add(idActual, prioridadNumerica);
            idActual++;
        } else{
            System.out.println("La prioridad ingresada no es valida. Ejemplos validos: ALTA, MEDIA, BAJA");
        }
    }

    public int asignarPrioridad(String prioridad){
        int numeroPrioridad = -1;
        switch(prioridad.toUpperCase()){
            case PRIORIDAD_ALTA:
                numeroPrioridad = 1;
                break;
            case PRIORIDAD_MEDIA:
                numeroPrioridad = 2;
                break;
            case PRIORIDAD_BAJA:
                numeroPrioridad = 3;
                break;
            default: return numeroPrioridad;
        }

        return numeroPrioridad;
    }
}