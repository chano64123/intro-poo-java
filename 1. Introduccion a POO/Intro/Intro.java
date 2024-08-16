package Intro;

public class Intro {
    public static void main(String[] args) {
                /*
         * Clase Persona
         */
        System.out.println("Ejemplo de la clase Persona");
        System.out.println("---------------------------");
        Persona persona1 = new Persona("Jose", 24);
        persona1.imprimirDatos();
        Persona persona2 = new Persona("Moises",  30);
        persona2.imprimirDatos();

        /*
         * Clase Auto
         */
        System.out.println("Ejemplo de la clase Auto");
        System.out.println("------------------------");
        Auto auto1 = new Auto("Toyota", "Desconocido", 2015);
        Auto auto2 = new Auto("BMW", "No se");
        Auto auto3 = new Auto("Ferrari");
        Auto auto4 = new Auto();
        System.out.println("Objeto 1:");
        auto1.imprimirDatos();
        System.out.println("Objeto 2:");
        auto2.imprimirDatos();
        System.out.println("Objeto 3:");
        auto3.imprimirDatos();
        System.out.println("Objeto 4:");
        auto4.imprimirDatos();
    }
}
