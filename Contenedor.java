import java.util.ArrayList;
import java.util.Scanner;

class ContainerRect {
    private ArrayList<Rectangulo> rectangulos = new ArrayList<>();
    private ArrayList<Double> distancias = new ArrayList<>();
    private ArrayList<Double> areas = new ArrayList<>();
    private int capacidad;

    public ContainerRect(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addRectangulo(Rectangulo r) {
        if (rectangulos.size() < capacidad) {
            rectangulos.add(r);
            distancias.add(r.getEsquina1().distancia(r.getEsquina2()));
            areas.add(r.calcularArea());
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }

    public void mostrarRectangulos() {
        System.out.println("Rectángulos almacenados:");
        for (int i = 0; i < rectangulos.size(); i++) {
            System.out.println((i + 1) + " " + rectangulos.get(i) + ", Distancia: " + distancias.get(i) + ", Área: " + areas.get(i));
        }
    }
}

