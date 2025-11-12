




import java.util.Scanner;

public class Ejercicio213 {

    public static void main(String[] args) {
        int hora, minuto, segundo;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿que hora es?");
        System.out.println("introduzca la hora");
        hora = sc.nextInt();
        System.out.println("introduzca los minutos");
        minuto = sc.nextInt();
        System.out.println("introduzca los segundos");
        segundo = sc.nextInt();
        segundo++;
        if (segundo > 59) {
            segundo = 0;
            minuto++;
        }
        if (minuto > 59) {
            minuto = 0;
            hora++;
        }
        if (hora > 23) {
            hora = 0;
        }
        System.out.println("la hora un segundo mas adelante es " + hora + ":" + minuto + ":" + segundo);
    }

}
