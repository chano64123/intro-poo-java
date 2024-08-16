package Intro;

public class Persona {
    /*
     * 2. Define 2 atributos para la clase: nombre y edad.
     */
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
     * 3. Crea una método llamado imprimirDatos para imprimir la presentación de una
     * persona en consola mostrando sus atributos.
     */
    public void imprimirDatos() {
        System.out.println("Hola mi nombre " + nombre + " y mi edad es " + edad);
    }
}
