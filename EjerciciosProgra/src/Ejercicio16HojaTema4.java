
import java.util.Scanner;

public class Ejercicio16HojaTema4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una base de una potencia: ");
        int a = sc.nextInt();
        System.out.println("Dime un exponente de una potencia: ");
        int b = sc.nextInt();
        System.out.println("El resultado es: " + potencia(a, b));
    }

    static int potencia(int a, int b) {
        int c = a;
        while (b > 1) {
            c = c * a;
            b=b-1;
            potencia(a, b - 1);
        }
        return (c);
    }

}
