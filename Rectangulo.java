import java.util.ArrayList;
import java.util.Scanner;

class Rectangulo {
    private Coordenada esquina1, esquina2;

    public Rectangulo(Coordenada c1, Coordenada c2) {
        this.esquina1 = c1;
        this.esquina2 = c2;
    }

    public double calcularArea() {
        double base = Math.abs(esquina1.getX() - esquina2.getX());
        double altura = Math.abs(esquina1.getY() - esquina2.getY());
        return base * altura;
    }

    public Coordenada getEsquina1() { return esquina1; }
    public Coordenada getEsquina2() { return esquina2; }

    public String toString() {
        return "Rectangulo: [" + esquina1 + ", " + esquina2 + "]";
    }
}