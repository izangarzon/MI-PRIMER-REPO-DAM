
import java.util.*;

public class Ejercicio28 {

    public static void main(String[] args) {
        double a, b, c;
        double x1, x2, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca el primer coeficiente 'a'");
        a = sc.nextDouble();
        System.out.println("introduzca el segundo coeficiente 'b'");
        b = sc.nextDouble();
        System.out.println("introduzca el tercer coeficiente 'c'");
        c = sc.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("no existen soluciones reales");
        } else {
            if (a == 0) {
                System.out.println("no es una ecuacion de segundo grado");
            } else {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("la solucion uno: " + x1);
                System.out.println("la solucion dos: " + x2);

            }
        }

    }

}
