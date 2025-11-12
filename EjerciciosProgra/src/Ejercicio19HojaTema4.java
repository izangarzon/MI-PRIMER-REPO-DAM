
import java.util.Scanner;

public class Ejercicio19HojaTema4 {

    public static void main(String[] args) {
        int opcion;
        int cont = 0;
        double suma = 0;
        do {
            opcion = escribeMenu();

            
            switch (opcion) {
                case 1 -> {
                    double valor = (agregarVenta());
                    System.out.println("Venta registrada");
                    suma = suma + valor;
                    cont = cont + 1;
                }
                case 2 ->totalVentas(suma);
                case 3 ->numeroVentas(cont);
                case 4 ->System.out.println("FIN DEL PROGRAMA");
                default ->System.out.println("\nOpcion no valida");
            }

            System.out.println();
        } while (opcion != 4);
    }

    static int escribeMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== MENÚ DE REGISTRO DE VENTAS ====");
        System.out.println("1. Añadir nueva venta");
        System.out.println("2. Ver total de ventas");
        System.out.println("3. Ver número de ventas");
        System.out.println("4. Salir del programa");
        System.out.print("Elige una opción: ");

        return sc.nextInt();
    }

    static double agregarVenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor de la venta: ");
        double a = sc.nextDouble();
        while (a < 0) {
            System.out.println("numero no valido");
            System.out.println("Dime otro valor de la venta: ");
            a = sc.nextDouble();
        }
        return (a);
    }

    static void totalVentas(double a) {
        System.out.println("El total acumulado de venta es: " + a);
    }

    static void numeroVentas(int a) {
        System.out.println("Se han registrado " + a + " ventas");
    }

}
