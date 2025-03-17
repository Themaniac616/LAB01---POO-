import java.util.ArrayList;
import java.util.Scanner;

class ContainerRect {
    private ArrayList<Rectangulo> rectangulos;
    private ArrayList<Double> distancias;
    private ArrayList<Double> areas;
    private int capacidad;

    public ContainerRect(int capacidad) {
        this.capacidad = capacidad;
        this.rectangulos = new ArrayList<>();
        this.distancias = new ArrayList<>();
        this.areas = new ArrayList<>();
    }

    public void addRectangulo(Rectangulo r) {
        if (rectangulos.size() < capacidad) {
            rectangulos.add(r);
            distancias.add(Coordenada.distancia(r.getEsquina1(), r.getEsquina2()));
            areas.add(r.calcularArea());
        } else {
            System.out.println("No se pueden agregar más rectángulos.");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rectangulos.size(); i++) {
            sb.append((i + 1) + " " + rectangulos.get(i) + " Distancia: " + distancias.get(i) + " Área: " + areas.get(i) + "\n");
        }
        return sb.toString();
    }
}

