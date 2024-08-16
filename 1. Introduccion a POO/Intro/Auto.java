package Intro;

public class Auto {
    /*
     * 2. Define 3 atributos para la clase: marca, modelo y año.
     */
    private String marca;
    private String modelo;
    private int anio;

    /*
     * 3. Crea los siguientes constructores:
     * Constructor que inicialice marca, modelo y año
     * Constructor que inicialice marca y modelo
     * Constructor que inicialice solamente la marca
     * Constructor sin parámetros
     */

    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = 0;
    }

    public Auto(String marca) {
        this.marca = marca;
        this.modelo = "";
        this.anio = 0;
    }

    public Auto() {
    }

    /*
     * 4. Escribe el método “imprimirDatos” dentro de la clase “Auto”,
     * que al ser invocado imprima en consola su marca, modelo y año. Teniendo en
     * cuenta que algunos atributos pueden no ser inicializados, el método “print”
     * debe detectar e imprimir sólo aquellos atributos con valor asignado o mostrar
     * un mensaje en el caso de haber sido inicializado con el constructor sin
     * parámetros.
     */

    public void imprimirDatos() {
        if (!marca.isEmpty()) {
            System.out.println("Marca: " + marca);
        }
        if (!modelo.isEmpty()) {
            System.out.println("Modelo: " + modelo);
        }
        if (anio != 0) {
            System.out.println("Año: " + anio);
        }
        System.out.println("---------------------------------");
    }
}
