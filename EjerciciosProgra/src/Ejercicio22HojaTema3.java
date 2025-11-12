
import java.util.Scanner;

public class Ejercicio22HojaTema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero para descomponer: ");
        int num = sc.nextInt();
       while (num > 0){
           System.out.println(num % 10);
           num=num/10;
       }
    }
}
