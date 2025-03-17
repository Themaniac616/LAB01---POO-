import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerRect contenedor = new ContainerRect(5);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una esquina del rectángulo:");
            double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
            System.out.println("Ingrese la esquina opuesta del rectángulo:");
            double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();

            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            contenedor.addRectangulo(rect);
        }

        contenedor.mostrarRectangulos();
        scanner.close();
    }
}
