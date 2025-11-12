
import java.util.Scanner;

public class Ejercicio46 {

    static boolean primo(int num){
        boolean primo= true;
        int i=2;
        if (num<2){
            primo=false;
        }
        while (i<num && primo==true){
            if (num%i==0){
                primo=false;
            }
            i++;
        }
        return (primo);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un numero: ");
        int num= sc.nextInt();
        System.out.println("El numero es primo, "+primo(num) );
    }
    
}
