package structure;

import structure.logica.RegistroPacientes;
import structure.logica.GestionMedicos;
import structure.utils.InputUtils;

import structure.persona.Medico;

public class Main{

    public static void main(String[] args) {

        RegistroPacientes registro = new RegistroPacientes();
        GestionMedicos gestion = new GestionMedicos();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Paciente"); //
            System.out.println("2. Registrar Médico"); //
            System.out.println("3. Asignar Médico a Paciente"); //
            System.out.println("4. Atender Paciente");
            System.out.println("5. Mostrar Pacientes Atendidos");
            System.out.println("6. Salir");

            int opcion = InputUtils.leerEntero("Opción: ");

            switch (opcion) {
                case 1:
                    String nombre = InputUtils.leerString("Nombre: ");
                    String apellido = InputUtils.leerString("Apellido: ");
                    String fecha = InputUtils.leerString("Fecha de nacimiento: ");
                    String prioridad = InputUtils.leerPrioridad();

                    registro.registrarPaciente(nombre, apellido, fecha, prioridad);
                    break;

                case 2:
                    String nombreM = InputUtils.leerString("Nombre: ");
                    String apellidoM = InputUtils.leerString("Apellido: ");
                    String fechaM = InputUtils.leerString("Fecha de nacimiento: ");

                    gestion.altaMedico(nombreM, apellidoM, fechaM);
                    break;

//                case 3:
//                    int idPaciente = InputUtils.leerEntero("ID del Paciente: ");
//                    int idMedico = InputUtils.leerEntero("ID del Médico: ");
//
//                    gestion.asignarMedico(idPaciente, idMedico);
//
//                    break;

//                case 4:
//                    atencion.atenderSiguientePaciente();
//                    break;
//
//                case 5:
//                    atencion.mostrarPacientesAtendidos(repositorio);
//                    break;
//
                  case 6:
                      salir = true;
                      break;
//
//                default:
//                    System.out.println("Opción no válida");
            }
        }

    }
}