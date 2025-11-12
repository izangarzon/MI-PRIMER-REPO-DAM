
import java.util.Scanner;

public class Ejercicio44 {

    static int maximo(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else {
            if (a < b) {
                max = b;
            } else {
                max = 0;
            }
        }
        return (max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("El numero mayor es: " + maximo(a, b));
    }
}
