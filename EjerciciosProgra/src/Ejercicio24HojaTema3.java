
import java.util.Scanner;

public class Ejercicio24HojaTema3 {

    public static void main(String[] args) {
        int num, cont;
        cont = 0;
        while (cont >= 0) {
            num = (int) (Math.random() * 30 + 1);
            if (num == 15) {
                break;
            } else {
                if (num <= 20 && num >= 10) {
                    continue;
                } else {
                    System.out.print(num + "\t");
                }
            }
            cont = cont + 1;
            if (cont % 5 == 0) {
                System.out.println("");
            }
        }
        System.out.println("Han generado "+cont+" numeros");
    }
}
