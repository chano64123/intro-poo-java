package FigurasGeometricas;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import FigurasGeometricas.Modelos.Circulo;
import FigurasGeometricas.Modelos.Rectangulo;
import FigurasGeometricas.Modelos.Triangulo;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            imprimirMenuPrincipal();
            opcion = pedirNumeroEntero("Ingrese una opcion: ");
            System.out.println();
            int opcionOperacion = 0;
            switch (opcion) {
                case 1 -> {
                    Circulo figura = new Circulo();
                    double radio = pedirNumeroDecimal("\tIngrese radio del circulo: ");
                    figura.setRadio(radio);
                    while (opcionOperacion != 4) {
                        imprimirMenuOperaciones();
                        opcionOperacion = pedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        switch (opcionOperacion) {
                            case 1 -> System.out.println("\tPerimetro: " + df.format(figura.perimetro()));
                            case 2 -> System.out.println("\tArea: " + df.format(figura.area()));
                            case 3 -> figura.imprimirDatos();
                            case 4 -> System.out.println("\tSeleccionaste \"Retroceder\"");
                            default -> System.out.println("\tIngresa una opcion valida.");
                        }
                        ;
                    }
                }
                case 2 -> {
                    Rectangulo figura = new Rectangulo();
                    double alto = pedirNumeroDecimal("\tIngrese alto del rectangulo: ");
                    double ancho = pedirNumeroDecimal("\tIngrese ancho del rectangulo: ");
                    figura.setAlto(alto);
                    figura.setAncho(ancho);
                    while (opcionOperacion != 4) {
                        imprimirMenuOperaciones();
                        opcionOperacion = pedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        switch (opcionOperacion) {
                            case 1 -> System.out.println("\tPerimetro: " + df.format(figura.perimetro()));
                            case 2 -> System.out.println("\tArea: " + df.format(figura.area()));
                            case 3 -> figura.imprimirDatos();
                            case 4 -> System.out.println("\tSeleccionaste \"Retroceder\"");
                            default -> System.out.println("\tIngresa una opcion valida.");
                        }
                        ;
                    }
                }
                case 3 -> {
                    Triangulo figura = new Triangulo();
                    while (opcionOperacion != 4) {
                        imprimirMenuOperaciones();
                        opcionOperacion = pedirNumeroEntero("\tIngrese una opcion: ");
                        System.out.println();
                        switch (opcionOperacion) {
                            case 1 -> {
                                double lado1 = pedirNumeroDecimal("\tIngrese lado 1 del trinagulo: ");
                                double lado2 = pedirNumeroDecimal("\tIngrese lado 2 del trinagulo: ");
                                double lado3 = pedirNumeroDecimal("\tIngrese lado 3 del trinagulo: ");
                                figura.setLado1(lado1);
                                figura.setLado2(lado2);
                                figura.setLado3(lado3);
                                System.out.println("\tPerimetro: " + df.format(figura.perimetro()));
                            }
                            case 2 -> {
                                double base = pedirNumeroDecimal("\tIngrese base del trinagulo: ");
                                double altura = pedirNumeroDecimal("\tIngrese altura del triangulo: ");
                                figura.setBase(base);
                                figura.setAltura(altura);
                                System.out.println("\tArea: " + df.format(figura.area()));
                            }
                            case 3 -> figura.imprimirDatos();
                            case 4 -> System.out.println("\tSeleccionaste \"Retroceder\"");
                            default -> System.out.println("\tIngresa una opcion valida.");
                        }
                        ;
                    }
                }
                case 4 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
        }
        sc.close();

    }

    public static void imprimirMenuPrincipal() {
        System.out.println();
        System.out.println("MENU DE FIGURAS");
        System.out.println("===============");
        System.out.println("1. Circulo");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Salir");
    }

    public static void imprimirMenuOperaciones() {
        System.out.println();
        System.out.println("\tMENU DE OPERACIONES");
        System.out.println("\t===================");
        System.out.println("\t1. Perimetro");
        System.out.println("\t2. Area");
        System.out.println("\t3. Informacion");
        System.out.println("\t4. Retroceder");
    }

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
}
