
import java.util.Scanner;

public class Ejercicio10HojaTema3 {

    public static void main(String[] args) {
        int suma, num, media;
        suma = 0;
        System.out.println("Dime hasta que numero quiers saber los multiplos de 7: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i <= num; i = i+ 7) {
            System.out.println(i);
        }
    }

}
