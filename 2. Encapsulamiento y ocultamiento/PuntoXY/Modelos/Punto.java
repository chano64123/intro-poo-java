package PuntoXY.Modelos;

public class Punto {
    /*
     * 2. Define 2 atributos para la clase del tipo private: x e y que representan
     * las coordenadas del punto.
     */
    private double puntoX;
    private double puntoY;

    /*
     * 3. Crea los metodos getter y setter de todos los atributos de la clase.
     */
    public double getPuntoX() {
        return this.puntoX;
    }

    public void setPuntoX(double puntoX) {
        this.puntoX = puntoX;
    }

    public double getPuntoY() {
        return this.puntoY;
    }

    public void setPuntoY(double puntoY) {
        this.puntoY = puntoY;
    }

    /*
     * 4. Crea un metodo de instancia llamado 'distanciaDesdeOrigen', que calcula y
     * devuelve la distancia del punto desde el origen (0,0).
     */

    public double distanciaDesdeOrigen() {
        double deltaX = getPuntoX() - 0;
        double deltaY = getPuntoY() - 0;
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    /*
     * 5. Crea un metodo para calculos entre puntos, estatico, llamado
     * 'calcularDistancia' en la clase 'Punto'. Este metodo recibe dos objetos de la
     * misma clase y calcula la distancia entre ellos.
     */
    public static double calcularDistancia(Punto punto1, Punto punto2) {
        double deltaX = punto2.getPuntoX() - punto1.getPuntoX();
        double deltaY = punto2.getPuntoY() - punto1.getPuntoY();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    /*
     * 6. Crea un metodo estatico para calculos entre puntos, llamado
     * 'estanAlineados' en la clase 'Punto'. Este metodo recibe tres objetos de la
     * clase 'Punto' y determina si los puntos dados estan alineados en la misma
     * recta
     */
    public static boolean estanAlineados(Punto punto1, Punto punto2, Punto punto3) {
        return (punto2.getPuntoY() - punto1.getPuntoY())
                * (punto3.getPuntoX() - punto2.getPuntoX()) == (punto3.getPuntoY() - punto2.getPuntoY())
                        * (punto2.getPuntoX() - punto1.getPuntoX());
    }
}
