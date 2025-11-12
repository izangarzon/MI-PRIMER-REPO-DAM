
import java.util.Scanner;

public class Ejercicio20HojaTema3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 1) {
            if (i == 5) {
                continue;
            }
            for (int b = 0; b <= 10; b += 1) {
                System.out.println(i + " x " + b + " = " + i * b);
            }
        }

    }

}
