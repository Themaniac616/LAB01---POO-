import java.util.ArrayList;
import java.util.Scanner;

class Verificador {
    public static int determinarCaso(Rectangulo r1, Rectangulo r2) {
        Coordenada e1A = r1.getEsquina1();
        Coordenada e2A = r1.getEsquina2();
        Coordenada e1B = r2.getEsquina1();
        Coordenada e2B = r2.getEsquina2();
        
        boolean seSobreponen = !(e2A.getX() < e1B.getX() || e1A.getX() > e2B.getX() ||
                                 e2A.getY() < e1B.getY() || e1A.getY() > e2B.getY());
        if (seSobreponen) return 1;
        
        boolean estanJuntos = (e2A.getX() == e1B.getX() || e1A.getX() == e2B.getX() ||
                               e2A.getY() == e1B.getY() || e1A.getY() == e2B.getY());
        if (estanJuntos) return 2;
        
        return 3;
    }
}