package FigurasGeometricas.Modelos;

import java.text.DecimalFormat;

public class Triangulo {
    private final DecimalFormat df = new DecimalFormat("#.00");

    /*
     * 3. Define 2 atributos para la clase del tipo private: ancho y alto. Pueden
     * ser numeros decimales o enteros.
     */
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    /*
     * 4. Diseña 2 constructores, uno con todos los parametros y otro sin
     * parametros.
     */

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo() {
    }

    /*
     * 5. Crea los metodos getter y setter de todos los atributos de la clase.
     */
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return this.lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return this.lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /*
     * 6. Implementa un metodo llamado 'area()' y otro metodo llamado 'perimetro()',
     * responsables de calcular el area y el perimetro del rectangulo,
     * respectivamente.
     */
    public double area() {
        return (getAltura() * getBase()) / 2;
    }

    public double perimetro() {
        return getLado1() + getLado2() + getLado3();
    }

    /*
     * 7. Implementa un metodo para imprimir los datos de dicha figura.
     */
    public void imprimirDatos() {
        System.out.println("\tBase: " + df.format(getBase()));
        System.out.println("\tAltura: " + df.format(getAltura()));
        System.out.println("\tArea: " + df.format(area()));
        System.out.println("\t---------------------------------");
        System.out.println("\tLado 1: " + df.format(getLado1()));
        System.out.println("\tLado 2: " + df.format(getLado2()));
        System.out.println("\tLado 3: " + df.format(getLado3()));
        System.out.println("\tPerimetro: " + df.format(perimetro()));
    }

}