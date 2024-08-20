package PuntoXY;

import java.text.DecimalFormat;

import PuntoXY.Modelos.Punto;

public class Main {
    static Punto[] puntos = new Punto[3];
    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {
        // Crear instancias de puntos
        puntos[0] = new Punto();
        puntos[0].setPuntoX(1);
        puntos[0].setPuntoY(2);

        puntos[1] = new Punto();
        puntos[1].setPuntoX(4);
        puntos[1].setPuntoY(6);

        puntos[2] = new Punto();
        puntos[2].setPuntoX(7);
        puntos[2].setPuntoY(10);

        System.out.println("Distancia desde el origen al primer punto: " + df.format(puntos[0].distanciaDesdeOrigen()));

        System.out
                .println("Distancia entre el primer y segundo punto: "
                        + df.format(Punto.calcularDistancia(puntos[0], puntos[1])));

        boolean alineados = Punto.estanAlineados(puntos[0], puntos[1], puntos[2]);
        System.out.println("¿Estan los puntos alineados? " + (alineados ? "Si" : "No"));
    }
}
