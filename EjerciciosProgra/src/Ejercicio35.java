
import java.util.Scanner;

public class Ejercicio35 {

    public static void main(String[] args) {
        int operador1, operador2, resultado, sumas;
        sumas = 0;
        do {
            operador1= (int) (Math.random()*100+1);
            operador2= (int) (Math.random()*100+1);
            System.out.println(operador1+" + "+operador2+" = ");
            Scanner sc = new Scanner (System.in);
            resultado= sc.nextInt();
            sumas= sumas+1;
        }while (resultado==operador1+operador2);
        System.out.println("Has respondido bien "+(sumas-1)+" sumas consecutivas");
    }

}
