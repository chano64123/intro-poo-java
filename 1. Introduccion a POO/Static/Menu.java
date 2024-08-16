package Static;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        Rectangulo rectangulo = new Rectangulo(0, 0);
        while (opcion != 5) {
            ImprimirMenu();
            opcion = PedirNumeroEntero("Ingrese una opcion: ");
            System.out.println();
            switch (opcion) {
                case 1-> {
                    double alto = PedirNumeroDecimal("Ingrese el alto: ");
                    double ancho = PedirNumeroDecimal("Ingrese el ancho: ");
                    rectangulo = new Rectangulo(alto, ancho);
                }
                case 2 -> rectangulo.imprimirArea();
                case 3 -> rectangulo.imprimirPerimetro();
                case 4 -> Rectangulo.imprimirTotalRectangulos();
                case 5 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
        }
        sc.close();
    }

    public static void ImprimirMenu() {
        System.out.println();
        System.out.println("MENU DE OPCIONES");
        System.out.println("================");
        System.out.println("1. Crear Rectangulo");
        System.out.println("2. Ver area del ultimo rectangulo");
        System.out.println("3. Ver perimetro del ultimo rectangulo");
        System.out.println("4. Ver cantidad de retangulos creados");
        System.out.println("5. Salir");
    }

    public static int PedirNumeroEntero(String mensaje) {
        int numero = 0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }

    public static double PedirNumeroDecimal(String mensaje) {
        double numero = 0.0;
        System.out.print(mensaje);
        while (true) {
            try {
                numero = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.print("No ingreso un numero, intente nuevamente:");
            }
        }
        return numero;
    }
}
