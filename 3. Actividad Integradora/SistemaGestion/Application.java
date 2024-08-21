package SistemaGestion;

import java.util.ArrayList;
import java.util.List;

import SistemaGestion.Helper.Utility;
import SistemaGestion.Modelos.Empleado;
import SistemaGestion.Negocio.EmpleadoBussines;

public class Application {
    private static final EmpleadoBussines empleadoBussines = new EmpleadoBussines();
    private static List<Empleado> empleadosFiltro = new ArrayList<>();
    private static List<Empleado> empleados = new ArrayList<>();


    public static void main(String[] args) {
        inicializarEmpleados();
        int opcion;

        do {
            imprimirMenu();
            opcion = Utility.pedirNumeroEntero("Ingrese una opcion: ");
            procesarOpcion(opcion);
        } while (opcion != 7);

        Utility.sc.close();
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> empleadoBussines.mostrarEmpleados(empleadosFiltro);
            case 2 -> crearEmpleado();
            case 3 -> filtrarEmpleados();
            case 4 -> ordenarEmpleados();
            case 5 -> incrementarSalario();
            case 6 -> limpiarFiltros();
            case 7 -> System.out.println("\nSeleccionaste \"Salir\"");
            default -> System.out.println("\nIngresa una opcion valida.");
        }
    }

    private static void inicializarEmpleados() {
        agregarEmpleado(new Empleado("Juan", 30, 30000, "Informatica"));
        agregarEmpleado(new Empleado("Maria", 40, 40000, "Logistica"));
        agregarEmpleado(new Empleado("Pedro", 25, 25000, "Informatica"));
        agregarEmpleado(new Empleado("Ana", 35, 35000, "Finanzas"));
    }

    private static void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        empleadosFiltro.add(empleado);
    }

    private static void imprimirMenu() {
        System.out.println();
        System.out.println("""
        SISTEMA DE GESTION
        ==================
        1. Mostrar todos los empleados
        2. Crear empleado
        3. Filtrar empleados
        4. Ordenar empleados
        5. Incrementar salario
        6. Limpiar filtros
        7. Salir""");
    }

    private static void imprimirOpcionesCriterio() {
        System.out.println();
        System.out.println("""
        ¿Por cual atributo deseas filtrar/ordenar?
        1. Nombre
        2. Edad
        3. Salario
        4. Departamento""");
    }

    private static void crearEmpleado() {
        System.out.println();
        String nombre = Utility.pedirTexto("Ingrese el nombre del empleado: ");
        if (empleadoBussines.buscarPorNombre(empleados, nombre) != null) {
            System.out.println("Error: Ya existe un empleado con ese nombre.");
            return;
        }

        int edad = Utility.pedirNumeroEntero("Ingrese la edad: ");
        double salario = Utility.pedirNumeroDecimal("Ingrese el salario: ");
        String departamento = Utility.pedirTexto("Ingrese el departamento: ");

        Empleado nuevoEmpleado = new Empleado(nombre, edad, salario, departamento);
        agregarEmpleado(nuevoEmpleado);

        System.out.println("Empleado creado exitosamente.");
    }

    private static void filtrarEmpleados() {
        imprimirOpcionesCriterio();
        int criterio = Utility.pedirNumeroEntero("Ingrese un criterio de filtro: ");
        System.out.println();
        empleadosFiltro = aplicarFiltro(criterio);
        empleadoBussines.mostrarEmpleados(empleadosFiltro);
    }

    private static List<Empleado> aplicarFiltro(int criterio) {
        switch (criterio) {
            case Utility.CRITERIO_NOMBRE -> {
                String nombre = Utility.pedirTexto("Ingrese el nombre a filtrar: ");
                return empleadoBussines.filtrarEmpleado(empleados, criterio, nombre, 0, 0);
            }
            case Utility.CRITERIO_EDAD -> {
                int edadMinima = Utility.pedirNumeroEntero("Ingrese la edad minima: ");
                int edadMaxima = Utility.pedirNumeroEntero("Ingrese la edad maxima: ");
                return empleadoBussines.filtrarEmpleado(empleados, criterio, "", edadMinima, edadMaxima);
            }
            case Utility.CRITERIO_SALARIO -> {
                double salarioMinimo = Utility.pedirNumeroDecimal("Ingrese el salario minimo: ");
                double salarioMaximo = Utility.pedirNumeroDecimal("Ingrese el salario maximo: ");
                return empleadoBussines.filtrarEmpleado(empleados, criterio, "", salarioMinimo, salarioMaximo);
            }
            case Utility.CRITERIO_DEPARTAMENTO -> {
                String departamento = Utility.pedirTexto("Ingrese el departamento a filtrar: ");
                return empleadoBussines.filtrarEmpleado(empleados, criterio, departamento, 0, 0);
            }
            default -> {
                System.out.println("Opcion no valida.");
                return empleadosFiltro;
            }
        }
    }

    private static void ordenarEmpleados() {
        imprimirOpcionesCriterio();
        int criterio = Utility.pedirNumeroEntero("Ingrese un criterio de ordenamiento: ");
        System.out.println();
        empleadosFiltro = empleadoBussines.ordenarEmpleados(empleadosFiltro, criterio);
        empleadoBussines.mostrarEmpleados(empleadosFiltro);
    }

    private static void incrementarSalario() {
        System.out.println();
        String nombre = Utility.pedirTexto("Ingrese el nombre del empleado: ");
        Empleado empleado = empleadoBussines.buscarPorNombre(empleados, nombre);

        if (empleado == null) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        double porcentaje = Utility.pedirNumeroDecimal("Ingrese el porcentaje de aumento: ");
        empleadoBussines.incrementarSalario(empleado, porcentaje);
        System.out.println("Salario incrementado exitosamente.");
    }

    public static void limpiarFiltros() {
        empleadosFiltro = new ArrayList<>(empleados);
        System.out.println("\nFiltros limpiados. Se ha restaurado la lista original.");
    }
}