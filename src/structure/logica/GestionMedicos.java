package structure.logica;

import structure.implementacion.DynamicLinkedList;
import structure.persona.Medico;
import structure.persona.Paciente;

public class GestionMedicos {

    DynamicLinkedList medicos = new DynamicLinkedList();
    int idActual = 0;

    public void altaMedico(String nombre, String apellido, String fechaNacimiento) {
        Medico medico = new Medico(nombre, apellido, fechaNacimiento, idActual);

        // Agregar linked list de medicos, no de ids
        medicos.add(medico.getId());

        idActual++;
    }

    public void asignarMedico(Paciente paciente) {
        if(medicos.isEmpty()) return;

        for(int i = 0; i < medicos.size(); i++) {
            // Linked list de medicos -> if(medicos.get(i).getDisponibilidad) asignar medico al paciente
            System.out.println(medicos.get(i));
        }
    }

    public static void main(String[] args) {

        Paciente p = new Paciente("a","b","c",2);
        GestionMedicos g = new GestionMedicos();

        g.altaMedico("a","b","c");
        g.asignarMedico(p);
    }
}