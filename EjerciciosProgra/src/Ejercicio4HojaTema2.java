
import java.util.*;

public class Ejercicio4HojaTema2 {

    public static void main(String[] args) {
        int temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la temperatura de clase: ");
        temperatura = sc.nextInt();
        if (temperatura < 12) {
            System.out.println("MUCHO FRIO");
        } else {
            if (temperatura < 22 && temperatura >= 12) {
                System.out.println("FRIO");
            } else {
                if (temperatura < 32 && temperatura >= 22) {
                    System.out.println("CALOR");
                } else {
                    System.out.println("MUCHO CALOR");
                }
            }
        }

    }
}
