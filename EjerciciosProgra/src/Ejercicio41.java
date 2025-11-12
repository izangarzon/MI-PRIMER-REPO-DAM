
import java.util.Scanner;

public class Ejercicio41 {

    static void eco(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("Eco...");
        }
    }

    public static void main(String[] args) {
        System.out.println("Itroduzca un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        eco(n);
    }

}
