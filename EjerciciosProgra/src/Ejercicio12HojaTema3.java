
import java.util.Scanner;

public class Ejercicio12HojaTema3 {

    public static void main(String[] args) {
        int num;
        System.out.println("Dime un numero y te digo su tabla de multiplicar: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

}
