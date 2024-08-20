package FigurasGeometricas.Modelos;

import java.text.DecimalFormat;

public class Circulo {
    private final DecimalFormat df = new DecimalFormat("#.00");

    /*
     * 3. Define 2 atributos para la clase del tipo private: ancho y alto. Pueden
     * ser numeros decimales o enteros.
     */
    private double radio;

    /*
     * 4. Diseña 2 constructores, uno con todos los parametros y otro sin
     * parametros.
     */

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    /*
     * 5. Crea los metodos getter y setter de todos los atributos de la clase.
     */
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double ancho) {
        this.radio = ancho;
    }

    /*
     * 6. Implementa un metodo llamado 'area()' y otro metodo llamado 'perimetro()',
     * responsables de calcular el area y el perimetro del rectangulo,
     * respectivamente.
     */
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    public double perimetro() {
        return 2 * Math.PI * getRadio();
    }

    /*
     * 7. Implementa un metodo para imprimir los datos de dicha figura.
     */
    public void imprimirDatos() {
        System.out.println("\tRadio: " + df.format(getRadio()));
        System.out.println("\tArea: " + df.format(area()));
        System.out.println("\tPerimetro: " + df.format(perimetro()));
    }

}