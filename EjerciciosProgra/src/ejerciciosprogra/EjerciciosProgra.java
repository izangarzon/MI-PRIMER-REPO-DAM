package ejerciciosprogra;

import java.util.*;

public class EjerciciosProgra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un dia de la semana(1 al 7)");
        int num = sc.nextInt();
        switch (num) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sabado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("Numero no valido");

        }

    }

}
