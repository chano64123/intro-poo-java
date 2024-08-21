package SistemaGestion.Negocio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import SistemaGestion.Helper.Utility;
import SistemaGestion.Modelos.Empleado;

public class EmpleadoBussines {
    public void mostrarEmpleados(List<Empleado> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        System.out.println("\nN°\tNombre\t\tEdad\tSalario\t\tDepartamento");
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            System.out.printf("%d\t%s\t\t%d\tS/%s\t%s%n", i + 1, empleado.getNombre(),
                    empleado.getEdad(), Utility.df.format(empleado.getSalario()), empleado.getDepartamento());
        }
    }

    public List<Empleado> filtrarEmpleado(List<Empleado> empleados, int criterio, String valorString, double valorMinimo, double valorMaximo) {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return new ArrayList<>();
        }

        return empleados.stream()
                .filter(empleado -> cumpleCriterio(empleado, criterio, valorString, valorMinimo, valorMaximo))
                .collect(Collectors.toList());
    }

    private boolean cumpleCriterio(Empleado empleado, int criterio, String valorString, double valorMinimo, double valorMaximo) {
        return switch (criterio) {
            case Utility.CRITERIO_NOMBRE -> empleado.getNombre().equalsIgnoreCase(valorString);
            case Utility.CRITERIO_EDAD -> empleado.getEdad() >= valorMinimo && empleado.getEdad() <= valorMaximo;
            case Utility.CRITERIO_SALARIO -> empleado.getSalario() >= valorMinimo && empleado.getSalario() <= valorMaximo;
            case Utility.CRITERIO_DEPARTAMENTO -> empleado.getDepartamento().equalsIgnoreCase(valorString);
            default -> false;
        };
    }

    public List<Empleado> ordenarEmpleados(List<Empleado> empleados, int criterio) {
        Comparator<Empleado> comparator = switch (criterio) {
            case Utility.CRITERIO_NOMBRE -> Comparator.comparing(Empleado::getNombre, String.CASE_INSENSITIVE_ORDER);
            case Utility.CRITERIO_EDAD -> Comparator.comparingInt(Empleado::getEdad);
            case Utility.CRITERIO_SALARIO -> Comparator.comparingDouble(Empleado::getSalario);
            case Utility.CRITERIO_DEPARTAMENTO -> Comparator.comparing(Empleado::getDepartamento, String.CASE_INSENSITIVE_ORDER);
            default -> throw new IllegalArgumentException("Criterio no valido");
        };

        return empleados.stream().sorted(comparator).collect(Collectors.toList());
    }

    public Empleado buscarPorNombre(List<Empleado> empleados, String nombre) {
        return empleados.stream()
                .filter(empleado -> empleado.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        empleado.setSalario(empleado.getSalario() * (1 + porcentaje / 100));
        return empleado;
    }
}
