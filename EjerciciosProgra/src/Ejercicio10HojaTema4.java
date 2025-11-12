
import java.util.Scanner;

public class Ejercicio10HojaTema4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera hora y luego sus minutos: ");
        int h1 = sc.nextInt();
        int min1 = sc.nextInt();
        System.out.print("Introduce la segunda hora y luego sus minutos: ");
        int h2 = sc.nextInt();
        int min2 = sc.nextInt();

        System.out.println("La diferencia es: " + diferencia(h1, min1, h2, min2) + " minutos");
    }

    static double diferencia(int a, int b, int c, int d) {
        int minutos;
        int hora;
        if (((a*60)+b)<((c*60)+d)){
            minutos = 60 - b;
            hora = a + 1;
            minutos = minutos + ((c - hora) * 60) + d;
        } else if(((a*60)+b)>((c*60)+d)){
            minutos = 60 - d;
            hora = c + 1;
            minutos = minutos + ((a - hora) * 60) + b;
        }else {
            minutos=0;
        }
        return minutos;
    }
}


