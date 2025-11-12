
import java.util.Scanner;

public class Ejercicio11HojaTema3 {

    public static void main(String[] args) {
        int suma, num, media;
        suma = 0;
        System.out.println("Dime el primer numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i < 10; i = i+ 1) {
            System.out.println("Escribe el numero nº " + (i+1) + ": ");
            num = sc.nextInt();
            suma = suma + num;
        }
        media = suma / 10;
        System.out.println("la media de tus numeros es :" + media);
    }

}
