
import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        int suma, contador, edad, mayor;
        double media;
        contador=0;
        mayor=0;
        suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la primera edad");
        edad = sc.nextInt();
        while (edad > 0) {
            suma = suma + edad;
            contador = contador+1;
            if (edad > 17) {
                mayor = mayor+1;
            }
            System.out.println("introduzca la siguiente edad, si ya ha acabado ponga una negativa");
            edad = sc.nextInt();
        }
        media =(double) suma / contador;
        System.out.println("La suma de todas las edades es: " + suma + " años");
        System.out.println("la media de edad es de: " + media + " años");
        System.out.println("El numero de alumnos son: " + contador + " alumnos");
        System.out.println("hay un total de: " + mayor + "mayores de edad");

    }

}
