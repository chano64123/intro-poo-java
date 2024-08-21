package SistemaGestion.Helper;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {
    public final static Scanner sc = new Scanner(System.in);
    public final static DecimalFormat df = new DecimalFormat("#.00");

    public static final int CRITERIO_NOMBRE = 1;
    public static final int CRITERIO_EDAD = 2;
    public static final int CRITERIO_SALARIO = 3;
    public static final int CRITERIO_DEPARTAMENTO = 4;

    public static int pedirNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static double pedirNumeroDecimal(String mensaje) {
        double numero = 0.0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextDouble();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static String pedirTexto(String mensaje) {
        String texto = "";
        System.out.print(mensaje);
        while (true) {
            try {
                texto = sc.nextLine();
                if (!texto.trim().isEmpty()) {
                    break;
                } else {
                    System.out.print("No ingreso un texto valido, intente nuevamente: ");
                }
            } catch (Exception e) {
                System.out.print("Hubo un error, intente nuevamente: ");
            }
        }
        return texto;
    }
}
