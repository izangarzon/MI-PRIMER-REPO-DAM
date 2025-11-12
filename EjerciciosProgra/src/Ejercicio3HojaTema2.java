
import java.util.*;

public class Ejercicio3HojaTema2 {

    public static void main(String[] args) {
        int salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca su salario");
        salario= sc.nextInt();
        if (salario<1000 && salario >0){
            System.out.println("MUY MALO");
            
        }else {
            if(salario <1500 && salario >= 1000){
                System.out.println("MALO");
            }else{
                if (salario<3000 && salario >= 1500){
                    System.out.println("BUENO");
                }else{
                    if (salario>=3000){
                        System.out.println("MUY BUENO");
                    }else {
                        System.out.println("Eso no es un salario");
                    }
                }
            }
        }
        
        
        
    }
}
