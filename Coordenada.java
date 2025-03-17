import java.util.ArrayList;
import java.util.Scanner;

class Coordenada {
    private double x, y;

    public Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double distancia(Coordenada c) {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

