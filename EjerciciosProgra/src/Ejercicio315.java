
import java.util.Scanner;

public class Ejercicio315 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el tamaño del lado del triangulo: ");
        int num = sc.nextInt();
        for (int fila = 1; fila <= num; fila = fila + 1) {
            for (int col = fila; col <= num; col = col + 1) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
