
import java.util.Scanner;

public class Ejercicio3HojaTema3 {

    public static void main(String[] args) {
        int numero1, numero2, opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dos números enteros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("Elija una de las opciones");
        opcion = sc.nextInt();

        if (opcion ==3){
            numero1= numero1*numero2;
            System.out.println("La multiplicavión es: "+numero1);
        }else {
            if (opcion ==2){
                numero1= numero1-numero2;
                System.out.println("La resta de los numeros es: "+numero1);
            }else{
                if (opcion ==1){
                    numero1= numero1+numero2;
                    System.out.println("La suma de los numeros es: "+numero1);
                }else {
                    System.out.println("no es una opción valida");
                }
            }
        }

    }

}
