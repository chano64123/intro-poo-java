package FigurasGeometricas.Modelos;

import java.text.DecimalFormat;

public class Rectangulo {
    private final DecimalFormat df = new DecimalFormat("#.00");

    /*
     * 3. Define 2 atributos para la clase del tipo private: ancho y alto. Pueden
     * ser numeros decimales o enteros.
     */
    private double ancho;
    private double alto;

    /*
     * 4. Diseña 2 constructores, uno con todos los parametros y otro sin
     * parametros.
     */

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo() {
    }

    /*
     * 5. Crea los metodos getter y setter de todos los atributos de la clase.
     */
    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    /*
     * 6. Implementa un metodo llamado 'area()' y otro metodo llamado 'perimetro()',
     * responsables de calcular el area y el perimetro del rectangulo,
     * respectivamente.
     */
    public double area() {
        return getAlto() * getAncho();
    }

    public double perimetro() {
        return 2 * (getAlto() + getAncho());
    }

    /*
     * 7. Implementa un metodo para imprimir los datos de dicha figura.
     */
    public void imprimirDatos() {
        System.out.println("\tAlto: " + df.format(getAlto()));
        System.out.println("\tAncho: " + df.format(getAncho()));
        System.out.println("\tArea: " + df.format(area()));
        System.out.println("\tPerimetro: " + df.format(perimetro()));
    }

}