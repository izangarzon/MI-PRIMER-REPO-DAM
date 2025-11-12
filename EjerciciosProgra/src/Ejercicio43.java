
import java.util.Scanner;

public class Ejercicio43 {

    static void cilindro(double radio, double altura, int opcion) {
        double volumen, area;
        switch (opcion) {
            case 1 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es: " + volumen);
            }
            case 2 -> {
                area = Math.PI * 2 * radio * (altura + radio);
                System.out.println("El area es de: " + area);
            }
            default ->
                System.out.println("El indicador es incorrecto");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca radio: ");
        double radio = sc.nextDouble();
        System.out.println("Introduzca altura: ");
        double altura = sc.nextDouble();
        System.out.println("introduzca 1 para cxalcular el volumen y 2 para el area");
        int operacion = sc.nextInt();
        System.out.println("");
        cilindro(radio, altura, operacion);
    }

}
