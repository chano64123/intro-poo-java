package Static;

public class Rectangulo {
    /*
     * 2. Define 2 atributos para la clase: ancho y alto. Pueden ser números
     * decimales
     * o enteros.
     */
    private double alto;
    private double ancho;

    /*
     * 3. Define un atributo de tipo entero, 'contadorRectangulos', que sea estático
     * y
     * que lleve un registro del número total de instancias de 'Rectangulo' creadas.
     */
    private static int contadorRectangulo = 0;

    /*
     * 4. Diseña un constructor con argumentos que inicialice los valores del
     * 'ancho' y
     * 'alto', y que incremente en uno el valor de 'contadorRectangulos'.
     */
    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
        if (alto != 0 && ancho != 0) {
            contadorRectangulo++;
        }
    }

    /*
     * 5. Implementa un método llamado 'area()' y otro método llamado 'perimetro()',
     * responsables de calcular el área y el perímetro del rectángulo,
     * respectivamente.
     */
    public double area() {
        return alto * ancho;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    /*
     * 6. Implementa un método llamado imprimirArea para mostrar el resultado por
     * consola;
     */
    public void imprimirArea() {
        System.out.println("El area del rectangulo es: " + area());
    }
    /*
     * Implementa un método llamado imprimirPerimetro para mostrar el resultado por
     * consola;
     */

    public void imprimirPerimetro() {
        System.out.println("El area del rectangulo es: " + perimetro());
    }

    /*
     * Implementa un método estático que permita obtener el número total de
     * rectángulos creados hasta el momento.
     */
    public static void imprimirTotalRectangulos(){
        System.out.println("La cantidad de rectangulos creados es: " + contadorRectangulo);
    }
}
