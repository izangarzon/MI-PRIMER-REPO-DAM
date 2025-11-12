
import java.util.Scanner;

public class Ejercicio13HojaTema3 {

    public static void main(String[] args) {
        int num, suma;
        suma = 0;
        System.out.println("Dime un numero y te digo la suma de los impares menores: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i <= num; i = i + 1) {
            if (i % 2 != 0) {
                suma = suma + i;
                System.out.println(suma);
            }
        }
        System.out.println("La suma de los numeros impares menores que " + num + " es: " + suma);
    }

}
