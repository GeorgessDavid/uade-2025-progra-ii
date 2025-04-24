package structure.utils;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int valor = -1;

        try {
            valor = scanner.nextInt();
        }catch(Exception e){
            System.out.println("Error al leer " + mensaje);
        }
        scanner.nextLine();
        return valor;
    }

    public static String leerPrioridad() {

        while (true) {
            String prioridad = leerString("Prioridad (ALTA / MEDIA / BAJA): ");
            if (prioridad.equals("ALTA") || prioridad.equals("MEDIA") || prioridad.equals("BAJA")) {
                return prioridad;
            }
            System.out.println("Prioridad inválida. Ingrese ALTA, MEDIA o BAJA.");
        }
    }
}
