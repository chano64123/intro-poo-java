package EjercicioComplementario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import EjercicioComplementario.Modelos.Libro;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Libro> libros = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 4) {
            imprimirMenu();
            opcion = pedirNumeroEntero("Ingrese una opcion: ");
            System.out.println();
            switch (opcion) {
                case 1 -> agregarLibro();
                case 2 -> mostrarDetalles();
                case 3 -> imprimirTitulos();
                case 4 -> System.out.println("Seleccionaste \"Salir\"");
                default -> System.out.println("Ingresa una opcion valida.");
            }
        }
        sc.close();
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

    public static void imprimirMenu() {
        System.out.println();
        System.out.println("MENU DE FIGURAS");
        System.out.println("===============");
        System.out.println("1. Agregar un libro");
        System.out.println("2. Mostrar detalles de un libro");
        System.out.println("3. Listar todos los titulos");
        System.out.println("4. Salir");
    }

    public static void agregarLibro() {
        Libro libro = new Libro();
        libro.setTitulo(pedirTexto("Ingrese el titulo del libro: "));
        libro.setAutor(pedirTexto("Ingrese el autor del libro: "));
        int numero = pedirNumeroEntero("Ingrese un numero para calcular la cantidad de paginas: ");
        libro.calcularNumeroDePaginas(numero);
        libros.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    public static void mostrarDetalles() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros disponibles.\n");
            return;
        }

        int indice = pedirNumeroEntero("Ingrese el indice del libro (1 - " + (libros.size()) + "): ");
        indice--;
        if (indice >= 0 && indice < libros.size()) {
            libros.get(indice).imprimirDetalles();
        } else {
            System.out.println("Indice no valido.");
        }
    }

    public static void imprimirTitulos() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        int i = 1;
        for (Libro libro : libros) {
            System.out.println(i + "." + libro.getTitulo());
            i++;
        }
    }
}
