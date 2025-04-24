package structure.logica;

import structure.implementacion.DynamicLinkedList;
import structure.persona.Medico;
import structure.persona.Paciente;

import static structure.logica.RegistroPacientes.pacientes;

public class GestionMedicos {

    DynamicLinkedList medicos = new DynamicLinkedList();

    int idActual = 0;

    public void altaMedico(String nombre, String apellido, String fechaNacimiento) {
        Medico medico = new Medico(nombre, apellido, fechaNacimiento, idActual);
        medicos.add(medico.getId());

        idActual++;
    }

    public void asignarMedico(Paciente paciente, Medico medico) {
        if (medicos.isEmpty()) return;

        if (medico.isDisponible()) {
            paciente.setMedicoAsignado(medico);
            medico.setDisponible(false);
            System.out.println("Medico con id" + medico.getId() + " asignado al paciente con id " + paciente.getId());
        }
        else{
            System.out.println("Medico con id "+medico.getId()+" no esta disponible");
        }
    }

}