
import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        int num, secreto;
        secreto = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina un numero del 1 al 100");
        num = sc.nextInt();
        while (num != -1 && secreto != num) {
            if (num < secreto) {
                System.out.println("Mayor");
            } else {
                System.out.println("Menor");
            }
            System.out.println("Escribe otro numero, si te rindes escribe -1");
            num = sc.nextInt();

        }
        if (num == secreto) {
            System.out.println("Enhorabuena el numero era: " + secreto);
        } else {
            System.out.println("Otra vez será");
        }
    }

}
