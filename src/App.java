import java.util.Scanner;

import net.salesianos.figurasgeometricas.Circulo;
import net.salesianos.figurasgeometricas.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- MENU U5 T3 ACTIVIDADES ABSTRACTAS E INTERFACES ---");
            System.out.println("1. Calculo de figuras geometricas");
            System.out.println("0. Salir");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("--- CALCULO DE FIGURAS GEOMETRICAS ---");

                    System.out.println("Introduce la base del rectangulo: ");
                    double baseRectangulo = scanner.nextDouble();

                    System.out.println("Introduce la altura del rectangulo: ");
                    double alturaRectangulo = scanner.nextDouble();

                    Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);

                    System.out.println("--- Informacion del Rectangulo ---");
                    System.out.println("Base introducida: " + rectangulo.getBase());
                    System.out.println("Altura introducida: " + rectangulo.getAltura());
                    System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
                    System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());

                    System.out.println();

                    System.out.println("Introduce el radio del circulo: ");
                    double radioCirculo = scanner.nextDouble();

                    Circulo circulo = new Circulo(radioCirculo);

                    System.out.println("--- Informacion del Circulo ---");
                    System.out.println("Radio introducido: " + circulo.getRadio());
                    System.out.println("Area del circulo: " + circulo.calcularArea());
                    System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

                    System.out.println();

                    break;

                    case 0:

                    System.out.println("Saliendo del programa");

                    break;

                default:

                    System.out.println("La opcion no es valida. Vuelve a intentarlo.");
                    System.out.println();

                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
