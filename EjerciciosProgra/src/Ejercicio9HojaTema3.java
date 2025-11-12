
import java.util.Scanner;

public class Ejercicio9HojaTema3 {

    public static void main(String[] args) {
        int num;
        System.out.println("de que numero quieres una cuenta atras: ");
        num = new Scanner(System.in).nextInt();
        for (int i = 0; i <= num; num = num - 1) {
            System.out.println(num);
        }

    }

}
